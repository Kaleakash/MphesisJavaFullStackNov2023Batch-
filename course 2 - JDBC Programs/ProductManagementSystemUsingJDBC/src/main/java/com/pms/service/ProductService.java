package com.pms.service;

import java.util.Iterator;
import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Price must be > 1000"; 			// simple or complex condition on demand 
		}else if(pd.storeProduct(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
		
		
	}
	
	public String  deteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product information deleted successfully";
		}else {
			return "Product not present";
		}
		
	}
	
	public String updateProduct(Product product) {
		
		
		if(pd.updateProduct(product)>0) {
			return "Product information updated successfully";
		}else {
			return "Product not present";
		}
		
	}
	
	public void retrieveProduct() {
		// condition 
		pd.retrieveProduct();
		
	}
	
	public String findProduct(int id) {
		Product p = pd.findProduct(id);
		if(p==null) {
			return "Product not present";
		}else {
			return p.toString();   // toString method display product details in string format. 
		}
	}
	
	public List<Product> findAllProduct() {
		List<Product> listOfProduct = pd.retrieveProduct();
		Iterator<Product> li = listOfProduct.iterator();
		
		while(li.hasNext()) {
			Product p = li.next();
			float discount =0.10f*p.getPrice();	// 6500 
			p.setPrice(p.getPrice()-discount);
		}
		
		return listOfProduct;
	}
}
