class queueOperation{
	
	int que[] =  new int[5];
	int front ;
	int rear ;
	int size ;
	
	public void insert(int data) {	
		que[rear] = data;
		rear++;	
		size++;
	}
	
	public void delete() {
		int data = que[front];
		front = front + 1;
		size--;
	}
	
	public void rearFrintValue() {
		System.out.println();
		System.out.println("Rear "+ rear+ " Front " + front);
	}
	
	public void printValue() {
		for (int i = 0; i < size; i++) {
			System.out.print(que[front+i]+ " ");
		}
	}
}

public class Queue {

	public static void main(String[] args) {
		queueOperation queue = new queueOperation();
		queue.insert(5);
		queue.insert(4);
		queue.insert(3);
		queue.insert(2);
		queue.insert(1);
		
		queue.rearFrintValue();
		queue.printValue();
		
		queue.delete();
		queue.delete();
		queue.rearFrintValue();
		queue.printValue();
		

	}

}
