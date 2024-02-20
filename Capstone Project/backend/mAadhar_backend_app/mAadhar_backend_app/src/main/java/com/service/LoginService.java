package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	// emailid, password and typeofuser
	public String signIn(Login login) {
		
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent()) {
			Login ll = op.get();
			if(ll.getPassword().equals(login.getPassword())) {
					if(ll.getTypeofuser().equals("admin")) {
						return "Admin login successfully";
					}else {
						return "Citizen login successfully";
					}
			}else {
				return "Password is wrong";
			}
		}else {
			return "EmailId is wrong";
		}
	}
}
