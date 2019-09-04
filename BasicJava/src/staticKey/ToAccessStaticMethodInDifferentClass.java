package staticKey;

public class ToAccessStaticMethodInDifferentClass {

	public static void main(String[] args) {
		StaticVariable.m1(); //we still can access static method in different class without creating any object. 
		//we just just have to write the "class name.method name"

	}

}
