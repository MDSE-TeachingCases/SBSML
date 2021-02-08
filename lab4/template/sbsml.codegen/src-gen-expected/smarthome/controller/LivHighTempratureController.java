package smarthome.controller;

import java.util.ArrayList;

import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.TemperatureSensor;
import smarthome.thing.Radiator;
import smarthome.thing.Raspberry;

import smarthome.unit.Celsius;
import smarthome.unit.HeatingLevel;

public class LivHighTempratureController implements ControllerSimulator {

	private Raspberry computationNode;
	
	public LivHighTempratureController(Raspberry computationNode) {
		this.computationNode = computationNode;
	}
	
	@Override
	public void step() {
		
		System.out.println("  Thresholds:");
		
		boolean threshold0 = false;
		
		TemperatureSensor livTS = (TemperatureSensor) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
			.filter(d -> d.getName().equals("LivTS"))
			.findAny()
			.get();
		Celsius livTStemperature = livTS.temperature();
		if (livTStemperature != null) {
			threshold0 = livTStemperature.getValue() > 22.0;
		}
		System.out.println("    LivTS_temperature > 22.0: " + (threshold0 ? (Util.ANSI_GREEN + "✔" ) : (Util.ANSI_RED + "❌" ) + Util.ANSI_RESET));
		
		
		     
		if (threshold0) {
			System.out.println();
			Radiator livR = (Radiator) computationNode.getConnecctedDevices(new ArrayList<>()).stream()
				.filter(d -> d.getName().equals("LivR"))
				.findAny()
				.get();
			livR.setHeatingLevel(new HeatingLevel(0));
		}
	}

}
