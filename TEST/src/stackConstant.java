class Stackoperation{
	
	int capacity = 2;
	int scapacity = 2;
	int stack[] =  new int[capacity];
	int supportingStack[] =  new int[scapacity];
	int top =0;
	int stop=0;
	public void push(int data) {
		
		if(top == capacity) {
			expand();
		} 
			stack[top] = data;
			top++;
		
		
		if(stop ==  scapacity) {
			sexpand();
		} 
			if(stop==0) {
				supportingStack[stop] = data;
				stop++;
			} else {
				if(data < supportingStack[stop-1]) {
					supportingStack[stop] = data;
					stop++;
				}
			}
				
		}
		

	
	public void expand()
	{
		int length = size();
		int newStack[] =  new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack =  newStack;
		capacity*=2;
	}
	
	public void sexpand()
	{
		int length = size();
		int newStack[] =  new int[scapacity*2];
		System.arraycopy(supportingStack, 0, newStack, 0, length);
		supportingStack =  newStack;
		scapacity*=2;
	}
	
	public int size() {
		return top;
	}
	
	public int ssize() {
		return stop;
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty can't print data");
		} else {
			for (int i = 0; i < stack.length; i++) {
				System.out.println(stack[i]);
			}
			System.out.println("---------------------------------");
			for (int i = 0; i < supportingStack.length; i++) {
				System.out.println(supportingStack[i]);
			}
		}
		
	}
	
	public boolean isEmpty() {
		return top <=0;
	}
	
	public void getMin() {
		System.out.println("Min is :" +supportingStack[stop-1]);
	}
	
}


public class stackConstant {

	public static void main(String[] args) {
		
		Stackoperation a = new Stackoperation();
		a.push(10);
		a.push(20);
		a.push(10);
		a.push(30);
		a.push(40);
		a.push(5);
		
		a.printStack();
		a.getMin();

	}

}
