package smartindoorfarmingsystem.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.unit.Second;

public class WateringValve implements Connectable {

	private String name;
	private EventLogger eventLogger;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	
	public WateringValve(String name, EventLogger eventLogger) {
		this.name = name;
		this.eventLogger = eventLogger;
		this.ports.put("WV_GPIO", false);
		this.connections.put("WV_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to WateringValve " + name + " on port " + port);
	}
	
	/**
	 * Waters the plant for the given amount of seconds.
	 * @param duration
	 */
	public void waterPlant(Second duration) {
		List<Object> args = new ArrayList<>();
		args.add(duration);
		eventLogger.log("waterPlant", args);
		System.out.println(Util.ANSI_RED + "  ▶ " + name + ".waterPlant with " + duration.toString() + " duration" + Util.ANSI_RESET);
	}
	
}

