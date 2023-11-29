package xyz;
class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}	
}
class B implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsRunnableInterfaceExample {
	public static void main(String[] args) {
//		A obj1  = new A();
//		B obj2 = new B();
		Runnable r1 = new A();
		Runnable r2 = new B();			// sub class object and super interface reference. 
		Thread t1 = new Thread(r1);		// t1 passing runnable interface reference. 
		Thread t2 = new Thread(r2);		// t2 
		t1.start();
		t2.start();
	}

}
