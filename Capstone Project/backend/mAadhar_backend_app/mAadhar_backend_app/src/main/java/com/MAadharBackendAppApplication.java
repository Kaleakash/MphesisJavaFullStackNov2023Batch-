package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Login;
import com.repository.LoginRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
public class MAadharBackendAppApplication {

	@Autowired
	LoginRepository loginRepository;
	
	
	@PostConstruct
	public void init() {
	Optional<Login> op = loginRepository.findById("admin@gmail.com");
	if(op.isPresent()) {
		System.err.println("Admin account present");
	}else {
		Login ll = new Login();
		ll.setEmailid("admin@gmail.com");
		ll.setPassword("admin@123");
		ll.setTypeofuser("admin");
		loginRepository.save(ll);
		System.err.println("Admin account created");
	}
	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MAadharBackendAppApplication.class, args);
		System.err.println("spring boot maadhar card service up on port number 9090");
	}

}
