package mavenparctice;

public class Uncheckedexception {

	public static void main(String[] args) {

		try {
			
		int a = 23;
		int b = 0;
		
		System.out.println(a/b);
		}
		
		catch(ArithmeticException e){
			
			System.out.println("divivsion by zero is not allowed");
		}
		
	}

}
