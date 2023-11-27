package com;
final class A {
	final void dis1() {
		System.out.println("A class method");
		
	}
}
class B extends A 
{
//	void dis1() {
//		System.out.println("dis1 method override by B class");
//	}
}
public class FinalKeywordExample {

	public static void main(String[] args) {
	final int A=10;
	System.out.println(A);
	//A=20;		
	System.out.println(A);
	B obj1 = new B();
	//obj1.dis1();
	}

}
