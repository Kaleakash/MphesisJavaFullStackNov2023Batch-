package com.cemerarental.utitlity;

import java.util.Scanner;

import com.camerarental.service.CameraService;

public class CameraRentalUtility {

	static Scanner sc = new Scanner(System.in);
	
	public static void login() {
		System.out.println("Enter your emailid ");
		String emailid = sc.next();
		System.out.println("Enter your password ");
		String password = sc.next();
		if(emailid.equals("akash@gmail.com") && password.equals("akash@123")) {
			System.out.println("Successfully login");
			mainOption();
		}else {
			System.out.println("Failure try once again");
		}
	}
	private static void mainOption() {
		int choice;
		String con="";
		do {
			System.out.println("1: My Camera");
			System.out.println("2: Rent Camera");
			System.out.println("3: View All Camera");
			System.out.println("4: My Wallet");
			System.out.println("5: Exit");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1: subMenuOption();
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			default:System.out.println("Wrong choice");
			break;
			}
			System.out.println("Do you want to continue(y/n)");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
	}
	
	private static void subMenuOption() {
		int choice;
		String con="";
		CameraService cs = new CameraService();
		do {
			System.out.println("1: Add Camera");
			System.out.println("2: Remove Camera");
			System.out.println("3: View Camere details");
			choice = sc.nextInt();
			switch(choice) {
			case 1: cs.addCamera();
				break;
			case 2: 
				break;
			case 3: cs.viewAllCamera();
				break;
			case 4: 
				break;
			default:System.out.println("Wrong choice");
			break;
			}
			System.out.println("Do you want to continue(y/n)");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
	}
}
