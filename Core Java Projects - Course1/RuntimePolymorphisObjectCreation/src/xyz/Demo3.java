package xyz;
interface A {
		abstract void dis1();
}
class B implements A {
	@Override
	public void dis1() {
		System.out.println("A class method overrided by B class");
	}
	void dis2() {
		System.out.println("B class method its own mthod ");
	}
}
public class Demo3 {
	public static void main(String[] args) {
		//A obj1 = new A();			// interface we can't create object. 
		//obj1.dis1();
		B obj2  = new B();			// creating sub class object 
		obj2.dis1();
		obj2.dis2();
		//B obj3 = new A();		// super class object and sub class reference not possible. 
		A obj4 = new B();		// sub class object and interface reference possible.
		obj4.dis1();           // using this reference we can call only those method which belong to that interface. 
	}							
}
