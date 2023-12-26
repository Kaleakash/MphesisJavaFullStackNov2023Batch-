package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository				// dao layer specific annotation 	
public class EmployeeDao {

	@Autowired
	DataSource ds;			// before spring framework using JNDI lookup we were searching database connection from application server. 
							// using spring framework with @Autowired if we use this annotation it will search database connection 
								// by default byType. 
	public int storeEmployee(Employee employee) {
		try {
		Connection con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, employee.getId());
		pstmt.setString(2, employee.getName());
		pstmt.setFloat(3, employee.getSalary());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
