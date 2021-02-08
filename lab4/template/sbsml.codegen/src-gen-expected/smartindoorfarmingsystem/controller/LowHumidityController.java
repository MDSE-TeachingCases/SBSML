package smartindoorfarmingsystem.controller;

import java.util.ArrayList;

import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.thing.HumiditySensor;
import smartindoorfarmingsystem.thing.WateringValve;
import smartindoorfarmingsystem.thing.RaspberryPi;

import smartindoorfarmingsystem.unit.Percent;
import smartindoorfarmingsystem.unit.Second;

public class LowHumidityController implements ControllerSimulator {

	private RaspberryPi computationNode;
	
	public LowHumidityController(RaspberryPi computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		HumiditySensor basilHS = (HumiditySensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("BasilHS"))
			.findAny()
			.get();
		Percent basilHShumidity = basilHS.humidity();
		if (basilHShumidity != null) {
			threshold0 = basilHShumidity.getValue() < 0.8;
		}
		System.out.println("    BasilHS_humidity < 0.8: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			WateringValve basilWV = (WateringValve) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("BasilWV"))
				.findAny()
				.get();
			basilWV.waterPlant(new Second(10));
		}
	}

}
