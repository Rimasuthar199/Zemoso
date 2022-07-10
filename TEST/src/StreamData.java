import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamData {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(12);
		data.add(45);
		data.add(13);
		data.add(78);
		data.add(9);
		data.add(5);
		data.add(19);
		data.add(48);
		
		List<Integer> even =  data.stream().filter(val -> val%2==0).collect(Collectors.toList());
		System.out.println(even);
		List<Integer> sortList =  data.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList);
	}

}
