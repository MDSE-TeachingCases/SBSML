package at.ac.tuwien.big.sbsml.codegen.xtend

import java.util.stream.Collectors
import java.util.stream.Stream
import sbsml.BoolThreshold
import sbsml.Comparator
import sbsml.Controller
import sbsml.FloatThreshold
import sbsml.IntThreshold
import sbsml.Threshold

import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toClass
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toVar

class ControllerGenerator {
	
	public static final String CONTROLLER_PACKAGE = "controller"
		
	private def getComparator(Threshold threshold) {
		if (threshold instanceof BoolThreshold) {
			return "==";
		} else if (threshold instanceof IntThreshold) {
			return (threshold as IntThreshold).comperator == Comparator.GREATER ? ">" : "<"; 
		}
		return (threshold as FloatThreshold).comperator == Comparator.GREATER ? ">" : "<";
	}
	
	private def getThresholdValue(Threshold threshold) {
		if (threshold instanceof BoolThreshold) {
			return (threshold as BoolThreshold).triggerOn
		} else if (threshold instanceof IntThreshold) {
			return (threshold as IntThreshold).value 
		}
		return (threshold as FloatThreshold).value
	}
	
	private def getRequiredThings(Controller ctrl) {
		val thresholdThings = ctrl.threshold.map[ t | toClass(t.source.thing.name) ].toList
		val serviceThings = ctrl.servicecalls.map[ s | toClass(s.node.thing.name) ].toList
		val things = Stream.concat(thresholdThings.stream, serviceThings.stream).distinct.collect(Collectors.toList)
		things.add(toClass(ctrl.computationNode.thing.name))
		return things
	}
	
	private def getRequiredUnits(Controller ctrl) {
		val thresholdUnits = ctrl.threshold.map[ t | toClass(t.parameter.unit.name) ].toList
		val serviceUnits = ctrl.servicecalls.map[ s | s.service.parameters ].flatten.map[ p | toClass(p.unit.name) ].toList
		return Stream.concat(thresholdUnits.stream, serviceUnits.stream).distinct.collect(Collectors.toList)
	}
	
	def generate(String packageName, Controller ctrl)
	'''
	package «packageName».«CONTROLLER_PACKAGE»;
	
	import java.util.ArrayList;
	
	import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
	import at.ac.tuwien.big.sbsml.codegen.lib.Util;
	
	«FOR t : getRequiredThings(ctrl)»
	import «packageName».«ThingGenerator.THING_PACKAGE».«t»;
	«ENDFOR»
	
	«FOR u : getRequiredUnits(ctrl)»
	import «packageName».«UnitGenerator.UNIT_PACKAGE».«u»;
	«ENDFOR»
	
	public class «toClass(ctrl.name)» implements ControllerSimulator {
	
		private «toClass(ctrl.computationNode.thing.name)» computationNode;
		
		public «toClass(ctrl.name)»(«toClass(ctrl.computationNode.thing.name)» computationNode) {
			this.computationNode = computationNode;
		}
		
		@Override
		public void step() {
			
			System.out.println("  Thresholds:");
			
			«FOR i : 0..<ctrl.threshold.size»
			boolean threshold«i» = false;
			«ENDFOR»
			
			«FOR i : 0..<ctrl.threshold.size»
			«val t = ctrl.threshold.get(i)»
			«toClass(t.source.thing.name)» «toVar(t.source.name)» = («toClass(t.source.thing.name)») computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("«t.source.name»"))
				.findAny()
				.get();
			«toClass(t.parameter.unit.name)» «toVar(t.source.name + " " + t.parameter.name)» = «toVar(t.source.name)».«toVar(t.parameter.name)»();
			if («toVar(t.source.name + " " + t.parameter.name)» != null) {
				threshold«i» = «toVar(t.source.name + " " + t.parameter.name)».getValue() «getComparator(t)» «getThresholdValue(t)»;
			}
			System.out.println("    «t.source.name»_«t.parameter.name» «getComparator(t).substring(0,1)» «getThresholdValue(t)»: " + (threshold«i» ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
			
			«ENDFOR»
			
			     
			if («FOR i : 0..<ctrl.threshold.size SEPARATOR ' && '»threshold«i»«ENDFOR») {
				System.out.println();
				«FOR svc : ctrl.servicecalls»
				«toClass(svc.node.thing.name)» «toVar(svc.node.name)» = («toClass(svc.node.thing.name)») computationNode.getConnecctedDevices(new ArrayList<>()).stream()
					.filter(d -> d.getName().equals("«svc.node.name»"))
					.findAny()
					.get();
				«toVar(svc.node.name)».«toVar(svc.service.name)»(«FOR i : 0..< svc.service.parameters.size SEPARATOR ', '»new «toClass(svc.service.parameters.get(i).unit.name)»(«svc.arguments.get(i).stringValue»)«ENDFOR»);
				«ENDFOR»
			}
		}
	
	}
	'''
}