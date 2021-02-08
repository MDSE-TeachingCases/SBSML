package smartindoorfarmingsystem;

import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.SmartSystemRunner;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.config.Basil;

public class SmartIndoorFarmingSystemRunner implements SmartSystemRunner {
	private Basil basil;
	private int stepCount = 0;
	
	@SuppressWarnings("unchecked")
	@Override
	public void setup(EventLogger eventLogger, Map<String, Map<String, DataSource<?>>> dataSources) {
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		
		System.out.println("Config Basil:");
		basil = new Basil(eventLogger,
		    (DataSource<Double>)dataSources.get("Basil").get("BasilHS__humidity"),
		    (DataSource<Integer>)dataSources.get("Basil").get("BasilLS__brightness")
		);
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n\n" + Util.ANSI_RESET);
	}
	
	@Override
	public void step() {
		stepCount++;
		System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================" + Util.ANSI_RESET);
		basil.step();
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n\n" + Util.ANSI_RESET);
	}
}
