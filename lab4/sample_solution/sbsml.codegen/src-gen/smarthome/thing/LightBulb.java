package smarthome.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.unit.Percent;
import smarthome.unit.Second;

public class LightBulb implements Connectable {

	private String name;
	private EventLogger eventLogger;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	
	public LightBulb(String name, EventLogger eventLogger) {
		this.name = name;
		this.eventLogger = eventLogger;
		this.ports.put("LB_ZIGBEE", false);
		this.connections.put("LB_ZIGBEE", new ArrayList<>());
		this.ports.put("LB_GPIO", false);
		this.connections.put("LB_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to LightBulb " + name + " on port " + port);
	}
	
	public void setLight(Percent brightness, Second timeout) {
		List<Object> args = new ArrayList<>();
		args.add(brightness);
		args.add(timeout);
		eventLogger.log("setLight", args);
		System.out.println(Util.ANSI_RED + "  ▶ " + name + ".setLight with " + brightness.toString() + " brightness, " + timeout.toString() + " timeout" + Util.ANSI_RESET);
	}
	
	public void alarm() {
		List<Object> args = new ArrayList<>();
		eventLogger.log("alarm", args);
		System.out.println(Util.ANSI_RED + "  ▶ " + name + ".alarm" + Util.ANSI_RESET);
	}
	
}

