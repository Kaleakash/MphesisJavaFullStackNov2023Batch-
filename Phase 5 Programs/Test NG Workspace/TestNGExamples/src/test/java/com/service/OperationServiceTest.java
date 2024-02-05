package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OperationServiceTest {

  @Test
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	  OperationService os = new OperationService();
	  int result = os.add(100, 200);
	  assertEquals(300, result);
  }

  @Test
  public void subTest() {
    //throw new RuntimeException("Test not implemented");
	  OperationService os = new OperationService();
	  int result = os.sub(200, 100);
	  assertEquals(100, result);
  }
}
