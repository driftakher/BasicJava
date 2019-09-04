package exceptions;

public class NullPointException {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		System.out.println("Step 2");
		
		String s = null; //if we give any value to s it will not show exception
		
		
		try {
			System.out.println(s.length()); //throws NullPointerException
		}
		catch(Exception e) { //Exception is super class of Exception. if we dont know which kind of exception will show then we can use it and it can handle all kind of exceptions.
			System.out.println("Entered into catch block");
		}
		finally {
			System.out.println("Finally it will come exception present or not");
		}
		
		
		
		System.out.println("Step 3");
		System.out.println("Program Ended");


	}

}
