package mno;

abstract class A {
		abstract void dis1();
}
class B extends A {
	@Override
	void dis1() {
		System.out.println("A class method overrided by B class");
	}
	void dis2() {
		System.out.println("B class method its own mthod ");
	}
}
public class Demo2 {
	public static void main(String[] args) {
		//A obj1 = new A();			// creating super class object we can't create object ie abstrat 
		//obj1.dis1();
		B obj2  = new B();			// creating sub class object 
		obj2.dis1();
		obj2.dis2();
		//B obj3 = new A();		// super class object and sub class reference not possible. 
		A obj4 = new B();		// sub class object and super class reference possible. super class can be abstract class.  
		obj4.dis1();						// with help of abstract class reference we can call only those methods  
		//obj4.dis2();					// that abstract class. 
	}							
}
