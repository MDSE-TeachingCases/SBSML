package smarthome.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.unit.HeatingLevel;

public class Radiator implements Connectable {

	private String name;
	private EventLogger eventLogger;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	
	public Radiator(String name, EventLogger eventLogger) {
		this.name = name;
		this.eventLogger = eventLogger;
		this.ports.put("R_GPIO", false);
		this.connections.put("R_GPIO", new ArrayList<>());
	}
	
	@Override
	public Map<String, List<Connectable>> getConnections() {
		return connections;
	}
			
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void connect(String port, Connectable connectable) {
		if (ports.get(port) && connections.get(port).size() > 0) {
			throw new ConnectionException("Singleconnection-port " + port + " already in use for " + name);
		}
		
		connections.get(port).add(connectable);
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to Radiator " + name + " on port " + port);
	}
	
	public void setHeatingLevel(HeatingLevel level) {
		List<Object> args = new ArrayList<>();
		args.add(level);
		eventLogger.log("setHeatingLevel", args);
		System.out.println(Util.ANSI_RED + "  ▶ " + name + ".setHeatingLevel with " + level.toString() + " level" + Util.ANSI_RESET);
	}
	
}

