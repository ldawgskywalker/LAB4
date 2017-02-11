public class Person {
	private String name;
	//CONSTRUCTOR
	public Person(){}
	//SETTERS AND GETTERS//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//PRINTS NAME
	public String toString(){
		return "Name: "+name;
	}
	//CHECKS IF SAME NAME
	public boolean hasSameName(Person p){
		return p.getName().equals(name);
	}
	
}
