package com.vc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vc.entity.Users;
import com.vc.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	UsersService usersService;
	
	// http://localhost:8086/login 
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String signIn(@RequestBody Users users) {
		return usersService.signIn(users);
	}
}
