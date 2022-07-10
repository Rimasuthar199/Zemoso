class NodeData{
	
	NodeData next;
	int val;
	
}

class listOpertaions{
	
	NodeData head;
	
	public void insert(int data) {

		NodeData insertData = new NodeData();
		insertData.val = data;
		insertData.next = null;

		if (head == null) {
			head = insertData;
		} else {

			NodeData curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = insertData;
		}

	}
	
	public void insertMiddel(int data) {
		
		NodeData curr = head;
		while(curr != null) {
			if(curr.val == data) {
				
			}
		}
	}
	
}

public class TestIn {

	public static void main(String[] args) {
	
		
		int a[] = {10,11,12,13,14};
		//Link
		
		
	}

}
