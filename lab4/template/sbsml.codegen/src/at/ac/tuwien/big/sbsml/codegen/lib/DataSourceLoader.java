package at.ac.tuwien.big.sbsml.codegen.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class DataSourceLoader {

	private final static String INT = "INT";
	private final static String FLOAT = "FLOAT";
	private final static String BOOL = "BOOL";
	
	/**
	 * Creates a Map of DataSource Objects for the simulation of a SmartSystem. 
	 * The data values are read from a JSON file.
	 * 
	 * @param filePath path to the json file containing the sensor values
	 * @return Map<"configName", Map<"SensorNode_parameter", DataSource>>
	 * @throws IOException if the file could not be read
	 */
	public Map<String, Map<String, DataSource<?>>> loadDataSource(String filePath) throws IOException {
		
		String jsonStr = new String(Files.readAllBytes(Paths.get(filePath)));
						
		
		Map<String, Map<String, DataSource<?>>> dataSources = new HashMap<>();
		
		Gson gson = new Gson();
		JsonElement elem = gson.fromJson(jsonStr, JsonElement.class);
		JsonArray configs = elem.getAsJsonObject().get("configs").getAsJsonArray();
		for (JsonElement config : configs) {
			String name = config.getAsJsonObject().get("name").getAsString();
			Map<String, DataSource<?>> configDataSources= new HashMap<>();
			
			JsonArray sensedParams = config.getAsJsonObject().get("sensedParameters").getAsJsonArray();
			for (JsonElement sensedParam : sensedParams) {
				String paramName = sensedParam.getAsJsonObject().get("name").getAsString();
				String datatype = sensedParam.getAsJsonObject().get("datatype").getAsString();
				JsonArray values = sensedParam.getAsJsonObject().get("values").getAsJsonArray();

				if (INT.equals(datatype)) {
					DataSource<Integer> dataSource = new DataSource<Integer>();
					values.forEach(v -> dataSource.fill(v.getAsInt()));
					configDataSources.put(paramName, dataSource);
				} else if (FLOAT.equals(datatype)) {
					DataSource<Double> dataSource = new DataSource<Double>();
					values.forEach(v -> dataSource.fill(v.getAsDouble()));
					configDataSources.put(paramName, dataSource);
				} else {
					DataSource<Boolean> dataSource = new DataSource<Boolean>();
					values.forEach(v -> dataSource.fill(v.getAsBoolean()));
					configDataSources.put(paramName, dataSource);
				}
			}
			dataSources.put(name, configDataSources);
		}
		
		return dataSources;
	}
}
