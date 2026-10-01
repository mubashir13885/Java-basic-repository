package mavenparctice;

abstract class Atm {
	abstract void withdraw(int money);
	abstract void deposit(int m);
	void checkBalance() {
		System.out.println("Displaying Account Balance");
	}
	
	
}

class HDFC_ATM extends Atm{

	private int balance = 12000;
	@Override
	void withdraw(int money) {

		if(money<=balance){
			balance = balance - money;
			System.out.println(balance);
			
		}
		
	}

	@Override
	void deposit(int m) {
			balance = balance + m ; 
			System.out.println(balance);
		
	}
	void checkbalance() {
		
		super.checkBalance();
		System.out.println(balance);
	}
	
	
}
public class ATMmachine {

	public static void main(String[] args) {

		HDFC_ATM atm = new HDFC_ATM();
		
		atm.withdraw(500);
		atm.deposit(700);
		atm.checkBalance();
		
	}

}
