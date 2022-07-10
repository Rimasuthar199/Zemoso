package leetcode;

import java.util.ArrayList;

public class maximumSubarray {

	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int mid = Math.round((nums.length)/2);
		
		int sum = 0;
		ArrayList<Integer> a =  new ArrayList<Integer>();
		ArrayList<Integer> b =  new ArrayList<Integer>();
		for(int i=0; i<mid;i++) {
			for(int j=i+1;j<mid;j++) {
				int tempSum = 0;
				tempSum = nums[i]+nums[j];
				if(tempSum > sum && tempSum > 0) {
					sum = tempSum;
					a.clear();
					a.add(nums[i]);
					a.add(nums[j]);
				  } 
				}
			}	
		
		for (int i = mid-1; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int tempSum = 0;
				tempSum = nums[i] + nums[j];
				if (tempSum > sum && tempSum > 0) {
					sum = tempSum;
					a.clear();
					a.add(nums[i]);
					a.add(nums[j]);
				}
			}
		}	
		
		//a.addAll(b);
		a.forEach(data ->{
			System.out.println(data);
		});
	  }
	}
	


