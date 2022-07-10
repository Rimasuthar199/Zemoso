package package3;

public class TESTOverload {
	
	public void call(Object o) {
		System.out.println(o.toString());
	}
	
	public void call(String o) {
		System.out.println(o.toString());
	}
	
	public void call(Integer o) {
		System.out.println(o.toString());
	}
	
	public static void main(String[] args) {
		
		TESTOverload o = new TESTOverload();
		//o.call(null);
	}
	

}
