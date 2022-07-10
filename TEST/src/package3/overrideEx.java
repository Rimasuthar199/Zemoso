package package3;

//A Simple Java program to demonstrate
//method overriding in java

//Base Class
class Parent {
	
	int a= 10;
	
	void show()
	{
		System.out.println("Parent's show()");
	}
}

//Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	
	int a= 20;
	
	@Override
	void show()
	{
		System.out.println("Child's show()");
	}
}

//Driver class
class overrideEx {
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}

