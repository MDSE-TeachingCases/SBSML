package smartindoorfarmingsystem.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.unit.Lumen;

public class LightSensor implements Connectable {

	private String name;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	private Lumen brightness;
	private DataSource<Integer> brightnessDataSource;
	
	public LightSensor(String name, DataSource<Integer> brightnessDataSource) {
		this.name = name;
		this.brightnessDataSource = brightnessDataSource;
		this.ports.put("LS_GPIO", false);
		this.connections.put("LS_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to LightSensor " + name + " on port " + port);
	}
			
	public void readNextBrightness() {
		Integer value = brightnessDataSource.next();
		if (value != null) {
			this.brightness = new Lumen(value);
			System.out.println("    - brightness: " + value + "lu");
		} else {
			 this.brightness = null;
			 System.out.println("   - brightness:" + Util.ANSI_RED + " ❌" + Util.ANSI_BLUE );
		}
		
	}
	
	public Lumen brightness() {
		return this.brightness;
	}
}
