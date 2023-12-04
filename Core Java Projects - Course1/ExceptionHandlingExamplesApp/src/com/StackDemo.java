package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack ss = new Stack();
	System.out.println("Empty "+ss.empty());
	ss.push(100);
	ss.push(200);
	ss.push(300);
	ss.push(400);
	System.out.println("Empty "+ss.empty());
	System.out.println(ss);
	System.out.println("Remove "+ss.pop());		// remove and display 
	System.out.println(ss);
	System.out.println("Search top most element "+ss.peek());	// display top most element 
	System.out.println(ss);
	System.out.println("Search element "+ss.search(300));	// top to bottom start from 1
	System.out.println("Search element "+ss.search(200));	// top to bottom start from 1
	System.out.println("Search element "+ss.search(1000));	// top to bottom start from 1
	}

}
