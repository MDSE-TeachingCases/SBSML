package smarthome.unit;

public class Celsius {
	private double value;
	
	public Celsius(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "° C";
	}
}
