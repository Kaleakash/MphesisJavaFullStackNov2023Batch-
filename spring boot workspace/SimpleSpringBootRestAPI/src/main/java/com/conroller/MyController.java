package com.conroller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080/hello
	
	@RequestMapping(value = "hello")	// by default get method consider 
	public String sayHello() {			// produce data in plain text format. 
		return "Welcome to Spring boot rest api";
	}
	@RequestMapping(value = "plain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h2>Welcome to Simple Text API</h2>";
	}
	@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtmlText() {
		return "<h2>Welcome to Simple Text API</h2>";
	}
	@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayXmlText() {
		return "<abc>Welcome to Simple Text API</abc>";
	}
}


