package com;

class VoteException extends Exception{
	// by default empty constructor 
	public VoteException() {
		//super();
	}
	public VoteException(String msg) {
		//super();				// it call exception class empty constructor  
		super(msg);		// using this line we are calling exception class parameter 
	}						// construtor to set the value. 
}
public class ThrowKeywordExample {

	public static void main(String[] args) {
	int age=15;
	
	try {
		
	if(age<=21) {
		//throw new Exception();// generate generic pre defined exception only name 
		//throw new Exception("Age must be >=21"); // name with message 
		//throw new ArithmeticException();// generating arithmetic exception with custom condition. 
		//throw new ArithmeticException("Age must be >=21");
		//throw new VoteException();	// custom exception empty constructor 
		throw new VoteException("Age must be >=21");	// custom exception parameter constructor 
	}else {
		System.out.println("You Can vote!");
	}

	}catch(Exception e) {
		System.out.println(e.toString());
	}
	
	}

}
