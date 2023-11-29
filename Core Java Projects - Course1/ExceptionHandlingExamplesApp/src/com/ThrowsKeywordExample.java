package com;

public class ThrowsKeywordExample {

	static void dis1() throws Exception{
		//try {
			int res = 100/0;
		//}catch(Exception e) {}
		System.out.println("This is dis1 method");
	}
	static void dis2() throws Exception{
		//try {
		dis1();
		//}catch(Exception e) {}
		System.out.println("This is dis2 method");
	}
	public static void main(String[] args) throws Exception {
		try {
		dis2();
		}catch(Exception e) {}
		System.out.println("This is main method");
	}

}
