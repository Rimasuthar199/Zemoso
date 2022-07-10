import java.util.ArrayList;

public class BcancyTest {

	public static void main(String[] args) {
		
		int a[] = {3,4,5,6};
		
	   // List data = Arrays.asList(a);
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			data.add(a[i]*a[i]);
		}
		
		int count = data.size();
		int count2 = 0;
		
		for (int i = 0; i < data.size(); i++) {
			
			System.out.print("(");
			while(count2 < count)
			{
				System.out.print(data.get(count2));
				System.out.println(",");
				count2++;
			}
			System.out.println(")");
			System.out.println();
			count2 = 0;
			count--;
		}
	    
	   // ArrayList<Integer> sqrData = data.stream().map(x->x*x).collect(Collectors.toList());

	}

}
