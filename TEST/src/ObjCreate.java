
@FunctionalInterface
interface test1{
	
	 void cal();
}

@FunctionalInterface
interface test2{
	
	 void cal();
	
	public static void cal2() {
		System.out.println("sa");
	}
}
class obj implements test2, test1{

	@Override
	public void cal() {
		System.out.println("Datattaa");
		
	}	
}

public class ObjCreate {

	public static void main(String[] args) {
		test1 t = () -> System.out.println("testdata");
		t.cal();
		
		obj j = new obj();
		j.cal();
	}
	

}
