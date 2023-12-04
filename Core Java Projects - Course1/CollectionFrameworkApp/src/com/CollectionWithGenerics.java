package com;
import java.util.*;
public class CollectionWithGenerics {

	public static void main(String[] args) {
//	List ll =new ArrayList();
//	ll.add(10); // added int value converted into object ]
//	ll.add(10.20);
//	ll.add("Ravi");
//	System.out.println(ll);
//	Object obj=	ll.get(2);
//	Integer i = (Integer)obj;	// down level type casting
//	int n = i.intValue();
//	System.out.println(n);
		
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);			// auto boxing : primitive to objects 
	ll.add(20);
	ll.add(30);
	
	int n=ll.get(0);
	System.out.println(n);		// auto unboxing : converting object to primitive 
	}

}
