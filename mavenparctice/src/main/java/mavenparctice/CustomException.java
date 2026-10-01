package mavenparctice;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank{
	int  balance = 5000;

    void withdraw(int  amount) throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}
public class CustomException {

	public static void main(String[] args) throws InsufficientBalanceException {

		Bank b = new Bank();
		
		b.withdraw(7000);
	}

}
