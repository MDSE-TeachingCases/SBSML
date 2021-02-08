package smarthome.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.unit.PPM;

public class GasDetector implements Connectable {

	private String name;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	private PPM concentration;
	private DataSource<Integer> concentrationDataSource;
	
	public GasDetector(String name, DataSource<Integer> concentrationDataSource) {
		this.name = name;
		this.concentrationDataSource = concentrationDataSource;
		this.ports.put("GD_GPIO", false);
		this.connections.put("GD_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to GasDetector " + name + " on port " + port);
	}
			
	public void readNextConcentration() {
		Integer value = concentrationDataSource.next();
		if (value != null) {
			this.concentration = new PPM(value);
			System.out.println("    - concentration: " + value + "ppm");
		} else {
			 this.concentration = null;
			 System.out.println("   - concentration:" + Util.ANSI_RED + " ❌" + Util.ANSI_BLUE );
		}
		
	}
	
	public PPM concentration() {
		return this.concentration;
	}
}
