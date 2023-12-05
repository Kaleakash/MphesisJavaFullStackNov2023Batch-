package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSortExamples {

	public static void main(String[] args) {
	List<Product> listOfProduct = new ArrayList<>();
	listOfProduct.add(new Product(2, "TV", 56000));
	listOfProduct.add(new Product(1, "Pen Drive", 2000));
	listOfProduct.add(new Product(3, "Computer", 46000));
	System.out.println("Product details before sort");
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	Collections.sort(listOfProduct);
	System.out.println();
	System.out.println("Product details after sort");
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	}

}
