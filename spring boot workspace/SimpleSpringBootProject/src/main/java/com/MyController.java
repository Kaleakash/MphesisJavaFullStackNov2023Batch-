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
}
