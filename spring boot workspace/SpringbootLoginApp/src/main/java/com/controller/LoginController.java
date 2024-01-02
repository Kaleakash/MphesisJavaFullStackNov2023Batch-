package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/")	// http://localhost:9090/
	public String openLoginPage() {
		return "login";				// login.jsp open 
	}
	
}
