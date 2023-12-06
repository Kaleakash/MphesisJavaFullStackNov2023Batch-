package com.camerarental.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.camerarental.bean.Camera;

public class CameraService {

	List<Camera> listOfCamera = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void addCamera() {
		System.out.println("Enter the camera brand");
		String brand = sc.next();
		System.out.println("Enter the camera model");
		String model = sc.next();
		System.out.println("Enter the camera per day amount");
		float amount = sc.nextFloat();
		Camera cc = new Camera();
		cc.setBrand(brand);
		cc.setModel(model);
		cc.setPerDayPrice(amount);
			listOfCamera.add(cc);
		System.out.println("Camere details added successfully");
	}
	
	public void removeCamera() {
		
	}
	public void viewAllCamera() {
		Iterator<Camera> li = listOfCamera.iterator();
		while(li.hasNext()) {
			Camera cc = li.next();
			System.out.println(cc);  // toString method 
		}
	}
	
	
}
