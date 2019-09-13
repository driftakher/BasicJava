package arrays;

public class Array12 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println(a[2]);
		System.out.println(a.length);

		//--------Normal way of printing all number in array
for (int i = 0; i<a.length; i++)
	System.out.println(a[i]);
		
//advanced/enhanced "for loop" for array. we dont need condition or increment/decrement		
		for (int i:a) {
			System.out.println(i);
		}
		
	}

}
