public class Wallet {
	Coin cn[];
	int cap, num, tot;
	
	public Wallet(int c){
		num = 0;
		tot = 0;
		cap = c;
		cn = new Coin[c+1];
	}
	
	public void addCoin(Coin c){
		num++;
		cn[num] = c;
		tot += c.getValue();
	}
	
	public Coin removeCoin(){
		Coin c = cn[num];
		cn[num] = null;
		num--;
		tot -=c.getValue();
		return c;
	}
	
	public String toString(){
		return "Wallet contains: "+tot+" cents";
	}
}
