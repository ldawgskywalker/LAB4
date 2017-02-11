import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int num;
		String name;
		//INPUTS FOR FIRST STUDENT
		System.out.print("Input student's name: ");
			name = kb.nextLine();
		System.out.print("Input student number: ");
			num = kb.nextInt();
		Student NedBigby = new Student();
		NedBigby.reset(name, num);
		
		//INPUTS FOR SECOND STUDENT
		System.out.print("Input student's name: ");
			name = kb.next();
		System.out.print("Input student number: ");
			num = kb.nextInt();
		Student Cookie = new Student();
		Cookie.reset(name, num);
		
		System.out.println(NedBigby.toString()+"\nAND");
		System.out.println(Cookie.toString());
		if(Cookie.equals(NedBigby))
			System.out.println("Are same person.");
		
		else
			System.out.print("Are different people.");
		kb.close();
	}
}
