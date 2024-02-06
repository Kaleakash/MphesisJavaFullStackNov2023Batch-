package com.service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGHook {
  @Test
  //@Ignore				// @Disable 
  public void test1() {
	  System.out.println("while testing first test1 function");
  }
  @Test	
  public void test2() {
	  System.out.println("while testing second test2 function");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");		// before each test function with @Test annotation
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");	// after each test function with @Test annotation
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");	// before all test function with @Test annotation only one time
  }											// but it required at least one test function

  @AfterClass	
  public void afterClass() {			// After all test function with @Test annotation only one time
	  System.out.println("After class");	// but it required at least one test function
  }

  @BeforeTest							// before all test function with @Test annotation only one time
  public void beforeTest() {			// doesnt't matter one test or more than one test optional 	
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {				// after all test function with @Test annotation only one time
	  System.out.println("After Test");	// doesnt't matter one test or more than one test optional 	
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
