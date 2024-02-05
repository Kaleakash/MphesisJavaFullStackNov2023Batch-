package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationServiceTest {

	@Test					// like a main method 
	void testAdd() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.add(100, 200);
		assertEquals(300, result);
	}
	@Test					// like a main method 
	void testSub() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.sub(1000, 500);
		assertEquals(500, result);
	}
	@Test					// like a main method 
	void testMul() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.mul(10, 2);
		assertEquals(20, result);
	}
	@Test					// like a main method 
	void testDiv() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.div(1000, 200);
		assertEquals(5, result);
	}
}
