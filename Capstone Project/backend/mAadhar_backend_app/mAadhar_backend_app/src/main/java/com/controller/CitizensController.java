package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Citizens;
import com.service.CitizensService;

@RestController
@RequestMapping("citizens")
public class CitizensController {

	@Autowired
	CitizensService citizensService;
	
	@PostMapping(value = "createAccount",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createCitizensAccount(@RequestBody Citizens citizens) {
		return citizensService.storeCitizensDetails(citizens);
	}
	
	@GetMapping(value = "findAll",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Citizens> findAll() {
		return citizensService.findAllCitizens();
	}
	
	@GetMapping(value = "searchCitizen/{aadharnumber}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Citizens searchCitizen(@PathVariable("aadharnumber") long aadharnumber) {
		return citizensService.findCitizen(aadharnumber);
	}
	
	
	
	
}
