package leetcode;

import java.util.Arrays;

public class duplicate2 {

	public static void main(String[] args) {
		
		int nums[] = {-2147483648,2147483647};
		int k =1,t =1;
		
		long data = ((-2147483648l)-2147483648l);
		System.out.println(data);
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				
				int abs = Math.abs(((nums[i]) - (nums[j])));
				int abs2 =  Math.abs(i-j);
				if(abs <=t && abs2 <=k) {
					System.out.println(true);
				}
			}
		}
	}
}
