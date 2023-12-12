package com.pms.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.OrdersService;
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
		OrdersService os = new OrdersService();
		do {
			System.out.println("1:Add, 2 : Delete, 3 : Update 4: Retrieve 5 : Search Product 6 : Place Order 7 : Order details ");
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
			case 4: List<Product> listOfProduct = ps.findAllProduct();
					for(Product p : listOfProduct) {
						System.out.println(p);   // it will call toString method
					}
				break;
			case 5:System.out.println("Plz enter product id");
			         pid = sc.nextInt();
			         result = ps.findProduct(pid);
			         System.out.println(result);
			         break;
			case 6:	List<Product> listOfProduct1 = ps.findAllProduct();
				for(Product p : listOfProduct1) {
					System.out.println(p);   // it will call toString method
					}
					System.out.println("Please enter product id which you want to place the order");
					pid = sc.nextInt();
					result = os.placeOrder(pid);
					System.out.println(result);
					break;
			case 7 :System.out.println("All Order details are ");
					List<Object[]> ll = os.getAllOderDetails();
			        Iterator<Object[]> li = ll.iterator();
			        while(li.hasNext()) {
			        	Object obj[] = (Object[])li.next();
			        	System.out.println("Order Id "+obj[0]+" Order Date "+obj[1]+" PName "+obj[2]+" Price "+obj[3]);
			        }
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
