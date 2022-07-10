class AR
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends AR
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
  
// Driver class
class Test
{
    public static void main(String args[])
    {
        // object of type A
    	AR a = new AR();
  
        // object of type B
        B b = new B();
  

        // obtain a reference of type A
        AR ref;
          
        // ref refers to an A object
        ref = a;
  
        // calling A's version of m1()
        ref.m1();
  
        // now ref refers to a B object
        ref = b;
  
        // calling B's version of m1()
        ref.m1();

    }
}