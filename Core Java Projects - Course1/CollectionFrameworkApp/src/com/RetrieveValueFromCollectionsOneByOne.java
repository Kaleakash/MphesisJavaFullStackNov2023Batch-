package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class RetrieveValueFromCollectionsOneByOne {

	public static void main(String[] args) {
	// Set API 
//	Set ss = new HashSet();
//	ss.add(3); ss.add(2); ss.add(5);ss.add(7); ss.add(9);
//	System.out.println(ss);    // it display the output as string format 
//	System.out.println("Retrieve the value using for each loop or enhanced loop");
//	for(Object n:ss) {
//		System.out.println(n);
//	}
//	System.out.println("Retrieve the elements one by one");
//	 Iterator li  =  ss.iterator();
//	 while(li.hasNext()) {
//		 Object obj = li.next();
//		 System.out.println(obj);
//	 }
	// List API , LinkedList and ArrayList 
	
	List ll = new ArrayList();
	ll.add("Ravi");ll.add("Ramesh");ll.add("Ajay");ll.add("Vijay");
	System.out.println(ll);
	// for each loop or enhanced loop or iterator 
	ListIterator li = ll.listIterator();
	System.out.println("forward direction");
	while(li.hasNext()) {
		Object obj = li.next();
		System.out.println(obj);
	}
	System.out.println("backward direction");
	while(li.hasPrevious()) {
		Object obj = li.previous();
		System.out.println(obj);
	}
	Vector vv = new Vector();
	vv.add(3); vv.add(7);vv.add(10);
	System.out.println("Retrieve value from Vector");
	Enumeration ee = vv.elements();
	while(ee.hasMoreElements()) {
		Object obj = ee.nextElement();
		System.out.println(obj);
	}
	}

}


