package smartindoorfarmingsystem.controller;

import java.util.ArrayList;

import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.thing.LightSensor;
import smartindoorfarmingsystem.thing.Lamp;
import smartindoorfarmingsystem.thing.RaspberryPi;

import smartindoorfarmingsystem.unit.Lumen;

public class DarknessController implements ControllerSimulator {

	private RaspberryPi computationNode;
	
	public DarknessController(RaspberryPi computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		LightSensor basilLS = (LightSensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("BasilLS"))
			.findAny()
			.get();
		Lumen basilLSbrightness = basilLS.brightness();
		if (basilLSbrightness != null) {
			threshold0 = basilLSbrightness.getValue() < 100;
		}
		System.out.println("    BasilLS_brightness < 100: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			Lamp basilLamp = (Lamp) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("BasilLamp"))
				.findAny()
				.get();
			basilLamp.turnOn();
		}
	}

}
