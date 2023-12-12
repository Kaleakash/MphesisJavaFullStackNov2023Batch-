package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class App {

	public static void main(String[] args) {
	// we need to load the xml file 
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	System.out.println("File loaded sucessfully");
	
	SessionFactory sf = con.buildSessionFactory();	// like a Connection con;
	
	Session session = sf.openSession();        // Like a Statement as well as PreparedStatement
	
	// Insert the record 
//	// Now we will create entity class object 
//	Employee emp1 = new Employee();
//	emp1.setId(103);
//	emp1.setName("Rajesh");
//	emp1.setSalary(18000);
//	
//	// Create Transaction object 
//				Transaction tran = session.getTransaction();
//				tran.begin();
//				
//					session.save(emp1);				// like a insert query 
//	
//				tran.commit();
//				
//				System.out.println("Record inserted successfully");
	
	// Delete Query 
	Employee emp2  = session.find(Employee.class, 100);		// select * from employee where id =100;
			if(emp2==null) {
				System.out.println("Record not present");
			}else {
				Transaction tran = session.getTransaction();
				tran.begin();
				session.delete(emp2);
				tran.commit();
				System.out.println("Record deleted successfully");
			}
	}

}
