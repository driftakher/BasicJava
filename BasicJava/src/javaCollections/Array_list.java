package javaCollections;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		
//=======Declaration of ArrayList========
		ArrayList x = new ArrayList(); //creating object of predefined JavaUtil class 
		
		ArrayList <String> y = new ArrayList <String> (); //only store String
		
		ArrayList <Integer> z = new ArrayList <Integer> (); //only store int
		
//========Adding Value to ArrayList======
		x.add("Rayhan");
		x.add('A');
		x.add(100);
		x.add(9.2);
				
		System.out.println("All elements of X "+ x);
		
		System.out.println("Elements of 2nd position "+ (x.get(1)));
		
		y.add("Rayhan");
		y.add("Iftakher");
		y.add("Ahmed");
		
		
		System.out.println("All elements of Y "+ y);
		
//========To find the size of ArrayList=======
		System.out.println("Size of X "+x.size());
		System.out.println("Size of Y "+y.size());

		
//========Remove any element========
		y.remove(1);
		System.out.println("After Removing Element "+y);
		
//=======Inserting Element in specific slot=======
		y.add(1, "Rayhan2");
		System.out.println("After adding new element in 1 "+y);
		
//=======Reading Value using For loop==========
		for (String s:y) {  				//y has only string data so we use String here
			System.out.println(s);
		}
			
		
		for (Object r:x) {				//x has multiple data type so we use Object (which is a data type in java for storing multiple type of data)
			System.out.println(r);
		}
	}

}
