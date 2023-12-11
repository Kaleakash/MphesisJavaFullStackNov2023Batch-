package com.pms.service;

import com.pms.bean.Product;
import com.pms.dao.OrdersDao;
import com.pms.dao.ProductDao;

public class OrdersService {

	ProductDao pd  = new ProductDao();
	OrdersDao od = new OrdersDao();
	
	public String placeOrder(int pid) {
	
		Product product  = pd.findProduct(pid);
		if(product==null) {
			return "Order didn't place because product not present";
		}else if(od.placeOrders(product)>0){
			return "Order placed successfully";
		}else {
			return "Order didn't place";
		}
	}
}
