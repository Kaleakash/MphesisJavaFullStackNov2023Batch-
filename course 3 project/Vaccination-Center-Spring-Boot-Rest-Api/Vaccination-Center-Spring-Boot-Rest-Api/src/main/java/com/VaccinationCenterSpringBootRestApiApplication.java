package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vc.entity.Users;
import com.vc.service.UsersService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")	// enable @restcontroller, @service and @repository 
@EntityScan(basePackages = "com.vc.entity")		// enable @Entity 
@EnableJpaRepositories(basePackages = "com.vc.repository")
public class VaccinationCenterSpringBootRestApiApplication {

	@Autowired
	UsersService usersService;
	
	@PostConstruct			// this method get called after spring boot ready. 
	public void init() {
		System.out.println("This method called.....");
		Users user = new Users();
		user.setEmailid("admin@gmail.com");
		user.setPassword("admin@123");
		System.out.println(usersService.signUp(user));
	}
	public static void main(String[] args) {
		SpringApplication.run(VaccinationCenterSpringBootRestApiApplication.class, args);
		System.err.println("Spring boot up!");
	}

}
