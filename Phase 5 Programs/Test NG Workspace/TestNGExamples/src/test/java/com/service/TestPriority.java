package com.service;

import org.testng.annotations.Test;

public class TestPriority {
  @Test(priority = 2)
  public void a() {
	  System.out.println("a test function");
  }
  @Test(priority = 1)
  public void bb() {
	  System.out.println("c test function");
  }
  
  @Test(priority = 3)
  public void d() {
	  System.out.println("d test function");
  }
  @Test(priority = 1)
  public void ba() {
	  System.out.println("b test function");
  }
}
