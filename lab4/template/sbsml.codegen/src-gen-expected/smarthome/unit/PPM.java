package smarthome.unit;

public class PPM {
	private int value;
	
	public PPM(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "ppm";
	}
}
