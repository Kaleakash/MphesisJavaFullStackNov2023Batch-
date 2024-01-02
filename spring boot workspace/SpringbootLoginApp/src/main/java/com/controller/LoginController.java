package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/")	// http://localhost:9090/
	public String openLoginPage() {
		return "login";				// login.jsp open 
	}
	
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String loginCheckDetails(HttpServletRequest req) {	// DI HttpServletRequest 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		if(emailid.equals("akash@gmail.com") && password.equals("akash@123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
