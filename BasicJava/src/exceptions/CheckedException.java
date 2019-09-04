package exceptions;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is Started");
		System.out.println("Step 2");
		
//Handling Checked exception with TRY/CATCH
		
		try {
			Thread.sleep(5000); //throws InterruptedException
		} catch (InterruptedException e) {
			
		}
	

		System.out.println("Step 3");

//Handling Checked exception with Throws keyword
				Thread.sleep(5000);		
		
		System.out.println("Program Ended");

	}

}
