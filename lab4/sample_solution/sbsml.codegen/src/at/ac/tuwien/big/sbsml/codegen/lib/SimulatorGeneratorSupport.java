package at.ac.tuwien.big.sbsml.codegen.lib;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class SimulatorGeneratorSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new SimulatorGeneratorModule();
	}
}