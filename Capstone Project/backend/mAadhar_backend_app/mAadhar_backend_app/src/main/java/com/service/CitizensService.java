package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Citizens;
import com.entity.Login;
import com.repository.CitizensRepository;
import com.repository.LoginRepository;

@Service
public class CitizensService {

	@Autowired
	CitizensRepository citizenRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	public String storeCitizensDetails(Citizens citizens) {	
		Optional<Login> op = loginRepository.findById(citizens.getEmailid());
		if(op.isPresent()) {
			return "Emailid is must be unique";
		}else {
			long count = citizenRepository.count();
			citizens.setAadharnumber(citizens.getAadharnumber()+count);
			citizenRepository.save(citizens);
			
			Login ll = new Login();
			ll.setEmailid(citizens.getEmailid());
			ll.setPassword(citizens.getPassword());
			ll.setTypeofuser("Citizens");
			
			loginRepository.save(ll);
			
			return "Account Created";
		}
	}
	
	public Citizens findCitizen(long aadharNumber) {	
		Optional<Citizens> op = citizenRepository.findById(aadharNumber);
		if(op.isPresent()) {
			return op.get();
		}else {
			return null;
		}
	}
	
	public List<Citizens> findAllCitizens() {
		return citizenRepository.findAll();
	}
}
