
public class DoWhileLoop {

	public static void main(String[] args) {
	//==================Do...while...=======================
		//Main difference between while & do..while loop is- in do.while frist time system will not run the condition it will directly exucute the statement and then each time it will run the condition. But in while loop it will always start with condition and then go to statement.
		int i=20; //even i is starting with 20 which is not following the condition but still the system will print 1 time.
		do {
			System.out.println(i);
			i++;
		}while (i<=10);

	}

}
