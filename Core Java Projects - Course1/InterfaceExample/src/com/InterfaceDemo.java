package com;

interface Abc {					
	int A=10;
	void dis1();
}
interface Xyz {					
	int B=20;
	void dis2();
}

interface Mno extends Abc,Xyz{			
	int C=30;				
	void dis3();
}
class Demo implements Abc,Xyz {
	@Override
	public void dis2() {
		System.out.println("Xyz interface method");
		
	}
	@Override
	public void dis1() {
		System.out.println("Abc interface method");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
	Demo obj1  = new Demo();
	obj1.dis1();
	obj1.dis2();

	}

}
