package com.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.api.entity")
@EnableJpaRepositories(basePackages = "com.api.repository")
public class DemoTest {

	public static void main(String[] args) {
	
	SpringApplication.run(DemoTest.class, args);
	System.err.println("Spring boot up!");
	}

}
