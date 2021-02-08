package at.ac.tuwien.big.sbsml.codegen.lib;

import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SimulatorGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		EssentialOCLStandaloneSetup.doSetup();
		return Guice.createInjector(new SimulatorGeneratorModule());
	}

}
