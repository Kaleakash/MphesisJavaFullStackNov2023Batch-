package com.service;

import org.testng.annotations.Test;

public class BusTest {
	@Test(groups = {"speed"})
	  public void speedTest() {
		  System.out.println("Bus Test speed function");
	  }
	  
	  @Test
	  public void mailageTest() {
		  System.out.println("Bus Test mailage function");
	  }
	  @Test
	  public void colorTest() {
		  System.out.println("Bus Test color function");
	  }
}
