package staticKey;

public class StaticVariable {
	String Name = "Rayhan";
	int Roll = 15;
	static String School = "NEMC"; //Static variable
	
	static void m1 () { 			//static method 
		System.out.println("This is m1 - Static Method");
	}
	
	void m2 () {
		System.out.println("This is m2 - Non Static Method");
	}
	
	void m3 () { //non static method can access both static and non static method directly.
		System.out.println(Name);
		System.out.println(Roll);
		System.out.println(School);
	}
	
	public static void main(String[] args) {
		System.out.println(School); //static method can access only static stuff directly. we dont have to create object for that. 
		m1 (); 
	//	m2 (); //but for not static method we have to create object. thats why it showing error
		StaticVariable sv = new StaticVariable();
		sv.m2(); //to access not static variable / method we must have to create object
		sv.m3();
	}

}
