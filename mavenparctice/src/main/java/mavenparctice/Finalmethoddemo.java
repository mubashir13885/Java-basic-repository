package mavenparctice;

class Employee {
    public final void displayCompanyPolicy() {
        System.out.println("Company Policy: Working hours are 9 AM to 5 PM. Integrity is mandatory.");
    }
}

// Subclass 1: Developer
class Developer extends Employee {
  /*  @Override
 //   public void displayCompanyPolicy() {
        System.out.println("Developer Policy: Flexible work hours.");
    }*/
}

// Subclass 2: Tester
class Tester extends Employee {
 /*   @Override
    //public void displayCompanyPolicy() {
        System.out.println("Tester Policy: Strict testing compliance.");
    }*/
}

public class Finalmethoddemo {

	public static void main(String[] args) {
		Developer dev = new Developer();
        dev.displayCompanyPolicy();
	}

}
