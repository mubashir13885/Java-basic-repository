package mavenparctice;

public class Dog extends Animal {
	
	void Eatfood() {
		System.out.println("Dog eats food");
	}
	void makesound() {
		super.makesound();
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.makesound();
		d.Eatfood();
	
		
	}

}
