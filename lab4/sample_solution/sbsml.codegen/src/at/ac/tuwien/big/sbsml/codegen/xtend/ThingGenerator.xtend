package at.ac.tuwien.big.sbsml.codegen.xtend

import sbsml.Sensor
import sbsml.Actuator
import sbsml.FogDevice
import sbsml.DataType
import java.util.Collection
import sbsml.Parameter
import sbsml.Thing

import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toClass
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toVar

class ThingGenerator {
	
	public static final String THING_PACKAGE = "thing"
	
	private def dataType(DataType type) {
		return type === DataType.BOOL ? "Boolean" :
			   type === DataType.INT ? "Integer" :
			   "Double" ;
	}
	
	private def requiredUnits(Collection<Parameter> parameters) {
		return parameters.map[p | p.unit.name ].toSet
	}
	
	private def initPorts(Thing thing)
	'''
	«FOR p : thing.ports»
	this.ports.put("«p.name»", «p.singleConnection»);
	this.connections.put("«p.name»", new ArrayList<>());
	«ENDFOR»
	'''
		
	private def getNameImpl()
	'''
	@Override
	public String getName() {
		return name;
	}'''
	
	private def getConnectionsImpl()
	'''
	@Override
	public Map<String, List<Connectable>> getConnections() {
		return connections;
	}
	'''
	
	private def connectImpl(Thing thing)
	'''
	@Override
	public void connect(String port, Connectable connectable) {
		if (ports.get(port) && connections.get(port).size() > 0) {
			throw new ConnectionException("Singleconnection-port " + port + " already in use for " + name);
		}
		
		connections.get(port).add(connectable);
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to «thing.name» " + name + " on port " + port);
	}
	'''
	
	def dispatch generate(String packageName, Sensor sensor)
	'''
	package «packageName».«THING_PACKAGE»;
	
	import java.util.List;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;
	
	import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
	import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
	import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
	import at.ac.tuwien.big.sbsml.codegen.lib.Util;
	
	«FOR u : requiredUnits(sensor.parameters)»
	import «packageName».«UnitGenerator.UNIT_PACKAGE».«toClass(u)»;
	«ENDFOR»
	
	public class «toClass(sensor.name)» implements Connectable {
	
		private String name;
		private Map<String, Boolean> ports = new HashMap<>();
		private Map<String, List<Connectable>> connections = new HashMap<>();
		«FOR p : sensor.parameters»
		private «toClass(p.unit.name)» «toVar(p.name)»;
		private DataSource<«dataType(p.unit.type)»> «toVar(p.name)»DataSource;
		«ENDFOR»
		
		public «toClass(sensor.name)»(String name, «FOR p : sensor.parameters SEPARATOR ','»DataSource<«dataType(p.unit.type)»> «toVar(p.name)»DataSource«ENDFOR») {
			this.name = name;
			«FOR p : sensor.parameters»
			this.«toVar(p.name)»DataSource = «toVar(p.name)»DataSource;
			«ENDFOR»
			«initPorts(sensor)»
		}
				
		«connectionsImpl»
		
		«nameImpl»
		
		«connectImpl(sensor)»
				
		«FOR p : sensor.parameters»
		public void readNext«toClass(p.name)»() {
			«dataType(p.unit.type)» value = «toVar(p.name)»DataSource.next();
			if (value != null) {
				this.«toVar(p.name)» = new «toClass(p.unit.name)»(value);
				System.out.println("    - «p.name»: " + value + "«p.unit.abbreviation»");
			} else {
				 this.«toVar(p.name)» = null;
				 System.out.println("   - «p.name»:" + Util.ANSI_RED + " ❌" + Util.ANSI_BLUE );
			}
			
		}
		
		public «toClass(p.unit.name)» «toVar(p.name)»() {
			return this.«toVar(p.name)»;
		}
		«ENDFOR»
	}
	'''
	
	def dispatch generate(String packageName, Actuator actuator)
	'''
	package «packageName».«THING_PACKAGE»;
	
	import java.util.List;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;
	
	import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
	import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
	import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
	import at.ac.tuwien.big.sbsml.codegen.lib.Util;
	
	«FOR u : requiredUnits(actuator.services.map[s | s.parameters].flatten.toList)»
	import «packageName».«UnitGenerator.UNIT_PACKAGE».«toClass(u)»;
	«ENDFOR»
	
	public class «toClass(actuator.name)» implements Connectable {
	
		private String name;
		private EventLogger eventLogger;
		private Map<String, Boolean> ports = new HashMap<>();
		private Map<String, List<Connectable>> connections = new HashMap<>();
		
		public «actuator.name»(String name, EventLogger eventLogger) {
			this.name = name;
			this.eventLogger = eventLogger;
			«initPorts(actuator)»
		}
		
		«connectionsImpl»
				
		«nameImpl»
		
		«connectImpl(actuator)»
		
		«FOR svc : actuator.services»
		«IF svc.description !== null && svc.description.length > 0»
		/**
		 * «svc.description»
		 «FOR p : svc.parameters»
		 * @param «toVar(p.name)»
		 «ENDFOR»
		 */
		«ENDIF»
		public void «toVar(svc.name)»(«FOR p : svc.parameters SEPARATOR ', '»«toClass(p.unit.name)» «toVar(p.name)»«ENDFOR») {
			List<Object> args = new ArrayList<>();
			«FOR p: svc.parameters»
			args.add(«toVar(p.name)»);
			«ENDFOR»
			eventLogger.log("«svc.name»", args);
			System.out.println(Util.ANSI_RED + "  ▶ " + name + ".«svc.name»«IF svc.parameters.size > 0» with «FOR p : svc.parameters SEPARATOR ', '»" + «p.name».toString() + " «p.name»«ENDFOR»«ENDIF»" + Util.ANSI_RESET);
		}
		
		«ENDFOR»
	}
	
	'''
	
	def dispatch generate(String packageName, FogDevice fogdevice)
	'''
	package «packageName».«THING_PACKAGE»;
	
	import java.util.List;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;
	
	import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
	import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
	import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
	import at.ac.tuwien.big.sbsml.codegen.lib.Util;
		
	public class «toClass(fogdevice.name)» implements Connectable {
	
		private String name;
		private Map<String, ControllerSimulator> controllers = new HashMap<>();
		private Map<String, Boolean> ports = new HashMap<>();
		private Map<String, List<Connectable>> connections = new HashMap<>();
		
		public «fogdevice.name»(String name) {
			this.name = name;
			«initPorts(fogdevice)»
		}
		
		«connectionsImpl»
				
		«nameImpl»
		
		«connectImpl(fogdevice)»
		
		public void addController(String name, ControllerSimulator controller) {
			controllers.put(name, controller);
		}
		
		public void executeControllers() {
			for(Map.Entry<String, ControllerSimulator> kv: controllers.entrySet()) {
				System.out.println(Util.ANSI_ITALIC + name + Util.ANSI_RESET + " executes " + Util.ANSI_BOLD + kv.getKey() + Util.ANSI_RESET);
				kv.getValue().step();
				System.out.println("");
			}
		}
	}
	'''
	
}