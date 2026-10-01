package mavenparctice;

public class Child extends Dog {
	
	void Kids() {
		super.makesound();
		
		System.out.println("Puppy plays");
	}
public static void main(String[] args) {
		
		Child p = new Child();
		
		p.Eatfood();
		p.Kids();
		p.makesound();
		
		
	}
}
