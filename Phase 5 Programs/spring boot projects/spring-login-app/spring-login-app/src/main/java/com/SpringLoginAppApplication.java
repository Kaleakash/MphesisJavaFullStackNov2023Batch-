package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoginAppApplication.class, args);
		System.err.println("Spring boot up on port number 9090");
	}

}
