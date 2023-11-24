package com;

public class Car {
	int wheel;
	String colour;
	float price;
	
	void start() {
		System.out.println("Car Stated...");
	}
	
	void appliedGear(int gr) {
		System.out.println("Your applied "+gr+" Gear ");
	}
	
	void moving(int speed) {
		System.out.println("Car is moving with speed as "+speed+" Km/hr");
	}
	void stop() {
		System.out.println("Car stop");
	}
	
//	void setCarInfo(int wheel1, String colour1,float price1) {
//		wheel=wheel1;
//		colour=colour1;
//		price=price1;
//	}
	void setCarInfo(int wheel, String colour,float price) {
		this.wheel=wheel;	// this.wheel is instance and wheel is local 
		this.colour=colour;
		this.price=price;
	}
	void displayCarInfo(String name) {
		String msg="Car Info";		// local variable 
		System.out.println(msg+" : "+name);
		System.out.println("Wheel "+wheel);
		System.out.println("Colour "+colour);
		System.out.println("Price "+price);
	}
}
