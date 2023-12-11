package com.pms.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {

	static Connection con;
	// it load only once 
	static {
		System.out.println("This block loaded only once");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_phase2", "root", "root@123");
		
		} catch (Exception e) {
			System.err.println("Db Connection error loaded only once "+e);
		
		}
	}
	
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println("Db Connection error "+e);
			return null;
		}
	}
	
	public static void closeConnection() {
		try {
			con.close();
		} catch (Exception e) {
			
		}
	}
}
