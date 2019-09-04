package interfacetest;

public interface InterfaceA {
		int a=10; //By default variable in interface are static & final. No need any Final/Static keyword.
		
		void m1(); //abstract method, no body of the method. By default it is public. no need "public" key
		
		//if we want to use this interface we have to have a class.
}
