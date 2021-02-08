package smarthome.controller;

import java.util.ArrayList;

import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.HumiditySensor;
import smarthome.thing.MovementSensor;
import smarthome.thing.Ventilator;
import smarthome.thing.Raspberry;

import smarthome.unit.Percent;
import smarthome.unit.Moving;

public class BathHumidityController implements ControllerSimulator {

	private Raspberry computationNode;
	
	public BathHumidityController(Raspberry computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		boolean threshold1 = false;
		
		HumiditySensor bathHS = (HumiditySensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("BathHS"))
			.findAny()
			.get();
		Percent bathHShumidity = bathHS.humidity();
		if (bathHShumidity != null) {
			threshold0 = bathHShumidity.getValue() > 0.8;
		}
		System.out.println("    BathHS_humidity > 0.8: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		MovementSensor bathM = (MovementSensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("BathM"))
			.findAny()
			.get();
		Moving bathMisMoving = bathM.isMoving();
		if (bathMisMoving != null) {
			threshold1 = bathMisMoving.getValue() == false;
		}
		System.out.println("    BathM_isMoving = false: " + (threshold1 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0 && threshold1) {
			System.out.println();
			Ventilator bathV = (Ventilator) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("BathV"))
				.findAny()
				.get();
			bathV.startVent();
		}
	}

}
