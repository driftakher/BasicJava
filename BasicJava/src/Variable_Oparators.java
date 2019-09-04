
public class Variable_Oparators {

	public static void main(String[] args) {
		int x; //declaration
		x=450; //initialization
		int a=100; //For real number
		//also 'short' is used for number but smaller number 
		double b=250.5; //For desimel
		//also "float' is used for desimal but for smaller number
		char c='H'; //Used for single charecter and always have to use ''
		boolean i=true; //only used for true & false
		
		String s="welcome"; //Used for longer charecter, It is a derived/non-primitive data, Must be between ""
		String r="Rayhan"; 
		
		System.out.println(s+r);//when + is used for string it will collect all the charecter without spacing
			//those are variables
		System.out.println("---------Arithmetic Operators-----------");

//-------------------------------Operators in Java--------------------------------------------
	//Arithmetic opeartors ----> + - * / %
		int sum=x+a;
		int sub=x-a;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println("the Multiplication of x & a is "+ (x*a));
		//we can use "" to add static value and than + with () to add something else.
		System.out.println("the dividation of x & a is "+ (x/a));
		System.out.println("the remaining value of x / a is "+ (x%a)); //after dividation the remaining value is called % module
		
		System.out.println("---------Relational Operators-----------");
//Relational opeartors (for comparison) ----> ==(equal) < > <= >= !=(not equal)
//they always return boolean value
//Mainly they are used in Logical coding (if/else)
		System.out.println(x==a);//it will show 'false' because x=450 & a=100
		System.out.println(x>a);
		System.out.println(x<a);
		System.out.println(x!=a);
		System.out.println("---------Logical Operators-----------");
//Logical operators &&(and) ||(or)  !(not)
//works between two boolean 
//Mainly they are used in Logical coding
		boolean m=true;
		boolean n=false;
		System.out.println(m&&n);//it will show false result because m & n both are not ture
		System.out.println(m||n);//it will show true result because m or n one of thm is true
		System.out.println(!m);//it always shows opposite result
		
//incriment/decrementvariable  ++ --
		System.out.println("---------increment/decrement Operators-----------");
		int p=10;
		p++; //another way of saying p=p+1. //it will increase the value of a by one and make it the new set value of p
		System.out.println(p);//it will print new value of p
		int v=10;
		v--;//another way of saying v=v-1. //it will decrease the value of a by one and make it the new set value of v
		System.out.println(v);//it will print new value of v
	}

}
