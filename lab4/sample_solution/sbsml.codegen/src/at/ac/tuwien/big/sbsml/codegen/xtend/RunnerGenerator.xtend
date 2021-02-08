package at.ac.tuwien.big.sbsml.codegen.xtend

import sbsml.SmartSystem
import sbsml.Configuration
import sbsml.Sensor
import org.eclipse.xtext.util.Tuples
import sbsml.DataType

import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toClass
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toVar
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.ws
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toPack

class RunnerGenerator {
	
	// Map<ConfigName, Map<NodeNameParamName, Type>>
	
	private def getRequiredDataSources(Configuration config) {
		config.nodes.filter[ n | n.thing instanceof Sensor ].map[ n |
			(n.thing as Sensor).parameters.map[ p | Tuples.create(ws(n.name) + '__' + ws(p.name), dataType(p.unit.type)) ]
		].flatten.toList
	}
	
	private def dataType(DataType type) {
		return type === DataType.BOOL ? "Boolean" :
			   type === DataType.INT ? "Integer" :
			   "Double" ;
	}
	
	def generate(SmartSystem sys)
	'''
	package «toPack(sys.name)»;
	
	import java.util.Map;
	
	import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
	import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
	import at.ac.tuwien.big.sbsml.codegen.lib.SmartSystemRunner;
	import at.ac.tuwien.big.sbsml.codegen.lib.Util;
	
	«FOR c : sys.configs»
	import «toPack(sys.name)».«ConfigurationGenerator.CONFIGURATION_PACKAGE».«toClass(c.name)»;
	«ENDFOR»
	
	public class «toClass(sys.name)»Runner implements SmartSystemRunner {
		«FOR c : sys.configs»
		private «toClass(c.name)» «toVar(c.name)»;
		«ENDFOR»
		private int stepCount = 0;
		
		@SuppressWarnings("unchecked")
		@Override
		public void setup(EventLogger eventLogger, Map<String, Map<String, DataSource<?>>> dataSources) {
			System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
			System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
			System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
			
			«FOR c : sys.configs»
			System.out.println("Config «c.name»:");
			«toVar(c.name)» = new «toClass(c.name)»(eventLogger,«FOR t : getRequiredDataSources(c) SEPARATOR ','»
			«"    "»(DataSource<«t.second»>)dataSources.get("«c.name»").get("«t.first»")«ENDFOR»
			);
			«ENDFOR»
			System.out.println(Util.ANSI_BOLD + "=================================================================================\n\n" + Util.ANSI_RESET);
		}
		
		@Override
		public void step() {
			stepCount++;
			System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================" + Util.ANSI_RESET);
			«FOR c : sys.configs SEPARATOR '\n\t\t\tSystem.out.println("---------------------------------------------------------------------------------");\n'»
			«toVar(c.name)».step();
			«ENDFOR»
			System.out.println(Util.ANSI_BOLD + "=================================================================================\n\n" + Util.ANSI_RESET);
		}
	}
	'''
}