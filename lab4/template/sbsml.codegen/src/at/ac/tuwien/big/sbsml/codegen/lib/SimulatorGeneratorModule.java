package at.ac.tuwien.big.sbsml.codegen.lib;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.sbsml.codegen.xtend.SbsmlGenerator;

public class SimulatorGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "sbsml";
	}

	@Override
	protected String getFileExtensions() {
		return "sbsml";
	}

	public Class<? extends IGenerator2> bindIGenerator() {
		return SbsmlGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
