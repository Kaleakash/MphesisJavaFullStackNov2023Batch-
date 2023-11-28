package abc;
class A {
		void dis1() {
			System.out.println("A class method its own method");
		}
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
public class Demo1 {
	public static void main(String[] args) {
		A obj1 = new A();			// creating super class object 
		obj1.dis1();
		B obj2  = new B();			// creating sub class object 
		obj2.dis1();
		obj2.dis2();
		//B obj3 = new A();		// super class object and sub class reference not possible. 
		A obj4 = new B();		// sub class object and super class reference possible. 
		obj4.dis1();						// with help of super class referene we can call only those method 
		//obj4.dis2();
	}							// which belong to super class or overrided method. 
}
