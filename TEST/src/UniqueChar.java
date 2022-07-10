import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueChar {

	public static void main(String[] args) {
	
		String data = "GeeksforGeeks";
//		List<String> diData = Stream.of(data).map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
//		System.out.println(Stream.of(data).distinct().findFirst());
//		for (String string : diData) {
//			System.out.print(""+string);
//		}
		HashMap<Character, Integer> mapData =  new HashMap<Character, Integer>();
		for (int i = 0; i < data.length(); i++) {
			if(mapData.isEmpty()) {
				mapData.put(data.charAt(i), i);
			} else {
				if(mapData.containsKey(data.charAt(i))) {
					mapData.put(data.charAt(i), -1);
				} else {
					mapData.put(data.charAt(i), i);
				}
			}
		}
			int index = data.length();
			String uniques = "";
		 for (Map.Entry<Character, Integer> entry : mapData.entrySet()) {
			 if(entry.getValue() != -1) {
				 if(entry.getValue() < index) {
					 index = entry.getValue();
					 uniques  = String.valueOf(entry.getKey());
				 }
			 }
		 }
		
		System.out.println(uniques);
	}

}
