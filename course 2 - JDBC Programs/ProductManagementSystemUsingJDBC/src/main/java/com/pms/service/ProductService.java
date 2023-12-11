package com.pms.service;

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
}
