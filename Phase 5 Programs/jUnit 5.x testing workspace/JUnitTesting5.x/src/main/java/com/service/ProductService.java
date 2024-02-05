package com.service;

import com.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	public String getProductInfo() {
		// coding.....
		return pd.getProductInfo();
	}
}
