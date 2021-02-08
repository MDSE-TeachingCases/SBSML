package at.ac.tuwien.big.sbsml.codegen.lib;

import java.util.Map;

public interface SmartSystemRunner {
	
	public void setup(EventLogger eventLogger, Map<String, Map<String, DataSource<?>>> dataSources);

	
	public void step();
}
