public class TestDemo {
	
	
	private static TestDemo TestDemo = null;
	
	private TestDemo() {}
	
	public static TestDemo getInstance() {
	
		if(TestDemo == null) {
			TestDemo = new TestDemo();
		}
		System.out.println("HashCode " + TestDemo);
		return TestDemo;
	}

}
