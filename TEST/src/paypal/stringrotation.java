package paypal;

public class stringrotation {

	public static void main(String[] args) {
		
		String  S1= "HELLO";
		String  S2= "LOHEL";
		
		if(S1.length() != S2.length()) {
			System.out.println(false);
		} else {
			String temp = S1+S2;
			if(temp.indexOf(S2) != -1) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}

}
