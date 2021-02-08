package at.ac.tuwien.big.sbsml.codegen.lib;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class DataSource<T> {

	private Queue<T> queue = new LinkedList<>();
	private Optional<T> constant = Optional.empty();
	
	public void setConstValue(T value) {
		constant = Optional.ofNullable(value);
	}
		
	public void fill(T... data){
		queue.addAll(Arrays.asList(data));
		constant = Optional.empty();
	}
	
	public T next() {
		if (constant.isPresent()) {
			return constant.get();
		}
		return queue.isEmpty() ? null : queue.poll();
	}
	
	public int getQueueLength() {
		return queue.size();
	}
}
