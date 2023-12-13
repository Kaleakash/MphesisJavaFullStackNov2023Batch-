package com.service;

import com.dao.TrainerDao;
import com.entity.Trainer;

public class TrainerService {
	TrainerDao td = new TrainerDao();
	
	public String storeTrainer(Trainer trainer) {
		if(td.storeTrainer(trainer)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
}
