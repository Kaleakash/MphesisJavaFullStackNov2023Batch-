package com;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vc.entity.Citizens;
import com.vc.entity.Users;
import com.vc.entity.VaccinationCenter;
import com.vc.service.CitizenService;
import com.vc.service.UsersService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")	// enable @restcontroller, @service and @repository 
@EntityScan(basePackages = "com.vc.entity")		// enable @Entity 
@EnableJpaRepositories(basePackages = "com.vc.repository")
public class VaccinationCenterSpringBootRestApiApplication {

	@Autowired
	UsersService usersService;
	
	@Autowired
	CitizenService citizenService;
	
	@PostConstruct			// this method get called after spring boot ready. 
	public void init() {
		System.out.println("This method called.....");
		Users user = new Users();
		user.setEmailid("admin@gmail.com");
		user.setPassword("admin@123");
		System.out.println(usersService.signUp(user));
		
		// set of vaccination center details 
		
		VaccinationCenter vc1 = new VaccinationCenter(1, "Hospital-1", "D-1", LocalDateTime.now(), 100);
		VaccinationCenter vc2 = new VaccinationCenter(2, "Hospital-1", "D-2", LocalDateTime.now(), 100);
		VaccinationCenter vc3 = new VaccinationCenter(3, "Hospital-2", "D-3", LocalDateTime.now(), 100);
		List<VaccinationCenter> lc1 = new ArrayList<>();
		lc1.add(vc1);
		lc1.add(vc2);
		lc1.add(vc3);
		
		VaccinationCenter vc4 = new VaccinationCenter(4, "Hospital-1", "D-1", LocalDateTime.now(), 101);
		VaccinationCenter vc5 = new VaccinationCenter(5, "Hospital-2", "D-2", LocalDateTime.now(), 101);
		List<VaccinationCenter> lc2 = new ArrayList<>();
		lc2.add(vc4);
		lc2.add(vc5);
		
		VaccinationCenter vc6 = new VaccinationCenter(6, "Hospital-2", "D-1", LocalDateTime.now(), 102);
		VaccinationCenter vc7 = new VaccinationCenter(7, "Hospital-1", "D-2", LocalDateTime.now(), 102);
		VaccinationCenter vc8 = new VaccinationCenter(8, "Hospital-2", "D-3", LocalDateTime.now(), 102);
		List<VaccinationCenter> lc3 = new ArrayList<>();
		lc3.add(vc6);
		lc3.add(vc7);
		lc3.add(vc8);
		
		VaccinationCenter vc9 = new VaccinationCenter(9, "Hospital-3", "D-1", LocalDateTime.now(), 103);
		List<VaccinationCenter> lc4 = new ArrayList<>();
		lc4.add(vc9);
		
		VaccinationCenter vc10 = new VaccinationCenter(10, "Hospital-1", "D-1", LocalDateTime.now(), 104);
		VaccinationCenter vc11 = new VaccinationCenter(11, "Hospital-1", "D-2", LocalDateTime.now(), 104);
		VaccinationCenter vc12 = new VaccinationCenter(12, "Hospital-3", "D-3", LocalDateTime.now(), 104);
		List<VaccinationCenter> lc5 = new ArrayList<>();
		lc5.add(vc10);
		lc5.add(vc11);
		lc5.add(vc12);
		
		// set of citizens details 
		Citizens cc1 = new Citizens(100, "Ravi", 37, "Male", "9900", "Bangalore", "Kar", "569886", lc1);
		Citizens cc2 = new Citizens(101, "Raju", 40, "Male", "9911", "Pune", "Mh", "769886", lc2);
		Citizens cc3 = new Citizens(102, "Reeta", 25, "Female", "9922", "Mysore", "Kar", "669886", lc3);
		Citizens cc4 = new Citizens(103, "Veeta", 56, "Female", "9933", "Delhi", "Dl", "969886", lc4);
		Citizens cc5 = new Citizens(104, "Ajay", 19, "Male", "9933", "Mumbai", "Mh", "969886", lc5);
		
		System.out.println(citizenService.storeCitizenDetails(cc1));
		System.out.println(citizenService.storeCitizenDetails(cc2));
		System.out.println(citizenService.storeCitizenDetails(cc3));
		System.out.println(citizenService.storeCitizenDetails(cc4));
		System.out.println(citizenService.storeCitizenDetails(cc5));
	}
	public static void main(String[] args) {
		SpringApplication.run(VaccinationCenterSpringBootRestApiApplication.class, args);
		System.err.println("Spring boot up!");
	}

}
