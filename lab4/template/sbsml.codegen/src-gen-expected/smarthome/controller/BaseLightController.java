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

public class BaseLightController implements ControllerSimulator {

	private Raspberry computationNode;
	
	public BaseLightController(Raspberry computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		MovementSensor baseM = (MovementSensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("BaseM"))
			.findAny()
			.get();
		Moving baseMisMoving = baseM.isMoving();
		if (baseMisMoving != null) {
			threshold0 = baseMisMoving.getValue() == true;
		}
		System.out.println("    BaseM_isMoving = true: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			LightBulb baseL = (LightBulb) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("BaseL"))
				.findAny()
				.get();
			baseL.setLight(new Percent(100), new Second(500));
		}
	}

}
