package com.pems.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// create table project(pid int primary key auto_increment, pname varchar(40));
// create table employees(id int primary key,name varchar(30), age int, pid int, foreign key(pid) references project(pid));
@SpringBootApplication(scanBasePackages = "com") // Enable @Controller, @Service, @Component and @Repository
@EntityScan(basePackages = "com.pems.entity")  		// enable @Entity class. 
@EnableJpaRepositories(basePackages = "com.pems.repository")// it is use to enable spring jpa data features 
public class DemoTest {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Spring boot up!");
	}

}
