package at.ac.tuwien.big.sbsml.codegen.lib;

import java.util.Optional;
import java.util.stream.Stream;

import at.ac.tuwien.big.sbsml.codegen.SmartSystemRunnerProvider;

public class SmartSystemSimulator {

	private static final String INDOOR_FARMING_RUNNER = "indoorfarming";
	private static final String SMART_HOME_RUNNER = "smarthome";
	
	public static void main(String[] args) {
		boolean stepwise = Stream.of(args).filter(a -> "-s".equals(a)).findAny().isPresent();
		Optional<String> runnerArg = Stream.of(args).filter(a -> INDOOR_FARMING_RUNNER.equals(a) || SMART_HOME_RUNNER.equals(a)).findAny();
		Optional<String> scenarioFile = Stream.of(args).filter(a -> a.endsWith(".json")).findAny();
		
		if (!runnerArg.isPresent()) {
			printUsage();
		}
		
		if (!scenarioFile.isPresent()) {
			printUsage();
		}
		
		SmartSystemRunner runner = INDOOR_FARMING_RUNNER.equals(runnerArg.get()) ? SmartSystemRunnerProvider.getIndoorFarmingRunner() :
									SMART_HOME_RUNNER.equals(runnerArg.get()) ? SmartSystemRunnerProvider.getSmartHomeRunner() : null;
		
		JsonScenarioSimulator simulator = new JsonScenarioSimulator();
									
		if (stepwise) {
			simulator.simulateStepwise(runner, scenarioFile.get());
		} else {
			simulator.simulate(runner, scenarioFile.get());
		}
	}
	
	private static void printUsage() {
		System.err.println("Usage:");
		System.err.println("  SmartSystemSimulator [-s] (indoorfarming|smarthome) scenariofile");
		System.exit(1);
	}
}
