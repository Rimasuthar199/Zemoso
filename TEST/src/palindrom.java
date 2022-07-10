
public class palindrom {

	public static void main(String[] args) {
		
		String data = "badam";
		
		int len = data.length();
		String str = "";
		for (int i = len-1; i>=0; i--) {
			str = str + data.charAt(i);
		}

		System.out.println(data.equalsIgnoreCase(str));
		
		int num = 3553, reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /=10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
		
		
		
	}

}
