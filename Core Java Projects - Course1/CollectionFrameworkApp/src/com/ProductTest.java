package com;
import java.util.*;
public class ProductTest {

	public static void main(String[] args) {
	List<Product> listOfProduct = new ArrayList<Product>();
	Product p1 = new Product();
	p1.setPid(1);
	p1.setPname("TV");
	p1.setPrice(56000);
	
	Product p2 = new Product(2,"Computer",45000);
	System.out.println("Size of product is "+listOfProduct.size());
	listOfProduct.add(p1);
	listOfProduct.add(p2);
	listOfProduct.add(new Product(3, "Laptop", 88000));
	System.out.println("Size of product is "+listOfProduct.size());
	//listOfProduct.remove(1);
	
	Iterator<Product> li = listOfProduct.iterator();
	while(li.hasNext()) {
		Product p = li.next();
		if(p.getPid()==1) {
			li.remove();
		}
	}
	System.out.println("After removed size is "+listOfProduct.size());
	
	Iterator<Product> li2 = listOfProduct.iterator();
	while(li2.hasNext()) {
		Product p = li2.next();
		if(p.getPid()==2) {
			p.setPrice(p.getPrice()+5000);
		}
	}
	
	System.out.println("Display Produt one by one");
	Iterator<Product> li1 = listOfProduct.iterator();
	while(li1.hasNext()) {
		Product pp = li1.next();
		System.out.println(pp);   // toString method
	}
	}

}
