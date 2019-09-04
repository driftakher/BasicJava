package interfacetest;

public class HybridInharitance extends InterfaceTest implements InterfaceB, InterfaceC{
	//so this class will inherit everything from class InterfaceTest & also it will implement InterfaceB & InterfaceC

	public static void main(String[] args) {
		HybridInharitance MI = new HybridInharitance ();
		MI.m1();//it will come from class InterfaceTest
		MI.m2(); // coming through interface implement Interface B
		MI.m3(); // coming through interface implement Interface C

	}

	@Override
	public void m3() {
		System.out.println(y);
		
	}

	@Override
	public void m2() {
		System.out.println(x);
		
	}

}
