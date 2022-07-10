package package3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demoargusoft {

	public static void main(String[] args) {
		
		ArrayList<Integer> data  = new ArrayList<Integer>();
		data.add(20);
		data.add(10);
		data.add(4);
		data.add(5);
		data.add(8);
		data.add(9);
		
		List<Integer> tempData=  data.stream().map(i -> i*2).collect(Collectors.toList());


	}

}
