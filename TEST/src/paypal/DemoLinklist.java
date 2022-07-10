package paypal;



class NodeData{
	
	int data;
	NodeData next;
	
}

class linklistOperation{
	NodeData head;
	
	public void push(int data) {
		NodeData newData = new NodeData();
		newData.data = data;
		if(head == null) {
			head = newData;
		} else {
			NodeData cuNode = head;
			while(cuNode.next!=null) {
				cuNode = cuNode.next;
			}
			cuNode.next = newData;
		}
		
	}
	
	public void pop(int data) {
		
		NodeData delData = head;
		if(delData.data == data) {
			head = head.next;
		} else {
			NodeData del = head;
			while(del.next !=null) {
				if(del.next.data == data) {
					del.next = del.next.next;
				} else {
					del = del.next;
				}
			}
		}
		
	}
	
	public void middel() {
		
		NodeData ptr1 = head;
		NodeData ptr2 = head;
		
		while(ptr2 != null && ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;	
		}
		System.out.println();
		System.out.println(ptr1.data);
	}
	
	public void printList() {
		System.out.println();
		NodeData cuNode = head;
		while(cuNode != null) {
			System.out.print(" " + cuNode.data);
			cuNode = cuNode.next;
		}
	}
	
	public void makeLoop() {
		 head.next.next.next = head.next;
	}
	
	public void detectloop() {
		NodeData ptr1 = head;
		NodeData ptr2 = head;
		
		while(ptr2 != null && ptr2.next != null) {
			
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			
			if(ptr1 == ptr2) {
				System.out.println("YESSS");
				break;
			}
			
	    }
	
	}
	
	public void reverse() {
		
		NodeData prev = null;
		NodeData next = null;
		NodeData cuData = head;
		while(cuData!= null) {		
			next = cuData.next;
			cuData.next = prev;
			prev = cuData;
			cuData = next;	
		}
		head = prev;
	}
	
	public void duplicate() {

		NodeData ptr1 = head;
		NodeData ptr2 = head;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					ptr2.next = ptr2.next.next;
				}else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}

	}
}

public class DemoLinklist {

	public static void main(String[] args) {
		
		linklistOperation obj = new linklistOperation();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(3);
		obj.push(4);
		obj.printList();
		
		//obj.pop(3);
		//obj.printList();
		
		obj.middel();
		//obj.reverse();
		//obj.printList();
		
		obj.duplicate();
		obj.printList();
		
		//obj.makeLoop();
		//obj.detectloop();
		
	}

}
