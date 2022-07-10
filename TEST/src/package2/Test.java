package package2;

class d1 { 
	int x = 20;
 void m1() {
       System.out.println("m1 in class A");	 
 }
}
 class d2 extends d1 {
	 int x = 30;
 void m1() {
       System.out.println("m1 in class B");	 
 }
}
public class Test {
public static void main(String[] args) 
{
    d2 b = new d2();
     b.m1(); 
     System.out.println(b.x);
 
    d1 a = new d1();
     a.m1();
     System.out.println(a.x);
 
    d1 a2 = new d2();
     a2.m1();
     System.out.println(a2.x);
  }
}