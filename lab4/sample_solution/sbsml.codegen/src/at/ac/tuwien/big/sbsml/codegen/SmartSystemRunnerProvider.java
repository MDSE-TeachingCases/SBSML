package at.ac.tuwien.big.sbsml.codegen;

import at.ac.tuwien.big.sbsml.codegen.lib.SmartSystemRunner;
import smarthome.SmartHomeRunner;
import smartindoorfarmingsystem.SmartIndoorFarmingSystemRunner;

public class SmartSystemRunnerProvider {

	public static SmartSystemRunner getIndoorFarmingRunner() {
		return new SmartIndoorFarmingSystemRunner();
	}
	
	public static SmartSystemRunner getSmartHomeRunner() {
		return new SmartHomeRunner();
	}
	
}
