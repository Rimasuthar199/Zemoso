package leetcode;

import java.util.Arrays;

public class mergeSortArray {
	
	public static void main(String[] args) {
		
		int nums1[] = {0,0,0,0,0};
		int m =0, n=5;
		int nums2[] = {1,2,3,4,5}; 
		
		if(m == 0) {
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = nums2[i];
			}
			Arrays.sort(nums1);
			System.out.print(Arrays.toString(nums1));
		} else if(n == 0) {
			Arrays.sort(nums1);
			System.out.print(Arrays.toString(nums1));
		} else {
			int count = 0;
			for(int i= m; i<nums1.length;i++) {
				nums1[i] = nums2[count];
				count++;
			}
			Arrays.sort(nums1);
			System.out.print(Arrays.toString(nums1));
		}
	}
}
