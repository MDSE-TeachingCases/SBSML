/*
 * generated by Xtext 2.23.0
 */
package at.ac.tuwien.big.formatting2

import at.ac.tuwien.big.services.SbsmlGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import sbsml.Sensor
import sbsml.SmartSystem

class SbsmlFormatter extends AbstractFormatter2 {
	
	@Inject extension SbsmlGrammarAccess

	def dispatch void format(SmartSystem smartSystem, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (unit : smartSystem.units) {
			unit.format
		}
		for (thing : smartSystem.things) {
			thing.format
		}
		for (configuration : smartSystem.configs) {
			configuration.format
		}
	}

	def dispatch void format(Sensor sensor, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (port : sensor.ports) {
			port.format
		}
		for (parameter : sensor.parameters) {
			parameter.format
		}
	}
	
	// TODO: implement for Actuator, Service, FogDevice, Configuration, Controller, ServiceCall
}
