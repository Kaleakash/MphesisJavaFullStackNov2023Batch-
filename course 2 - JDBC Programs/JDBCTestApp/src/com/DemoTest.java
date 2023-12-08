package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver loaded successfully");
			
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"root@123");
			System.out.println("Connected successfully");
			Statement stmt  = con.createStatement();
			System.out.println("Statement created..");
			int result = stmt.executeUpdate("insert into employee values(1,'Mahesh',45000)");
			if(result>0) {
				System.out.println("Record inserted successfully");
			}
		} catch (Exception e) {
			System.out.println(e);  // toString method to display exception 
		}

	}

}
