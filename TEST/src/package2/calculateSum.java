package package2;

import java.util.HashSet;
import java.util.Set;

public class calculateSum {

	public static void main(String[] args) {
		
		int arr[] = {5,8,9,4};
		int target = 9;
		Set<Integer> data = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			int minus = target - arr[i];
			if(data.contains(minus)) {
				System.out.println(minus+","+arr[i]);
			} else {
				data.add(arr[i]);
			}
		
		}
	}

}
