public class Coin {
	private String name;
	private int value;
	
	// CONSTRUCTOR //
	public Coin(String n, int v){
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
		return "You just added a "+name+" to the wallet. It is worth "+value+" cents";
	}
}
