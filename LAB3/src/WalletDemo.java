import java.util.Scanner;
public class WalletDemo {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int val, cap;
		String name;
		
		System.out.print("What is the capacity of your wallet? ");
			cap = kb.nextInt();
		
		Wallet w = new Wallet(cap);
		
		for(int i=0;i<cap;i++){
			System.out.print("Input name: ");
				name = kb.next();
			System.out.print("Input value: ");
				val  = kb.nextInt();
			Coin c = new Coin(name, val);
			w.addCoin(c);
			System.out.println(c.toString());
		}
				
		System.out.print(w.toString());
		
		kb.close();
	}
}
