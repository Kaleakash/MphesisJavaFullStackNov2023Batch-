package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	// HashMap 
	//Map mm = new HashMap();		// Unorder 
	// LinkedHashMap  
	//Map mm = new LinkedHashMap();	// maintain the order
	// TreeMap 
	//Map mm = new TreeMap();			// TreeMap asc order as key 
	// Hashtable 
//		Map mm = new Hashtable();		// all methods are synchronized 
//	mm.put(2, "Ravi");
//	mm.put(1, "Rajesh");
//	mm.put(5, "Lokesh");
//	mm.put(3, "Ramesh");
//		mm.put("A", "B");
//	System.out.println(mm);
//		mm.put(1, "Ajay");
//	mm.put(7, "Ramesh");
//	System.out.println(mm);
	
//	if(mm.containsKey(10)) {
//		System.out.println("Key present");
//	}else {
//		System.out.println("key not present");
//	}
//	System.out.println("VAlue "+mm.containsValue("Ravi"));
//	System.out.println("VAlue "+mm.containsValue("Raju"));
//	System.out.println("Get VAlue "+mm.get(2));
//	System.out.println("Get VAlue "+mm.get(20));
	//Map mm = new HashMap();
		//Map mm = new TreeMap();
	Map mm = new Hashtable();
	mm.put(1, "Ravi");
	//mm.put(null,"Lokesh");
	//mm.put(null,"Lokesh");
	//mm.put(2, null);
	//mm.put(3, null);
	System.out.println(mm);
	}

}
