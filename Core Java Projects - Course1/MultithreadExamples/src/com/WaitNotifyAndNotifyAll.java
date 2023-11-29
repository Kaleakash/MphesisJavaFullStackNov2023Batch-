package com;
class App implements Runnable{
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i=0;i<=10;i++) {
		System.out.println(name+" "+i);
		try {
			Thread.sleep(1000);
			if(i==4 && name.equals("Ravi")) {
				wait();
			}
			if(i==6 && name.equals("Ajay")) {
				notify();
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	}
}
public class WaitNotifyAndNotifyAll {
	public static void main(String[] args) {
		App obj = new App();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		t1.setName("Ravi");
		t2.setName("Ajay");
		t3.setName("Vijay");
		t1.start();
		t2.start();
		t3.start();
	}

}
