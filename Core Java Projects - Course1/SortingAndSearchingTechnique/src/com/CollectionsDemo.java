package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Ravi");
	names.add("Ajay");
	names.add("Vikash");
	names.add("Dinesh");
	System.out.println("Befor sort");
	for(String name:names) {
		System.out.print(name+" ");
	}
	System.out.println();
	System.out.println("After sort - Asc ");
		Collections.sort(names);
	for(String name: names) {
		System.out.print(name+" ");
	}
		Collections.reverse(names);
	System.out.println();
	System.out.println("After sort - Desc");
	for(String name: names) {
		System.out.print(name+" ");
	}
	System.out.println();
	if(Collections.binarySearch(names, "Rajesh")<0) {
		System.out.println("Name not present");
	}else {
		System.out.println("Name present");
	}
	Integer num[]= {5,3,7,8,5,4,1};
	
	List<Integer> ll =  Arrays.asList(num);
	
	//Collections.sort(ll);
	Collections.reverse(ll);
	
	}
}



