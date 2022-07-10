package package3;

import java.util.ArrayList;
import java.util.Collections;

public class revresArray {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(44);
		data.add(84);
		data.add(94);
		data.add(21);
		data.add(0);

		Collections.reverse(data);
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		
		data.forEach(n ->{
			data2.add(n);
		});
		
		data2.forEach(n ->{
			System.out.println(n);
		});
		
	}

}
