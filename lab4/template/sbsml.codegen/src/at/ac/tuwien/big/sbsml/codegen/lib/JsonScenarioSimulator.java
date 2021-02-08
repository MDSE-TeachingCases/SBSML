package at.ac.tuwien.big.sbsml.codegen.lib;

import java.io.IOException;
import java.util.Map;


public class JsonScenarioSimulator {
		
	public void simulate(SmartSystemRunner runner, String filePath) {
		
		try {
			DataSourceLoader loader = new DataSourceLoader();
			Map<String, Map<String, DataSource<?>>> dataSources = loader.loadDataSource(filePath);
			EventLogger eventLogger = new EventLogger();
			runner.setup(eventLogger, dataSources);
			
			int length = getMaximalQueueLength(dataSources);
			for (int i = 0; i < length; i++) {
				
				runner.step();
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void simulateStepwise(SmartSystemRunner runner, String filePath) {
		
		try {
			DataSourceLoader loader = new DataSourceLoader();
			Map<String, Map<String, DataSource<?>>> dataSources = loader.loadDataSource(filePath);
			EventLogger eventLogger = new EventLogger();
			runner.setup(eventLogger, dataSources);
			
			int length = getMaximalQueueLength(dataSources);
			
			byte[] buffer = new byte[256];
			int steps = 0;
			
			while (length > 0) {
				System.out.println(Util.ANSI_GREEN + "Hit <enter> to simulate the next step.");
				System.out.println("Type in a <number> to simulate a number of steps.");
				System.out.println("Type in <run> to simulate the remaining scenario.");
				System.out.println("Type in <exit> to stop the simulation." + Util.ANSI_RESET);
				System.in.read(buffer);
				steps = 1;
				String cmd = new String(buffer).trim().toLowerCase();
				if ("exit".equals(cmd)) {
					return;
				} else if ("run".equals(cmd)) {
					steps = length;
				} else {
					try {
						steps = Integer.parseInt(cmd);
					} catch (NumberFormatException e) {
						// nothing
					}
				}
				
				while (steps > 0 && length > 0) {
					runner.step();
					steps--;
					length--;
				}
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private int getMaximalQueueLength(Map<String, Map<String, DataSource<?>>> dataSources) {
		int max = 0;
		for (Map<String, DataSource<?>> config : dataSources.values()) {
			for(DataSource<?> source : config.values()) {
				int length = source.getQueueLength();
				if (max < length) max = length;
			}
		}
		return max;
	}

}
