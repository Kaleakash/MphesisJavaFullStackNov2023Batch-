package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {100,200,300,400};
			try {
				int res = a/b;
			System.out.println("Result is "+res);
				int res1 = 100/abc[5];
			System.out.println("Result "+res1);
			}catch(Exception e) {
				//System.out.println("I Take Care!");
				//System.out.println(e.getMessage());  // short message of exception 
				System.out.println(e.toString());// name of exception as well as message 
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
		
	}

}
