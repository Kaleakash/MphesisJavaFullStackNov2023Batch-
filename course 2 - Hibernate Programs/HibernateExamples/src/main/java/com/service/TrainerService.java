package com.service;

import java.util.List;

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
	
	public String deleteTrainer(int tid) {
		if(td.deleteTrainer(tid)>0) {
			return "Trainer deleted";
		}else {
			return "Trainer record not present";
		}
	}
	public String updateTrainer(Trainer trainer) {
		if(td.updateTrainer(trainer)>0) {
			return "Trainer deleted";
		}else {
			return "Trainer record not present";
		}
	}
	
	public String findTrainer(int tid) {
		Trainer t = td.findTrainer(tid);
		if(t==null) {
			return "Trainer not present";
		}else {
			return t.toString();
		}
	}
	
	public List<Trainer> findAllTrainer() {
		return td.findAllTrainers();
	}
}
