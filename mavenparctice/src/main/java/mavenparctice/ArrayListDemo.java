package mavenparctice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthStyleFactory;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Mubashir");
		names.add("Akhil");
		System.out.println(names);
		names.remove("Akhil");
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		System.out.println(names.indexOf("Mubashir1"));
		for(String name:names) {
			System.out.println(name);
		}
		
		Iterator<String> itr =names.iterator();
		while(itr. hasNext()){
			String name = itr.next();
			System.out.println(name);
			}
		
		List values= new ArrayList();
		values.add("niranjana");
		values.add(30);
		System.out.println(values);
		
	}

}
