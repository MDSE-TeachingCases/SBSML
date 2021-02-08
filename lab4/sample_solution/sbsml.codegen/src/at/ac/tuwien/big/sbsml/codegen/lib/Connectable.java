package at.ac.tuwien.big.sbsml.codegen.lib;

import java.util.List;
import java.util.Map;

public interface Connectable {
	
	void connect(String port, Connectable connectable);
	
	String getName();
		
	Map<String, List<Connectable>> getConnections();
	
	default List<Connectable> getConnecctedDevices(List<Connectable> devices) {
		
		getConnections().entrySet().stream().forEach(kv -> {
			kv.getValue().stream().forEach(dev -> {
				if (!devices.contains(dev)) {
					devices.add(dev);
					dev.getConnecctedDevices(devices);
				}
			});
		});
		
		return devices;
	}
}
