package com;
class Booking implements Runnable {
	int avl=1;
	@Override
	public synchronized void run() {
		Thread t= Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" no ticket");
		}
		
	}
}
public class BookingApp {
	public static void main(String[] args) {
		Booking bb1 = new Booking();		// new heap memory created avl=1
		//Booking bb2 = new Booking();		// new heap memory created avl=1
		//Booking bb3 = new Booking();		// new heap memory created avl=1
		Thread t1 = new Thread(bb1);
		Thread t2 = new Thread(bb1);
		Thread t3 = new Thread(bb1);
		t1.setName("ajay");
		t2.setName("vijay");
		t3.setName("mahesh");
		t1.start();
		t2.start();
		t3.start();
	}

}
