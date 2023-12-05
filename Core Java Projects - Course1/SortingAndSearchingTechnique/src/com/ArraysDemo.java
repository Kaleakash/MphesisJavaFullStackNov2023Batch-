package com;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

	public static void main(String[] args) {
	int num[]= {3,1,5,9,7,6};
	System.out.println("Befor sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	Arrays.sort(num);   // Asc 
	System.out.println();
	System.out.println("After sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	System.out.println();
	//System.out.println("Search "+Arrays.binarySearch(num, 9));
	//System.out.println("Search "+Arrays.binarySearch(num, 90));
	if(Arrays.binarySearch(num, 10)<0) {
		System.out.println("Element not present");
	}else {
		System.out.println("Element present");
	}
	}

}
