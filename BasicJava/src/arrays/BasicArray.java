package arrays;

public class BasicArray {
		//Array is collection of elements of same data type.
		//2 type of Array ---- 1. Single dimensional ------2. Two/Multi dimensional

//====================Single dimensional=====================================
	public static void main(String[] args) {
		int x[]=new int[5];		//this is how declare array. another way "int []x=new int[5]". And 5 here is the size / number of data in Array.
								//here starting index is 0 and last index is 4
		x[0] = 100;		//to add value to array just give array name and index number in [] and add value.
		x[1] = 200;
		x[2] = 300;
		x[3] = 400;
		x[5] = 500;
		
		int y[]= {10,20,30,40,50}; //this is another way of making array. and advantage is declear an array without limiting the size, so we can add many values within {}

//--------------------to find the size of an array we use "length" keyword	
			System.out.println(y.length);
			System.out.println(x[3]);
	}

}
