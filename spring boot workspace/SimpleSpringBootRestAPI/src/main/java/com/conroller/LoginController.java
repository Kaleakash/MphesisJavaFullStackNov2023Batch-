package com.conroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	// http://localhost:8080/singleQueryParam?name=Ajay
	
	@RequestMapping(value = "singleQueryParam",method = RequestMethod.GET)
	public String helloUserByQueryParam(@RequestParam("name") String fname) {
		return "Welcome user to spring boot with query param "+fname;
	}
	
	 // http://localhost:8080/checkUserByQuery?emailid=raj@gmail.com&password=123
	 // http://localhost:8080/checkUserByQuery?emailid=raj@gmail.com&password=126
	
	@RequestMapping(value = "checkUserByQuery",method = RequestMethod.GET)
	public String checkUserByQueryParam(@RequestParam("emailid") String email, @RequestParam("password") String pass)
	{
		if(email.equalsIgnoreCase("raj@gmail.com") && pass.equals("123")) {
			return "successfully login";
		}else {
			return "failure try once again";
		}
	}
	
}
