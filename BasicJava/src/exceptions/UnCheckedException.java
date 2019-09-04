package exceptions;

public class UnCheckedException {
//Arithmetic exception
	public static void main(String[] args) {
		System.out.println("Program is Started");
		System.out.println("Step 2");
		
		int a = 50;
	//if we divide any number with 0 it will show arithmetic exception 	
		
//====To Handling exception with try catch
		try {
			System.out.println(a/0); //if any number divided by 0 it will show ArithmeticException
		}
		catch(ArithmeticException e) {
			System.out.println("Entered in Catch Block");
		}
		
//========Handling exception with Throws keyword
		
		
		
		System.out.println("Step 3");
		System.out.println("Program Ended");

	}

}
