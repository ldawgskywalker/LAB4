public class Coin {
	private String name;
	private int value;
	
	// CONSTRUCTOR //
	public Coin(int v, String n){
		name  = n;
		value = v;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String toString(){
		return"";
	}
}
