package smarthome.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.unit.Celsius;

public class TemperatureSensor implements Connectable {

	private String name;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	private Celsius temperature;
	private DataSource<Double> temperatureDataSource;
	
	public TemperatureSensor(String name, DataSource<Double> temperatureDataSource) {
		this.name = name;
		this.temperatureDataSource = temperatureDataSource;
		this.ports.put("TS_GPIO", false);
		this.connections.put("TS_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to TemperatureSensor " + name + " on port " + port);
	}
			
	public void readNextTemperature() {
		Double value = temperatureDataSource.next();
		if (value != null) {
			this.temperature = new Celsius(value);
			System.out.println("    - temperature: " + value + "° C");
		} else {
			 this.temperature = null;
			 System.out.println("   - temperature:" + Util.ANSI_RED + " ❌" + Util.ANSI_BLUE );
		}
		
	}
	
	public Celsius temperature() {
		return this.temperature;
	}
}
