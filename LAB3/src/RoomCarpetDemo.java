import java.util.Scanner;
public class RoomCarpetDemo {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		double length, width, cc;
		// TAKE INPUTS FOR FIRST ROOM, AND CREATE IT //
		System.out.print("Enter the dimensions of the first room: ");
			length = kb.nextDouble();
			width  = kb.nextDouble();
		System.out.print("Enter the cost per square foot of carpet: ");
			cc = kb.nextDouble();
		RoomDimension dim	= new RoomDimension(length, width);
		RoomCarpet Tommy    = new RoomCarpet(dim,cc);
		
		// TAKE INPUTS FOR SECOND ROOM, AND CREATE IT //
		System.out.print("Enter the dimensions of the second room: ");
			length = kb.nextDouble();
			width  = kb.nextDouble();
		System.out.print("Enter the cost per square foot of carpet: ");
			cc = kb.nextDouble();
		RoomDimension dim2  = new RoomDimension(length, width);
		RoomCarpet Wiseau   = new RoomCarpet(dim2,cc);
		
		if(Tommy.costsMore(Wiseau)){
			Tommy.toString();
			dim.toString();
			System.out.println("costs more than");
			Wiseau.toString();
			dim2.toString();
		}
		else if(Wiseau.costsMore(Tommy)){
			Wiseau.toString();
			dim2.toString();
			System.out.println("costs more than");
			Tommy.toString();
			dim.toString();
		}
		else{
			Wiseau.toString();
			dim2.toString();
			Tommy.toString();
			dim.toString();
			System.out.println("costs the same");
		}
		
		kb.close();
	}
}
