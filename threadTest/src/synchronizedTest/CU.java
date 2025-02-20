package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		
	ATM atm = new ATM();
	
	Thread sm = new Thread(atm, "승민");
	Thread jg = new Thread(atm, "짱구");

	sm.start();
	jg.start();
	
	}
}
