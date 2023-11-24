package com;

public class CarTest {

	public static void main(String[] args) {
		//start();
//	Car innova = new Car();		// memory create ie heap memory 
//	innova.start();
//	innova.appliedGear(1);
//	innova.moving(20);
//	innova.appliedGear(2);
//	innova.moving(30);
//	innova.appliedGear(3);
//	innova.moving(50);
//	innova.stop();
//	
//	Car ertiga = new Car();
//	Car bmw = new Car();
		
	Car innova = new Car();
	//innova.displayCarInfo();
//	innova.wheel=4;
//	innova.colour="White";
//	innova.price=3200000;
	innova.setCarInfo(4, "White", 3200000);
	innova.displayCarInfo("Innova");
	
	Car ertiga = new Car();
	//ertiga.displayCarInfo();
//	ertiga.wheel=4;
//	ertiga.colour="Gray";
//	ertiga.price=1300000;
	ertiga.setCarInfo(4, "Gray", 1300000);
	ertiga.displayCarInfo("Ertiga");
	
	}

}
