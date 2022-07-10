package package3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPI {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		List<Integer> squares = l.stream() .map( i -> i*i) .collect(Collectors.toList());

		System.out.println(squares);
		
	}

}
