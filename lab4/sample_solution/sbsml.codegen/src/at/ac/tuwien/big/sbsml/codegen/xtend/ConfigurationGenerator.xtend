package at.ac.tuwien.big.sbsml.codegen.xtend

import java.util.stream.Collectors
import org.eclipse.xtext.util.Tuples
import sbsml.Actuator
import sbsml.Configuration
import sbsml.DataType
import sbsml.FogDevice
import sbsml.Sensor

import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toClass
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toVar

class ConfigurationGenerator {
	
	public static final String CONFIGURATION_PACKAGE = "config"
	
	private def getRequiredThings(Configuration config) {
		return config.nodes.map[ n | n.thing.name ].toSet
	}
		
	private def dataType(DataType type) {
		return type === DataType.BOOL ? "Boolean" :
			   type === DataType.INT ? "Integer" :
			   "Double" ;
	}
			
	private def getRequiredDataSources(Configuration config) {
		config.nodes.filter[ n | n.thing instanceof Sensor ].map[ n |  
			(n.thing as Sensor).parameters.map[ p | Tuples.create(dataType(p.unit.type), n.name + p.name)] 			
		].flatten.toList
	}
	
	def generate(String packageName, Configuration config)
	'''
	package «packageName».«CONFIGURATION_PACKAGE»;
	
	import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
	import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
	import at.ac.tuwien.big.sbsml.codegen.lib.Util;
	
	«FOR t: getRequiredThings(config)»
	import «packageName».«ThingGenerator.THING_PACKAGE».«toClass(t)»;
	«ENDFOR»
	
	«FOR c : config.controllers»
	import «packageName».«ControllerGenerator.CONTROLLER_PACKAGE».«toClass(c.name)»;
	«ENDFOR»
		
	public class «toClass(config.name)» {
	
		«FOR n : config.nodes»
		private «toClass(n.thing.name)» «toVar(n.name)»;
		«ENDFOR»
		
		public «config.name»(EventLogger eventLogger«IF config.nodes.filter[ n | n.thing instanceof Sensor ].size > 0», «FOR t : getRequiredDataSources(config) SEPARATOR ', '»DataSource<«t.first»> «toVar(t.second)»DataSource«ENDFOR»«ENDIF») {
			// init
			«FOR n : config.nodes»
			«toVar(n.name)» = new «toClass(n.thing.name)»("«n.name»"«IF !(n.thing instanceof FogDevice)», «ENDIF»«IF n.thing instanceof Actuator»eventLogger«ELSEIF n.thing instanceof Sensor»«FOR p : (n.thing as Sensor).parameters SEPARATOR ', '»«toVar(n.name + p.name)»DataSource«ENDFOR»«ENDIF»);
			«ENDFOR»
			
			// connect
			«FOR c : config.connections»
			«toVar(c.nodeA.name)».connect("«c.portA.name»", «toVar(c.nodeB.name)»);
			«toVar(c.nodeB.name)».connect("«c.portB.name»", «toVar(c.nodeA.name)»);
			«ENDFOR»
			
			// controllers
			«FOR c : config.controllers»
			«toVar(c.computationNode.name)».addController("«c.name»", new «toClass(c.name)»(«toVar(c.computationNode.name)»));
			«ENDFOR»
		}
		
		public void step() {
			// fetch sensor data
			System.out.println(Util.ANSI_BLUE + "«config.name» Sensor Values:");
			«FOR n : config.nodes.filter[ n | n.thing instanceof Sensor ]»
			System.out.println(Util.ANSI_ITALIC +"  «n.name»" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
			«FOR p : (n.thing as Sensor).parameters»
			«toVar(n.name)».readNext«toClass(p.name)»();
			«ENDFOR»
			«ENDFOR»
			
			System.out.println(Util.ANSI_RESET);
			
			//execute controllers
			«FOR n : config.controllers.map[ c | toVar(c.computationNode.name) ].toList.stream.distinct.collect(Collectors.toList)»
			«n».executeControllers();
			«ENDFOR»
		}
		
	}
	'''
	
}