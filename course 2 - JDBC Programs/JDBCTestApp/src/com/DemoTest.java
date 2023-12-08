package com;
import java.sql.*;
import java.util.Scanner;
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
//			ResultSet rs = stmt.executeQuery("select * from employee");
//			while(rs.next()) {
//				//System.out.println(" Id "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//				System.out.println(" Id "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
//			}
			
			Scanner sc = new Scanner(System.in);
			// Insert Query using PreparedStatement
//			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//			
//			System.out.println("Enter the id");
//			int id = sc.nextInt();
//				pstmt.setInt(1, id);
//			
//			System.out.println("Enter the name");
//			String name = sc.next();
//				pstmt.setString(2, name);
//			
//			System.out.println("Enter the salary");
//			float salary = sc.nextFloat();
//				pstmt.setFloat(3, salary);
//			
//			int result = pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Record inserted successfully");
//			}
			
			// Delete Query using PreparedStatement
			PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
			
			System.out.println("Enter the id");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("Record deleted successfully");
			}else {
				System.out.println("Record not present");
			}
			
		} catch (Exception e) {
			System.out.println(e);  // toString method to display exception 
		}

	}

}
