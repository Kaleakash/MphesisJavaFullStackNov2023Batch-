package com.vc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vc.entity.Users;
import com.vc.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	public String signUp(Users users) {
		Optional<Users> result = usersRepository.findById(users.getEmailid());
		if(result.isPresent()) {
			return "Account already exists";
		}else {
			usersRepository.save(users);
			return "Account created";
		}
	}
	
	public String signIn(Users users) {
		Optional<Users> result = usersRepository.findById(users.getEmailid());
		if(result.isPresent()) {
			Users u = result.get();
			if(u.getPassword().equals(users.getPassword())) {
				return "success";
			}else {
				return "Password is wrong!";
			}
		}else {
			return "EmailId is wrong";
		}
	}
}
