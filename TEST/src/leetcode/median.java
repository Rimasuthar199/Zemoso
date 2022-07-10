package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class median {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2}; int[] nums2 = {3,4};
		
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		
	//	Collections.addAll(one, nums1);
	
		
		one.addAll(two);
		
		if(one.size()%2 == 0) {
			System.out.println(one.get(one.size()/2));
		} else {
			int mid = Math.round(one.size()/2);
			int data1 =  one.get(mid-1);
		}

	}

}
