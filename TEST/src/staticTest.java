public class staticTest {

	public static void main(String[] args) {

		String str = "abfgrt458jgjgy856";

		char[] charArray = str.toCharArray();
		
		int sum = 0;
		int count =1;

		for (int i = charArray.length-1; i >=0; i--) {
			if (Character.isDigit(charArray[i])) {
				if(count<=4)
				sum+=Integer.parseInt(String.valueOf(charArray[i]));
				count++;
			 }
		}
		System.out.println(sum);
	}
}
