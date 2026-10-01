package mavenparctice;

public  class Finalmethod {
	final void displayIFSC() {
		System.out.println("SBI007644");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalmethod f=new Finalmethod();
		f.displayIFSC();
		f.calculategrade(78);

	}
	final void calculategrade(int mark) {
		if (mark >= 90) {
            System.out.println("Grade: A+");
        }

        else if (mark >= 80) {
            System.out.println("Grade: A");
        }
        else if (mark >= 70) {
            System.out.println("Grade: B");
        }
        else if (mark >= 60) {
            System.out.println("Grade: C");
        }
        else  {
            System.out.println("Grade: D");

    }
	}
}