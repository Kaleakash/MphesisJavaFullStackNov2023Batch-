package com.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LoginServiceTest {

  @Test
  public void signInTest() {
    //throw new RuntimeException("Test not implemented");
	  LoginService ls = new LoginService();
	  boolean result1 = ls.signIn("akash@gmail.com", "123");
	  boolean result2 = ls.signIn("vikash@gmail.com", "123");
	  assertTrue(result1);
	  assertFalse(result2);
  }

  @Test
  public void signUpTest() {
    //throw new RuntimeException("Test not implemented");
	  LoginService ls  = new LoginService();
	  String result1 = ls.signUp("akash@gmail.com", "12345");
	  assertEquals("Account created successfully", result1);
	  String result2 = ls.signUp("akashgmail.com", "12345");
	  assertEquals("Account didn't create", result2);
  }
}
