
public class ForLoop {

	public static void main(String[] args) {
// ==============For Loop======================
//Main advantage of for loop is we can give all 3 necessary  (Initialize; condition; inc/dec) of loop in a single line in for.
//we use while loop mainly when we dont know the end value (where it stop) but if we know the end condition we use for loop.
		int sum=0;	
		for (int i=0; i<=100; i=i+2) {
				
				sum=sum+i;
		}
		
		System.out.println(sum);
	}

}
