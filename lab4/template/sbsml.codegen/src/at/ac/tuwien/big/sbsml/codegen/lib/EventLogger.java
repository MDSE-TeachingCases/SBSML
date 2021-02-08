package at.ac.tuwien.big.sbsml.codegen.lib;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EventLogger {

	private Queue<Entry> entries = new LinkedList<>();
	private Map<String, Consumer<List<Object>>> fallbacks = new HashMap<String, Consumer<List<Object>>>();
	
	public void log(String event, List<Object> arguments) {
		entries.add(new Entry(event, arguments));
		if (fallbacks.containsKey(event)) {
			fallbacks.get(event).accept(arguments);
		}
	}
	
	public Entry nextEntry() {
		return entries.poll();
	}
	
	public int size() {
		return entries.size();
	}
	
	public void register(String event, Consumer<List<Object>> fallback) {
		fallbacks.put(event, fallback);
	}
	
	
	public Collection<Entry> clear() {
		Collection<Entry> list = entries.stream().collect(Collectors.toList());
		entries.clear();
		return list;
	}
	
	
	public class Entry {
		private String event;
		private List<Object> arguments;
		
		private Entry(String event, List<Object> arguments) {
			this.event = event;
			this.arguments = arguments;
		}
		
		public String getEvent() {
			return event;
		}
		
		public List<Object> getArguments() {
			return arguments;
		}
		
	}
}
