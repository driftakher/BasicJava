package arrays;

public class Array12 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println(a[2]);
		System.out.println(a.length);

//advanced/enhanced "for loop" for array. we dont need condition or increment/decrement		
		for (int i:a) {
			System.out.println(i);
		}
		
	}

}
