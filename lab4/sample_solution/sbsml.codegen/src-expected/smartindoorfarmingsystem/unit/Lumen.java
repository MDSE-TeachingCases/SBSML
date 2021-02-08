package smartindoorfarmingsystem.unit;

public class Lumen {
	private int value;
	
	public Lumen(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value + "lu";
	}
}
