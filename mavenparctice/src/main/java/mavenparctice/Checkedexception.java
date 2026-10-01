package mavenparctice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checkedexception {

	public static void main(String[] args) throws FileNotFoundException {

		//try {
			FileReader file = new FileReader("text.txt");
		} //catch (FileNotFoundException e) {
			//System.out.println(e);
		//}
	}

//}
