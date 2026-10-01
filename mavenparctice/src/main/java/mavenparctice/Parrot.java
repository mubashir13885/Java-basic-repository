package mavenparctice;

public class Parrot extends Animal implements  interfaceabstraction{
	
	void Beek() {
		System.out.println("Parrot talk");
	}

	@Override
	public void abc() {
       System.out.println("parrot");		
	}
	
	public static void main(String [] args) {
		Parrot pt = new Parrot();
		pt.abc();
	}
}
