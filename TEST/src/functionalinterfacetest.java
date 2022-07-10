@FunctionalInterface
interface ftest{
	
	void data();
	
}

@FunctionalInterface
interface ftest2 extends ftest{
	
	void data();
	
}

class testf implements ftest,ftest2{

	@Override
	public void data() {
		
		System.out.println("Yesssssssssssssssssss");
	}
	
}

public class functionalinterfacetest {

	 static void main(String[] args) {
		
		testf h = new testf();
		h.data();
		
	}

}
