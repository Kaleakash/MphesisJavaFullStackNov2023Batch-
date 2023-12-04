package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetrieveValueFromCollectionsOneByOne {

	public static void main(String[] args) {
	// Set API 
	Set ss = new HashSet();
	ss.add(3); ss.add(2); ss.add(5);ss.add(7); ss.add(9);
	System.out.println(ss);    // it display the output as string format 
	System.out.println("Retrieve the value using for each loop or enhanced loop");
	for(Object n:ss) {
		System.out.println(n);
	}
	System.out.println("Retrieve the elements one by one");
	 Iterator li  =  ss.iterator();
	 while(li.hasNext()) {
		 Object obj = li.next();
		 System.out.println(obj);
	 }
	}

}
