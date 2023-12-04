package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
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
	
//	List ll = new ArrayList();
//	ll.add("Ravi");ll.add("Ramesh");ll.add("Ajay");ll.add("Vijay");
//	System.out.println(ll);
//	// for each loop or enhanced loop or iterator 
//	ListIterator li = ll.listIterator();
//	System.out.println("forward direction");
//	while(li.hasNext()) {
//		Object obj = li.next();
//		System.out.println(obj);
//	}
//	System.out.println("backward direction");
//	while(li.hasPrevious()) {
//		Object obj = li.previous();
//		System.out.println(obj);
//	}
//	Vector vv = new Vector();
//	vv.add(3); vv.add(7);vv.add(10);
//	System.out.println("Retrieve value from Vector");
//	Enumeration ee = vv.elements();
//	while(ee.hasMoreElements()) {
//		Object obj = ee.nextElement();
//		System.out.println(obj);
//	}
	
	Map mm = new HashMap();
	mm.put(1, "Ravi");
	mm.put(2, "Ramesh");
	mm.put(3,"Lokesh");
	// map we can't use for each loop, iterator, listiterator as well as enumeration 
	Set ss = mm.keySet();		//converted all key from map to set. 
	Iterator li = ss.iterator();
	while(li.hasNext()) {
		Object key = li.next();
		System.out.println("Key "+key+" Value "+mm.get(key));
	}
	Set ss1 = mm.entrySet();		// converted map to set. 
	Iterator li1 = ss1.iterator();
	while(li1.hasNext()) {
		//Object obj = li1.next();
		//System.out.println(obj);
		Map.Entry me = (Map.Entry)li1.next();
		System.out.println("key "+me.getKey()+" value "+me.getValue());
	}
	}

}





