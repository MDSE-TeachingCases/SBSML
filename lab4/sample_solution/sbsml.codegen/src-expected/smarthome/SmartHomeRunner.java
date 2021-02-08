package smarthome;

import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.SmartSystemRunner;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.config.Basement;
import smarthome.config.Bathroom;
import smarthome.config.Livingroom;

public class SmartHomeRunner implements SmartSystemRunner {
	private Basement basement;
	private Bathroom bathroom;
	private Livingroom livingroom;
	private int stepCount = 0;
	
	
	@Override
	public void setup(EventLogger eventLogger, Map<String, Map<String, DataSource<?>>> dataSources) {
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		
		System.out.println("Config Basement:");
		basement = new Basement(eventLogger,
		    (DataSource<Integer>)dataSources.get("Basement").get("BaseGD__concentration"),
		    (DataSource<Boolean>)dataSources.get("Basement").get("BaseM__isMoving")
		);
		System.out.println("Config Bathroom:");
		bathroom = new Bathroom(eventLogger,
		    (DataSource<Double>)dataSources.get("Bathroom").get("BathHS__humidity"),
		    (DataSource<Boolean>)dataSources.get("Bathroom").get("BathM__isMoving")
		);
		System.out.println("Config Livingroom:");
		livingroom = new Livingroom(eventLogger,
		    (DataSource<Boolean>)dataSources.get("Livingroom").get("LivM1__isMoving"),
		    (DataSource<Boolean>)dataSources.get("Livingroom").get("LivM2__isMoving"),
		    (DataSource<Double>)dataSources.get("Livingroom").get("LivTS__temperature")
		);
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n\n" + Util.ANSI_RESET);
	}
	
	@Override
	public void step() {
		stepCount++;
		System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================" + Util.ANSI_RESET);
		basement.step();
					System.out.println("---------------------------------------------------------------------------------");
		
		bathroom.step();
					System.out.println("---------------------------------------------------------------------------------");
		
		livingroom.step();
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n\n" + Util.ANSI_RESET);
	}
}
