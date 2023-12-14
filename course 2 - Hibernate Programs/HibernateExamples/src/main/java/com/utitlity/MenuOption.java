package com.utitlity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.entity.Student;
import com.entity.Trainer;
import com.service.StudentService;
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
System.out.println("1:Add 2: Delete, 3 : Update 4 : Find 5 : Retrieve All Trainer 6: All Trainer names 7 : Trainer partial property ");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter trainer id");
					tid = sc.nextInt();
					System.out.println("Enter trainer name");
					tname = sc.next();
					List<Student> listOfStd = new ArrayList<>();
					System.out.println("how many student details do you want to store");
					int studentCount = sc.nextInt();
					System.out.println("Enter the students one by one");
					for(int i=0;i<studentCount;i++) {
						  System.out.println("Enter student id");
					      int sid = sc.nextInt();
					      System.out.println("Enter student name");
					      String sname= sc.next();
					      System.out.println("Enter student age");
					      int age = sc.nextInt();
					      Student s = new Student();
					      s.setSid(sid);
					      s.setSname(sname);
					      s.setAge(age);
					      s.setTsid(tid);
					      listOfStd.add(s);
					}
					Trainer t1 = new Trainer(tid, tname);
						t1.setListOfStudents(listOfStd);
					result = ts.storeTrainer(t1);
					System.out.println(result);
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
			case 6:List<String> listOfNames = ts.findAllTraierNames();
			     	for(String name:listOfNames) {
			     		System.out.println(name);
			     	}
			     	break;
			case 7:List<Object[]> listOfIdAndNames = ts.findAllTraierIdNameNames();
	     	for(Object obj[]:listOfIdAndNames) {
	     		System.out.println("Id is "+obj[0]+" Name is "+obj[1]);
	     	}
	     	break;
			default:
				break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		}while(con.equals("y"));
		
		
	}
	
	
	public static void studentMenuOption() {
		int choice;
		String con="";
		int sid;
		String sname;
		int age;
		int tsid;
		String result;
		StudentService ss = new StudentService();
		TrainerService ts = new TrainerService();
		do {
			System.out.println("Student Menu");
			System.out.println("1:Add 2: Retrive All Student");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter student id");
			      sid = sc.nextInt();
			      System.out.println("Enter student name");
			      sname= sc.next();
			      System.out.println("Enter student age");
			      age = sc.nextInt();
			      List<Trainer> listOfTrainer = ts.findAllTrainer();
			      for(Trainer t : listOfTrainer) {
			    	  System.out.println("Trainer is "+t.getTid());
			      }
			      System.out.println("Enter trainer id");
			      tsid = sc.nextInt();
			      Student s1 = new Student(sid, sname, age,tsid);
			      result = ss.storeStudent(s1);
			      System.out.println(result);
				break;
			case 2:List<Student> listOfStudent = ss.findAllStudents();
			 	for(Student s:listOfStudent) {
			 		System.out.println(s);  // all student details 
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
