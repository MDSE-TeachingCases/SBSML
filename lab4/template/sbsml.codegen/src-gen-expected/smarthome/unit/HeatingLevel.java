package smarthome.unit;

public class HeatingLevel {
	private int value;
	
	public HeatingLevel(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "";
	}
}
