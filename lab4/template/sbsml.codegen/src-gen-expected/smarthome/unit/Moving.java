package smarthome.unit;

public class Moving {
	private boolean value;
	
	public Moving(boolean value) {
		this.value = value;
	}
	
	public boolean getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "";
	}
}
