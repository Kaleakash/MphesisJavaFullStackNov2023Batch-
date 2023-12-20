package com.healthcare.service;

import com.healthcare.dao.LoginDao;
import com.healthcare.entity.Login;

public class LoginService {

	LoginDao ld = new LoginDao();
	public String signIn(Login login) {
		if(ld.signIn(login)>0) {
			return "Successfully login";
		}else {
			return "Failure try once again";
		}
	}
}
