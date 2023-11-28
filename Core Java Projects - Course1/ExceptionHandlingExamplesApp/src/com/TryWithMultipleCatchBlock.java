package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int abc[]= {10,20};
		String s1 = "10a";
		try {
			int res1 = 100/1;
			System.out.println("Result is "+res1);
			int res2 = abc[0];
			System.out.println("Result is "+res2);
			System.out.println(s1+10);
				System.out.println(Integer.parseInt(s1)+10);
			System.out.println("No Exception");
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by Zero "+e.toString());
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Array index or Null Pointer"+e.toString());
		}catch(Exception e) {
			System.out.println("generic "+e.toString());
		}
		
		System.out.println("Normal Statement");
	}

}
