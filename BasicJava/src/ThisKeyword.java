
public class ThisKeyword {
	
	int a, b; //Instance variable
	
	void getValue (int a, int b) { //local variable but we used same name as instance variable.
		this.a=a; //we can give same variable name in both instance & local variable and just here simply asign them by "a=a" and system will show no error but the result will come 0
		this.b=b; // to solve this problem we use "this" keyword to let system know which variable is "Instance"variable. And the other one without 'this' keyword is local variable. 
		
	}
	
	void printValue() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		th.getValue(5, 6);
		th.printValue();

	}

}
