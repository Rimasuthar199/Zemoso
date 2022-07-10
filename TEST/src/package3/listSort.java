package package3;

public class listSort {

	public static void main(String[] args) {
		int list[] = { 78, 45, 88, 55, 45, 0, 1, 1, 401 };

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {

				int temp = 0;
				if (list[i] > list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(" " +list[i]);
		}
	}

}
