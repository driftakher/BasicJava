package interfacetest;

public class InterfaceTest implements InterfaceA { //as soon we put implement key it will show us error until we implement the interface

	
	
	public static void main(String[] args) {
		InterfaceTest t1 = new InterfaceTest(); //if we want to use the interface in the class we have to create an object of the class not the interface (can't be created)
		t1.m1();

	}

@Override
public void m1() { //we can't be able to change the access modifier 'public' to anything else. if we try to change it, it will show error.
	System.out.println(a); //because a is static & final we can directly use it without creating any object.
	
}

}
