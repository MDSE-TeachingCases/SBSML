package smartindoorfarmingsystem.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;


public class Lamp implements Connectable {

	private String name;
	private EventLogger eventLogger;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	
	public Lamp(String name, EventLogger eventLogger) {
		this.name = name;
		this.eventLogger = eventLogger;
		this.ports.put("L_GPIO", false);
		this.connections.put("L_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to Lamp " + name + " on port " + port);
	}
	
	/**
	 * Turns the lamp on.
	 */
	public void turnOn() {
		List<Object> args = new ArrayList<>();
		eventLogger.log("turnOn", args);
		System.out.println(Util.ANSI_RED + "  ▶ " + name + ".turnOn" + Util.ANSI_RESET);
	}
	
	public void turnOff() {
		List<Object> args = new ArrayList<>();
		eventLogger.log("turnOff", args);
		System.out.println(Util.ANSI_RED + "  ▶ " + name + ".turnOff" + Util.ANSI_RESET);
	}
	
}

