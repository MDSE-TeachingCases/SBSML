package smartindoorfarmingsystem.unit;

public class Second {
	private int value;
	
	public Second(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "sec";
	}
}
