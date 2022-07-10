package package3;

public class defaultMethod implements temp1, temp2{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		temp1.super.test();
	}

	public static void main(String[] args) {
		defaultMethod d = new defaultMethod();
	d.test();
	}
}
