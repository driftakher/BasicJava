package exceptions;

public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		System.out.println("Step 2");
		
		String s = "ABC";
		int i = Integer.parseInt(s); //throws NumberFormatException
				//Integer.ParseInt ==== this convert one type of data to another
		System.out.println("Step 3");
		System.out.println("Program Ended");

	}

}
