package com.service;

public class LoginService {

	public boolean signIn(String emailid, String password) {
		// we can check from database. 
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
	public String signUp(String emailid, String password) {
		// we can check from database. 
		if(emailid.contains("@")) {
		return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
	
}

