package com;

public class WrapperClassDemo {

	public static void main(String[] args) {
	int a=10;		// primitive data type 
	//Integer b = new Integer(a);		// converting primitive to object 
	Integer b =a;		// auto-boxing : converting primitive to object. 
	System.out.println(a);
	System.out.println(b);
	int c = b.intValue();   // converting object to primitive 
	float d = b.floatValue();
	System.out.println(c);
	System.out.println(d);
	// String to integer or vice-versa 
	String s1="10";
	String s2 = "20";
	System.out.println(s1+s2);
	int s3 = Integer.parseInt(s1);
	int s4 = Integer.parseInt(s2);
	System.out.println(s3+s4);
	String s5 = String.valueOf(s3);
	String s6 = String.valueOf(s4);
	System.out.println(s5+s6);
	}

}
