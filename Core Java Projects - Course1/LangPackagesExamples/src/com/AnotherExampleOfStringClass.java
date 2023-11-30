package com;

public class AnotherExampleOfStringClass {

	public static void main(String[] args) {
	String name = "Raj";
		System.out.println(name);
	System.out.println(name+" Deep");
	System.out.println(name.toLowerCase());
		System.out.println(name);
		name = name+" Deep";
		System.out.println(name);
		System.out.println("---------------");
		//StringBuffer sb ="Welcome";
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		System.out.println(sb.append("Deep"));
			System.out.println(sb);
			System.out.println(sb.delete(2, 4));
			System.out.println(sb);
			sb.insert(2, " Kumar d");
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
	}

}
