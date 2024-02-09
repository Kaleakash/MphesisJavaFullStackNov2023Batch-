package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@RequestMapping(value = "checkLoginDetails",method =RequestMethod.POST)
	public String checkLoginInfo(HttpServletRequest req) {
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		if(email.equals("admin@gmail.com") && password.equals("admin@123")) {
			return "success";
		}else {
			return "failure";
		}
	
	}
}
