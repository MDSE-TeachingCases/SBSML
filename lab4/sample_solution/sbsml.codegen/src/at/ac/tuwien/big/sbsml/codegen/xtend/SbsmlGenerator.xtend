package at.ac.tuwien.big.sbsml.codegen.xtend

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import sbsml.SmartSystem

import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toClass
import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toPack

class SbsmlGenerator extends AbstractGenerator {
	
	
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val sys = input.allContents.filter(SmartSystem).next
		val packageName =  toPack(sys.name)
		
		// Generate Units
		val unitGenerator = new UnitGenerator
		sys.units.forEach[ unit |
			fsa.generateFile(packageName + "/" + UnitGenerator.UNIT_PACKAGE + "/" + toClass(unit.name) + ".java", unitGenerator.generate(packageName, unit))
		]
		
		// Generate Things
		val thingGenerator = new ThingGenerator
		sys.things.forEach[ thing |
			fsa.generateFile(packageName + "/" + ThingGenerator.THING_PACKAGE + "/" + toClass(thing.name) + ".java", thingGenerator.generate(packageName, thing))
		]
		
		// Generate Configs
		val confiGenerator = new ConfigurationGenerator
		val controllerGenerator = new ControllerGenerator
		sys.configs.forEach[ config |
			fsa.generateFile(packageName + "/" + ConfigurationGenerator.CONFIGURATION_PACKAGE+ "/" + toClass(config.name) + ".java", confiGenerator.generate(packageName, config))
			
			// Generate Controllers
			config.controllers.forEach[ ctrl |
				fsa.generateFile(packageName + "/" + ControllerGenerator.CONTROLLER_PACKAGE + "/" + toClass(ctrl.name) + ".java", controllerGenerator.generate(packageName, ctrl))
			]
		]
		
		// Generate Runner
		val runnerGenerator = new RunnerGenerator
		fsa.generateFile(packageName + "/" + toClass(sys.name) + "Runner.java", runnerGenerator.generate(sys))
	}
	
}