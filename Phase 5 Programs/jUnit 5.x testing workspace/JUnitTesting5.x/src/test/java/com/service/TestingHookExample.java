package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingHookExample {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before testing all method - only once");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After testing all method - only once");
	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each testing - again and again");
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each testing - again and again");
	}
	@Test
	void test1() {
		System.out.println("While test1 function - testing");
	}
	@Test
	void test2() {
		System.out.println("While test2 function - testing");
	}
}
