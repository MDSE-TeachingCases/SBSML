package smarthome.controller;

import java.util.ArrayList;

import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.GasDetector;
import smarthome.thing.LightBulb;
import smarthome.thing.AlarmBell;
import smarthome.thing.Raspberry;

import smarthome.unit.PPM;

public class BaseGasLeakController implements ControllerSimulator {

	private Raspberry computationNode;
	
	public BaseGasLeakController(Raspberry computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		GasDetector baseGD = (GasDetector) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("BaseGD"))
			.findAny()
			.get();
		PPM baseGDconcentration = baseGD.concentration();
		if (baseGDconcentration != null) {
			threshold0 = baseGDconcentration.getValue() > 500;
		}
		System.out.println("    BaseGD_concentration > 500: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			LightBulb baseL = (LightBulb) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("BaseL"))
				.findAny()
				.get();
			baseL.alarm();
			AlarmBell baseBell = (AlarmBell) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("BaseBell"))
				.findAny()
				.get();
			baseBell.ringBell();
		}
	}

}
