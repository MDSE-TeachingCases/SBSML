package smartindoorfarmingsystem.unit;

public class Percent {
	private double value;
	
	public Percent(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "%";
	}
}
