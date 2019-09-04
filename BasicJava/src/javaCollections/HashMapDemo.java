package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

//=========Declaration==========
		HashMap <String,String> HM = new HashMap <String,String>(); //when keys and value both are String
		HashMap HM1 = new HashMap (); //When keys and value can be any data type
		HashMap <Integer,String> HM2 = new HashMap <Integer,String>(); //when keys are Int and value is String 
		
//=========Adding Pair into HashMap=======
		HM2.put(101, "Rayhan");
		HM2.put(102, "Ahmed");
		HM2.put(103, "Iftakher");
		HM2.put(104, "Ahmed2");
		
		System.out.println("All paired Data "+HM2);
		
//========Remove Pair from HashMap=========
		HM2.remove(104); //Need to give the Key number
		System.out.println("After Removing "+HM2);

//========Read Value with For Loop=======
		for (Map.Entry m:HM2.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}
