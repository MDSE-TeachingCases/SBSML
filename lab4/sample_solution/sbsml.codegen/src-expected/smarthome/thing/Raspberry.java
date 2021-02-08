package smarthome.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.ControllerSimulator;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;
	
public class Raspberry implements Connectable {

	private String name;
	private Map<String, ControllerSimulator> controllers = new HashMap<>();
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	
	public Raspberry(String name) {
		this.name = name;
		this.ports.put("RPI_GPIO_1", false);
		this.connections.put("RPI_GPIO_1", new ArrayList<>());
		this.ports.put("RPI_GPIO_2", false);
		this.connections.put("RPI_GPIO_2", new ArrayList<>());
		this.ports.put("RPI_GPIO_3", false);
		this.connections.put("RPI_GPIO_3", new ArrayList<>());
		this.ports.put("RPI_GPIO_4", false);
		this.connections.put("RPI_GPIO_4", new ArrayList<>());
		this.ports.put("RPI_USB", false);
		this.connections.put("RPI_USB", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to Raspberry " + name + " on port " + port);
	}
	
	public void addController(String name, ControllerSimulator controller) {
		controllers.put(name, controller);
	}
	
	public void executeControllers() {
		for(Map.Entry<String, ControllerSimulator> kv: controllers.entrySet()) {
			System.out.println(Util.ANSI_ITALIC + name + Util.ANSI_RESET + " executes " + Util.ANSI_BOLD + kv.getKey() + Util.ANSI_RESET);
			kv.getValue().step();
			System.out.println("");
		}
	}
}
