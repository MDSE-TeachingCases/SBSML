package smarthome.controller;

import java.util.ArrayList;

import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.MovementSensor;
import smarthome.thing.LightBulb;
import smarthome.thing.Raspberry;

import smarthome.unit.Moving;
import smarthome.unit.Percent;
import smarthome.unit.Second;

public class LivLightController1 implements ControllerSimulator {

	private Raspberry computationNode;
	
	public LivLightController1(Raspberry computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		MovementSensor livM1 = (MovementSensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("LivM1"))
			.findAny()
			.get();
		Moving livM1isMoving = livM1.isMoving();
		if (livM1isMoving != null) {
			threshold0 = livM1isMoving.getValue() == true;
		}
		System.out.println("    LivM1_isMoving = true: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			LightBulb livBulb1 = (LightBulb) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("LivBulb1"))
				.findAny()
				.get();
			livBulb1.setLight(new Percent(100), new Second(600));
		}
	}

}
