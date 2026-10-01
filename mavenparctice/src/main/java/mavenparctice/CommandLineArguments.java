package mavenparctice;

import java.util.Scanner;

public class CommandLineArguments {

	public static void main(String[] args) {

		
		//System.out.println("Enter the name "+args[0]);
		//System.out.println("Enter the age"+args[1]);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name= sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println(name);
		System.out.println(age);
	}

}
