package javaCollections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <Integer> x = new LinkedList <Integer> ();
		x.add(10);
		x.add(20);
		x.add(30);
		
		System.out.println(x.get(2));
		x.remove(1);
		
		List <Integer> y = new LinkedList <Integer>(); //example of Interface 
		
	}

}
