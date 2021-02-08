package smarthome.thing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.sbsml.codegen.lib.Connectable;
import at.ac.tuwien.big.sbsml.codegen.lib.ConnectionException;
import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.unit.Moving;

public class MovementSensor implements Connectable {

	private String name;
	private Map<String, Boolean> ports = new HashMap<>();
	private Map<String, List<Connectable>> connections = new HashMap<>();
	private Moving isMoving;
	private DataSource<Boolean> isMovingDataSource;
	
	public MovementSensor(String name, DataSource<Boolean> isMovingDataSource) {
		this.name = name;
		this.isMovingDataSource = isMovingDataSource;
		this.ports.put("MS_GPIO", false);
		this.connections.put("MS_GPIO", new ArrayList<>());
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
		System.out.println("    🔗  Connected " + connectable.getClass().getSimpleName() + " " + connectable.getName() + " to MovementSensor " + name + " on port " + port);
	}
			
	public void readNextIsMoving() {
		Boolean value = isMovingDataSource.next();
		if (value != null) {
			this.isMoving = new Moving(value);
			System.out.println("    - isMoving: " + value + "");
		} else {
			 this.isMoving = null;
			 System.out.println("   - isMoving:" + Util.ANSI_RED + " ❌" + Util.ANSI_BLUE );
		}
		
	}
	
	public Moving isMoving() {
		return this.isMoving;
	}
}
