package interfacetest;

public class MultipleInterface implements InterfaceB, InterfaceA, InterfaceC{ //we can implement multiple interface at a same time just by writing them with ","
								//as soon as we use implement it will show error until we implement all the interfaces. 
	public static void main(String[] args) {
		// To use interface in main method we have to create an object with the class not with interface name
		MultipleInterface test = new MultipleInterface();
		test.m1();
		test.m2();
		test.m3();

	}

	@Override
	public void m3() {
		System.out.println(y);
		
	}

	@Override
	public void m1() {
		System.out.println(a);

	}

	@Override
	public void m2() {
		System.out.println(x);
		
	}

}
