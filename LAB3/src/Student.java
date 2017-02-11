public class Student extends Person{
	private int StuNum;
	//CONSTRUCTOR//
	public Student(){
		//CALLS PERSON OBJECT CONSTRUCTOR
		super();
	}
	//SETS NAME AND STUDENT NUMBER
	public void reset(String nName, int newNum){
		StuNum = newNum;
		setName(nName);
	}
	// SETTERS AND GETTERS
	public int getStuNum() {
		return StuNum;
	}

	public void setStuNum(int stuNum) {
		StuNum = stuNum;
	}
	///////
	//TOSTRING METHOD, CALLS PERSON TOSTRING
	public String toString(){
		
		return super.toString()+"\nStudent Number: "+StuNum;
	}
	//SEES IF SAME STUDENT//
	public boolean equals(Student o){
		if(super.hasSameName(o)&&this.StuNum==o.getStuNum()){
			return true;
		}
		return false;
	}
}
