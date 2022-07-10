import java.util.ArrayList;

public class MergerTwoArray {

	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7,10, 12};
		int arr2[] = {0, 2, 6 ,8, 9};
		
		int ptr1 = 0;
		int ptr2 = 0;
		ArrayList<Integer> data = new ArrayList<Integer>();
		while(ptr1 < arr1.length && ptr2 < arr2.length) {
			if(arr1[ptr1] < arr2[ptr2]) {
				data.add(arr1[ptr1]);
				ptr1++;
			} else {
				data.add(arr2[ptr2]);
				ptr2++;
			}
		}	
		
		while(ptr2 < arr2.length) {
			data.add(arr2[ptr2]);
			ptr2++;
		}
		
		while(ptr1 < arr1.length) {
			data.add(arr1[ptr1]);
			ptr1++;
		}
		
		data.forEach( w ->{
			System.out.print(" "+w);
		});
	}
}
