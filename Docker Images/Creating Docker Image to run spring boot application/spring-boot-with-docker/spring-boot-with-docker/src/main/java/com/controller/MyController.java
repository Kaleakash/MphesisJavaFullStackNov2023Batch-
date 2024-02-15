package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:9090/
	
	@GetMapping(value = "/")
	public String sayHello() {
		return "Welcome to Spring boot with docker";
	}
}
