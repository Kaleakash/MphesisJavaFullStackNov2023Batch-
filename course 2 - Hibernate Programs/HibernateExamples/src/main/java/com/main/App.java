package com.main;

import com.entity.Trainer;
import com.service.TrainerService;
/*
 * 
 * 	create table trainer(tid int primary key,tname varchar(30));
 * 
 * 
 */
public class App {

	public static void main(String[] args) {
		
		Trainer t1 = new Trainer();
		t1.setTid(102);
		t1.setTname("Rajesh");
		TrainerService ts = new TrainerService();
		String result = ts.storeTrainer(t1);
		System.out.println(result);
	}

}
