package mavenparctice;

public class Sweets implements Parent1,Parent2{
	

	public static void main(String[] args) {
		Sweets s = new Sweets();
		s.Display();
		s.Display1();
	}

	@Override
	public void Display1() {

		System.out.println("Chocolate");
	}

	@Override
	public void Display() {

		System.out.println("Vanilla");
	}

}
