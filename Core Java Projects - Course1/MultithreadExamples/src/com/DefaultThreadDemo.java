package com;

public class DefaultThreadDemo {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("Demo Thread");
	t.setPriority(3);
	System.out.println(t);
	t.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t);
	t.setPriority(1);
	String name = t.getName();
	int i = t.getPriority();
	System.out.println("Name "+name);
	System.out.println("i "+i);
	}

}
