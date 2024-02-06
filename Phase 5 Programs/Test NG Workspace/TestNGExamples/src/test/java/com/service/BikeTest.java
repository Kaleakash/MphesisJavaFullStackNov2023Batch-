package com.service;

import org.testng.annotations.Test;

public class BikeTest {
	@Test(groups = {"speed"})
	  public void speedTest() {
		  System.out.println("Bike Test speed function");
	  }
	  
	  @Test
	  public void mailageTest() {
		  System.out.println("Bike Test mailage function");
	  }
	  @Test
	  public void colorTest() {
		  System.out.println("Bike Test color function");
	  }
}
