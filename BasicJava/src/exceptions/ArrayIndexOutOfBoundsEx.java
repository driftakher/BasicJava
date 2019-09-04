package exceptions;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		System.out.println("Step 2");
				
		int a [] = new int [5]; //created a Array of 5 location 0-4
		a[10]=50; //but we inserting Array in 10th locatiion which is not present
		//throws ArrayIndexOutOfBoundsException
		
		System.out.println("Step 3");
		System.out.println("Program Ended");
	}

}
