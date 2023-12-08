package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			//System.out.println("Driver loaded successfully");
			
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"root@123");
			//System.out.println("Connected successfully");
			Statement stmt  = con.createStatement();
			//System.out.println("Statement created..");
			
			// Insert Query 
//			int result = stmt.executeUpdate("insert into employee values(1,'Mahesh',45000)");
//			if(result>0) {
//				System.out.println("Record inserted successfully");
//			}
//			
//			// Delete Query 
//			int result = stmt.executeUpdate("delete from employee where id =2");
//			if(result>0) {
//				System.out.println("Record deleted successfully");
//			}else {
//				System.out.println("Record not present");
//			}
			
			

			// update Query 
//			int result = stmt.executeUpdate("update employee set salary = 65000 where id=123");
//			if(result>0) {
//				System.out.println("Record updated successfully");
//			}else {
//				System.out.println("Record not present");
//			}
			
			// Retrieve query 
			ResultSet rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				//System.out.println(" Id "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
				System.out.println(" Id "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			}
		} catch (Exception e) {
			System.out.println(e);  // toString method to display exception 
		}

	}

}
