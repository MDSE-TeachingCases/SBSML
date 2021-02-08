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

public class LivLightController2 implements ControllerSimulator {

	private Raspberry computationNode;
	
	public LivLightController2(Raspberry computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		MovementSensor livM2 = (MovementSensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("LivM2"))
			.findAny()
			.get();
		Moving livM2isMoving = livM2.isMoving();
		if (livM2isMoving != null) {
			threshold0 = livM2isMoving.getValue() == true;
		}
		System.out.println("    LivM2_isMoving = true: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			LightBulb livBulb2 = (LightBulb) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("LivBulb2"))
				.findAny()
				.get();
			livBulb2.setLight(new Percent(100), new Second(600));
			LightBulb livBulb3 = (LightBulb) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("LivBulb3"))
				.findAny()
				.get();
			livBulb3.setLight(new Percent(100), new Second(600));
		}
	}

}
