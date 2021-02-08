package smartindoorfarmingsystem.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.unit.Percent;

public class HumiditySensor implements Connectable {

	private String name;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	private Percent humidity;
	private DataSource<Double> humidityDataSource;
	
	public HumiditySensor(String name, DataSource<Double> humidityDataSource) {
		this.name = name;
		this.humidityDataSource = humidityDataSource;
		this.ports.put("HS_GPIO", false);
		this.connections.put("HS_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to HumiditySensor " + name + " on port " + port);
	}
			
	public void readNextHumidity() {
		Double value = humidityDataSource.next();
		if (value != null) {
			this.humidity = new Percent(value);
			System.out.println("    - humidity: " + value + "%");
		} else {
			 this.humidity = null;
			 System.out.println("   - humidity:" + Util.ANSI_RED + " ❌" + Util.ANSI_BLUE );
		}
		
	}
	
	public Percent humidity() {
		return this.humidity;
	}
}
