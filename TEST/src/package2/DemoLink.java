package package2;

import java.util.HashSet;
import java.util.Set;

class Node{
	
	Node node;
	Node next;
	int data;
	
}

class linkOperations{
	
	Node head;
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		} else {
			
			Node next = head;
			while(next.next !=null) {
				next = next.next;
			}
			next.next = node;	
		}
		
	}
	
	public void print() {
		
		Node current = head;
		while(current.next!=null) {
			System.out.print(" " +current.data);
			current = current.next;
		}
		System.out.println(" " +current.data);
	}
	
	public void delete(int data) {
		Node node = head;
		if (node.data == data) {
			head = head.next;
		} else {
			Node current = head;
			while (current.next != null) {
				if (current.next.data == data) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}

			}

		}

	}
	
	public void makeLoop() {
		 head.next.next = head.next;
	}
	
	public void detectLoop() {
		
		Node ptr1 = null;
		Node ptr2 = null;
		
		Node cuNode = head;
		
		while(cuNode.next != null) {
			
			ptr1  = cuNode;
			ptr2 = cuNode.next;
			
			if(ptr1 == ptr2) {
				System.out.println("Yess");
				break;
			}
			cuNode = cuNode.next;
		}
		
	}
	
	public void printMiddle() {
		Node ptr1 = head;
		Node ptr2=  head;
		
		while(ptr2 !=null && ptr2.next !=null) {
			
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			
		}
		System.out.println(ptr1.data);
	}
	
	public void reverse() {
		
		Node prev = null;
		Node next  = null;
		Node current  = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev =  current;
			current = next;
		}
		head = prev;
		
	}
	
	public void removeDuplicate() {

		Node ptr1 = head;
		Node ptr2 = head;

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
	
	
	public void sortList() {
		
		Node ptr1 = head;
		Node ptr2 = null;
		
		while(ptr1 != null) {
			ptr2 = ptr1;
			
			while(ptr2 != null) {
				Node temp = null;
				if(ptr1.data > ptr2.data) {
					temp = ptr1;
					ptr1.data = ptr2.data;
					ptr2.data = temp.data;
				}
				ptr2 = ptr2.next;
			}
			ptr1 = ptr1.next;
		}
		
	}
	
 

}

public class DemoLink {
	
	public static void main(String[] args) {
		
		linkOperations ops = new linkOperations();
		ops.insert(5);
		ops.insert(4);
		ops.insert(3);
		ops.insert(2);
		ops.insert(1);
		//ops.print();
		//ops.delete(1);
		//ops.makeLoop();
		//ops.detectLoop();
		//ops.printMiddle();
		//ops.print();
		//ops.reverse();
		//ops.print();
		//ops.removeDuplicate();
		ops.sortList();
		ops.print();
		
	}

}	
