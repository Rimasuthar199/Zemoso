package leetcode;

import java.util.Arrays;

public class duplicates {
	
	public static void main(String[] args) {
		
		int arr[] = {3,3};
		Arrays.sort(arr);
		
		int p1 = 0;
		int p2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			p1 = i;
			p2 = i+1;
			if(p2 <= arr.length-1 && arr[p1]==arr[p2]) {
				System.out.println("Yess");
				break;
			}
		}
	}

}
