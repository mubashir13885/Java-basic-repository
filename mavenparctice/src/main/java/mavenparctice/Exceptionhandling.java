package mavenparctice;

public class Exceptionhandling {

	public static void main(String[] args) {

		int numerator =9;
		int denominator=3;
		try {
			System.out.println(numerator/denominator);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero not possible");
			
		}
		
		finally {
			System.out.println("Executed");
		}
	}

}
