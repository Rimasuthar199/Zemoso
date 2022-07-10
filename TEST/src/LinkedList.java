import java.util.HashSet;

class Node {
	Node node;
	Node next;
	int data;
	
}

class operations{
	
	Node head;
	int count=0;
	
	public void insert(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		} else {
			
			Node next = head;
			while(next.next != null) {
				next = next.next;
			}
			next.next = newNode;
		
		}
		count++;
	}
	
	public void delete(int data) {
		
		
		if(head.data == data) {
			head = head.next;
		} else {
			Node node = head;
			while(node.next != null) {
				if(node.next.data == data) {
					if(node.next.next != null) {
						node.next = node.next.next;
					} else {
						node.next = null;
						break;
					}
					
				}
			node = node.next;
			}
			
		}
		count--;
		
	}
	
	public void makeLoop() {
		head.next.next.next.next.next.next.next.next.next = head;
	}
	
	public void deleteLoop() {
		 HashSet<Node> s = new HashSet<Node>();
	        while (head != null) {
	            if (s.contains(head)) {
	            	 System.out.println("Contains loop");
	            	 
	            }  
	            s.add(head);
	 
	            head = head.next;
	        }
	 
	        System.out.println("Not Contains loop");
	
		
	}
	
	public void detectLoop() {
		 HashSet<Node> s = new HashSet<Node>();
	        while (head != null) {
	            // If we have already has this node
	            // in hashmap it means their is a cycle
	            // (Because you we encountering the
	            // node second time).
	            if (s.contains(head)) {
	            	 System.out.println("Contains loop");
	            }  
	          
	            // If we are seeing the node for
	            // the first time, insert it in hash
	            s.add(head);
	 
	            head = head.next;
	        }
	 
	        System.out.println("Not Contains loop");
	}
	
	public void show() {
		
		Node next = head;
		while(next.next !=null) {
			System.out.print(" " +next.data);
			next = next.next;
		}
		System.out.print(" " + next.data + "\n");
		System.out.println("---------------------------");
	}
	
	public int printSize() {
		return count;
	}
	
	public void printMiddelValue() {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer!=null && fastPointer.next!=null) {
			fastPointer = fastPointer.next.next;
				slowPointer = slowPointer.next;
			
		}
		System.out.println("Middel Value " +slowPointer.data);
	}
	
	public void nthNode(int n) {
		 int len = printSize();
	        Node temp = head;
	
	        for (int i = 1; i < len - n + 1; i++)
	            temp = temp.next;
	 
	        System.out.println(temp.data);
	}
	
	public void deleteLastOcuurence(int x) {
		Node temp = head;
		Node ptr = null;

		while (temp != null) {
			if (temp.data == x)
				ptr = temp;

			temp = temp.next;
		}
		
		  if (ptr != null && ptr.next == null)
		    {
		        temp = head;
		         
		        while (temp.next != ptr)
		        {
		            temp = temp.next;
		        }
		        temp.next = null;
		    }
		  
		  if (ptr != null && ptr.next != null)
		    {
		        ptr.data = ptr.next.data;
		        ptr.next = ptr.next.next;
		    }
		    
		     

	}
	
	public void printReverse() {
		
		 Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
		
	}
	
}

public class LinkedList {

	public static void main(String[] args) {
	
	operations op = new operations();
	op.insert(1);
	op.insert(2);
	op.insert(3);
	op.insert(4);
	op.insert(5);
	op.insert(6);
	op.insert(7);
	op.insert(8);
	op.insert(2);
	op.insert(2);
	op.insert(1);
	op.insert(2);
	//op.show();
	//op.nthNode(2);
	//op.deleteLastOcuurence(2);
	op.printReverse();
	op.show();
	//op.printSize();
	//op.printMiddelValue();
//	op.show();
//	op.delete(14);
//	op.printSize();
//	op.show();
//	op.delete(15);
//	op.delete(16);
//	op.delete(18);
//	op.show();
	
	}

}
