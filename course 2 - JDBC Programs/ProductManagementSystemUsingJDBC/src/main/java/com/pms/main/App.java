package com.pms.main;

import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class App {

	public static void main(String[] args) {
		int choice;
		String con="";
		Scanner sc = new Scanner(System.in);
		int pid;
		String pname;
		float price;
		String result;
		ProductService ps = new ProductService();
		do {
			System.out.println("1:Add, 2 : Delete, 3 : Update 4: Retrieve");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:	System.out.println("Plz enter the pid");
					pid = sc.nextInt();
					System.out.println("Plz enter the pname");
					pname = sc.next();
					System.out.println("Plz enter the price");
					price = sc.nextFloat();
					Product pp1 = new Product(pid, pname, price);
					result = ps.storeProduct(pp1);
					System.out.println(result);
					break;
			case 2:System.out.println("Plz enter the pid");
					pid = sc.nextInt();
					result = ps.deteProduct(pid);
					System.out.println(result);
					break;	
			case 3:System.out.println("Plz enter the pid");
					pid = sc.nextInt();
					System.out.println("Plz enter the price");
					price = sc.nextFloat();
					Product pp2 = new Product();
					pp2.setPid(pid);
					pp2.setPrice(price);
					result = ps.updateProduct(pp2);
					System.out.println(result);
					break;
			case 4:
	
				break;
			default:System.out.println("Wrong choice");
					break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
			
		} while (con.equalsIgnoreCase("y"));
		
		System.out.println("Thank you!");

	}

}
