package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value = "/")		// http://localhost:8080/
	public String openIndex() {
		System.out.println("I came here in index");
		return "index";		// this is your file name without extension. 
	}
	
	@RequestMapping(value = "/hi")		// http://localhost:8080/hi
	public String hiPage() {
		System.out.println("I came here in hi path");
		return "hiPage";		// this is your file name without extension. 
	}
	
	@RequestMapping(value = "/hello")		// http://localhost:8080/hello
	public String helloPageOpen() {
		System.out.println("I came here in hello path");
		return "helloPage";		// this is your file name without extension. 
	}
}
