package arrays;

public class MultiDiArray {
	//has rows & column 
	public static void main(String[] args) {
		int a [][]=new int [3][2];//so there is 3 rows and 2 column 
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println(a.length); //number of raws
		System.out.println(a[0].length); //number of columns in 1st row. we have to mention any raw to find column
		
		int b [][]= {{10,20},{30,40},{50,60}}; //Add value by each rows in between {}
			
//we need nested for loop for print all multidimensional array.
		for (int i=0; i<a.length; i++) {				//outer for loop
				for (int j=0; j<a[i].length; j++) {		//inner for loop. for each raw it will run column
					System.out.println(a[i][j]);
									}
			}

//Enhanced for loop for print all multidimensional array.
		for (int r[]:b) { 		//because its a multidimensional array first we put all raws in single dimensional array and store it in r[]
			for (int p:r) {		//and this line will run loop for each single dimensional array and store it to "p"
				System.out.println(p);
			}
		}
	}

}
