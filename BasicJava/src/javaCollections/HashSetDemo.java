package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
				
		HashSet <String> hs = new HashSet<String>();
		hs.add("Rayhan");
		hs.add("Iftakher");
		hs.add("Ahmed");
		
		System.out.println(hs); //to show all value in a line
		
	
//to print everything		
		Iterator<String> i = hs.iterator(); 
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
