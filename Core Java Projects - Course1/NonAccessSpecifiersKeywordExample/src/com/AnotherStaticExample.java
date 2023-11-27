package com;
class Info {
	int a;
	static int b;
	void dis1() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class AnotherStaticExample {
	public static void main(String[] args) {
			Info obj1 = new Info();		// heap memory 
				Info obj2 = new Info();	// heap memory 
					obj1.a=100;
						obj1.b=200;
							Info.b=300;
							obj2.a=400;
									obj2.b=500;
										Info.b=600;
	obj1.dis1();      // a =100     b=600
	obj2.dis1();      // a =400     b=600 

	}

}
