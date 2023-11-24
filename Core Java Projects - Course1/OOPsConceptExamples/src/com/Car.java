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
	
}
