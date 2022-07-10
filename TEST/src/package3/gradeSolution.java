package package3;

import java.util.ArrayList;

public class gradeSolution {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(44);
		data.add(84);
		data.add(94);
		data.add(21);
		data.add(0);
		data.add(18);
		data.add(100);
		data.add(18);
		data.add(62);
		data.add(30);
		data.add(61);
		data.add(53);
		data.add(0);
		data.add(43);
		data.add(2);
		data.add(29);
		data.add(53);
		data.add(61);
		data.add(40);
		data.add(14);
		data.add(4);
		data.add(29);
		data.add(98);
		data.add(37);
		data.add(23);
		data.add(46);
		data.add(9);
		data.add(79);
		data.add(62);
		data.add(20);
		data.add(38);
		data.add(51);
		data.add(99);
		data.add(59);
		data.add(47);
		data.add(4);
		data.add(86);
		data.add(61);
		data.add(68);
		data.add(17);
		data.add(45);
		data.add(6);
		data.add(1);
		data.add(95);
		data.add(95);
		
		
		
		data.forEach(n ->{
			if(n%5 == 0) {
				System.out.println("Number " + n);
			} else {
				int count = 1;
				while(count<=5) {
					if((n+count)%5 == 0) {
						break;
					} else {
						count++ ;
					}
				}
				
				int minus = (n+count) - n ;
				if(minus < 3 && (n+count) >38) {
					System.out.println(n+count);
				} else {
					System.out.println(n);
				}
			}
		});
		
	}

}
