class AB
{
	int a = 10;
	public  void test() {
		System.out.println("A method");
	}
}

class BA extends AB{
	
	@Override
	public  void test() {
		//super.test();
		System.out.println("B method");
	}
}

public class overridetest {
	public static void main(String[] args) {
		AB a = new AB();
		a.test();
		BA b = new BA();
		b.test();
		AB res = new BA();
		res.test();
	}
	
	

}
