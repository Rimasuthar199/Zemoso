interface demoDefault {
	
	default void test() {
		System.out.println("DefaultMethod 1");
	}
	
	default void test2() {
		System.out.println("DefaultMethod 2");
	}
	
	public static void data() {
		System.out.println("statuc method..");
	}
}

interface demoDefault2 {
	
	default void test() {
		System.out.println("DefaultMethod 1");
	}
	
	default void test2() {
		System.out.println("DefaultMethod 2");
		
	}
	
	public static void data() {
		System.out.println("statuc method..");
	}
}

public class defauktTest implements demoDefault, demoDefault2{

	public static void main(String[] args) {
		
		defauktTest obj = new defauktTest();
		obj.test();
		obj.test2();
		demoDefault.data();

	}
	

	@Override
	public void test() {
		// TODO Auto-generated method stub
		demoDefault.super.test();
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		demoDefault.super.test2();
	}

}
