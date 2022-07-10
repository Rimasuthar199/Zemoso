import java.util.PriorityQueue;

public class kthsmallestElement {

	public static void main(String[] args) {
		
		int[] arr = {7,10,4,3,20,15};
		int k = 1;
		System.out.println();
		System.out.println(solve(arr,k));
	}

	private static int solve(int[] arr, int size) {
		PriorityQueue<Integer> data = new PriorityQueue<Integer>((a,b)->b-a);
		for(Integer a : arr) {
			data.offer(a);
			if(data.size() > size) {
				data.poll();
			}
		}
		return data.peek();
	}

}
