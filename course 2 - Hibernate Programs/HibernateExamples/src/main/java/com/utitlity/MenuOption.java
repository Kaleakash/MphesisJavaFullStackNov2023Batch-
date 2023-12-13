package com.utitlity;

import java.util.List;
import java.util.Scanner;

import com.entity.Trainer;
import com.service.TrainerService;

public class MenuOption {

	static Scanner sc = new Scanner(System.in);
	public static void trainerMenuOption() {
		int choice;
		String con="";
		int tid;
		String tname;
		String result;
		TrainerService ts = new TrainerService();
		do {
			System.out.println("Trainer Menu");
			System.out.println("1:Add 2: Delete, 3 : Update 4 : Find 5 : Retrieve All Trainer");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter trainer id");
					tid = sc.nextInt();
					System.out.println("Enter trainer name");
					tname = sc.next();
					Trainer t1 = new Trainer(tid, tname);
					result = ts.storeTrainer(t1);
				break;
			case 2:System.out.println("Enter trainer id");
			tid = sc.nextInt();
				result = ts.deleteTrainer(tid);
				System.out.println(result);
				break;
			case 3:System.out.println("Enter trainer id");
			tid = sc.nextInt();
			System.out.println("Enter trainer name");
			tname = sc.next();
			Trainer t2 = new Trainer(tid, tname);
			result = ts.updateTrainer(t2);
	
				break;
			case 4:System.out.println("Enter trainer id");
			tid = sc.nextInt();
			result = ts.findTrainer(tid);
				System.out.println(result);
				break;
			case 5:List<Trainer> trainers = ts.findAllTrainer();
			      for(Trainer t : trainers) {
			    	  System.out.println(t);
			      }
	
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		}while(con.equals("y"));
		
		
	}
}
