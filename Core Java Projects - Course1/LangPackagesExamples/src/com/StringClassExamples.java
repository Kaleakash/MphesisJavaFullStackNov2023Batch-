package com;

public class StringClassExamples {

	public static void main(String[] args) {
	String str1 = "Welcome to Java Training";
	String str2 = new String("Welcome to Java Training");
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str1.length());
	System.out.println(str1.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.charAt(0));
	System.out.println(str1.indexOf('o'));
	System.out.println(str1.lastIndexOf('o'));
	System.out.println(str1.substring(5));
		String name1 = "Ravi";
		String name2 = "Ravi";		// only one memory string pooling 
	String name3 = new String("Ravi");
	String name4 = new String("Ravi");
//		if(name1==name3) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
	if(name1.equals(name4)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not Equal");
	}
	}

}
