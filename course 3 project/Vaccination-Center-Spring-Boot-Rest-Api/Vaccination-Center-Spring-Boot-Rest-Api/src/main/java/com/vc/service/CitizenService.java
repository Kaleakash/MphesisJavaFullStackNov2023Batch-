package com.vc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vc.entity.Citizens;
import com.vc.repository.CitizenRepository;

@Service
public class CitizenService {

	@Autowired
	CitizenRepository citizenRepository;
	
	public String storeCitizenDetails(Citizens cc) {
		Optional<Citizens> result = citizenRepository.findById(cc.getCid());
		if(result.isPresent()) {
			return "REcord didn't stored";
		}else {
			citizenRepository.save(cc);
			return "Citizen records saved successfully";
		}
	}
	
	public List<Citizens> findAllCitizens() {
		return citizenRepository.findAll();
	}
	
	public String findSpecifidCitizen(int cid) {
		Optional<Citizens> result = citizenRepository.findById(cid);
		if(result.isPresent()) {
			Citizens c  = result.get();
			return c.toString();
		}else {
			return "Citizen details not present in database";
		}
	}
	
}
