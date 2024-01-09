package com.vc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vc.entity.Citizens;
import com.vc.service.CitizenService;

@RestController
public class CitizenController {

	@Autowired
	CitizenService citizenService;
	
	// http://localhost:8086/citizens
	
	@RequestMapping(value = "citizens",method = RequestMethod.GET)
	public List<Citizens> findAllCitizen() {
		return citizenService.findAllCitizens();
	}
	
	
	// http://localhost:8086/citizen/100
	// http://localhost:8086/citizen/1000
	@RequestMapping(value = "citizen/{cid}",method = RequestMethod.GET)
	public String findCitizenById(@PathVariable("cid") int cid) {
		return citizenService.findSpecifidCitizen(cid);
	}
}
