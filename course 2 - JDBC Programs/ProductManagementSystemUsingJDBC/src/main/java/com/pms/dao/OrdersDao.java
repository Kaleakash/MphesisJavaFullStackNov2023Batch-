package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pms.bean.Product;
import com.pms.resource.DbResource;

public class OrdersDao {

	
	public int placeOrders(Product product) {
		try {

			Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("insert into orders(pid,orderdate,totalprice) values(?,sysdate(),?)");
	pstmt.setInt(1, product.getPid());
	pstmt.setFloat(2, product.getPrice());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Product insert exception"+e);
			return 0;
		}
	}
	
	public List<Product> findOrderDetails() {
		List<Product> listOfProduct = new ArrayList<>();
	try {

	Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select p.pname,o.orderdate from product p, orders o where p.pid = o.pid");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			
			
		}
		} catch (Exception e) {
			System.err.println("Search product by id"+e);
		}
	return listOfProduct;
}
}
