class A{
	
	int top= 0;
	int capacity = 2;
	int stack[] = new int[5];
	
	public void insert(int data) {

		if (top == capacity) {
			expand();
		} else {
			stack[top] = data;
			top++;
		}
	}
	
	public void peek() {
		System.out.println("Peek value is : " +stack[top-1]);
	}
	
	public void pop() {
		if(isEmpy()) {
			System.out.println("Stack is Empty");
		} else {
			top--;
			while(top >= 0) {
				stack[top] = 0;
				top--;
			}
		}
		
	
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpy() {
		return top <= 0;
	}
	
	private void expand() {
		int length = size();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity*=2;
		
	}
	
	public void printStack() {
		if(isEmpy()) {
			System.out.println("Stack is Empty can't print data");
		} else {
			for (int i = 0; i < stack.length; i++) {
				System.out.println(stack[i]);
			}
			System.out.println("---------------------------------");
		}
		
	}
	
}

public class Stack {

	public static void main(String[] args) {
		
		A a = new A();
		a.insert(1);
		a.insert(2);
		a.insert(3);
		a.insert(4);
		a.insert(5);
		a.insert(6);
		a.printStack();
		a.pop();
		a.printStack();
		
		
	}
	
}
