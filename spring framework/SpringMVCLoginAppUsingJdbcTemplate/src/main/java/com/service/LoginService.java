package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	
	public String signUp(Login login) {
		System.out.println("Before reverse "+login.getPassword());
		StringBuffer reversePassword = new StringBuffer(login.getPassword());// akash@123
		login.setPassword(reversePassword.reverse().toString());  					//321@hsaka
		System.out.println("After reverse "+login.getPassword());
		if(loginDao.signUp(login)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
	
	public String signIn(Login login) {
		System.out.println("Before reverse "+login.getPassword());
		StringBuffer reversePassword = new StringBuffer(login.getPassword());// akash@123
		login.setPassword(reversePassword.reverse().toString());  					//321@hsaka
		System.out.println("After reverse "+login.getPassword());
		if(loginDao.signIn(login)>0) {
			return "success";
		}else {
			return "failure";
		}
	}
}
