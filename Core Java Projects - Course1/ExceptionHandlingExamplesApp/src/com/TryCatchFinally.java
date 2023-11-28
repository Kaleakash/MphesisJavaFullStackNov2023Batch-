package com;

public class TryCatchFinally {

	public static void main(String[] args) {
	System.out.println("Hi");
	try {
			int result = 100/0;
		System.out.println("Result is "+result);
		System.out.println("No Exception");
	} catch (Exception e) {
		System.out.println("Catch block");
	}finally {
		System.out.println("finally block");
	}
	System.out.println("Finish");
	}

}
