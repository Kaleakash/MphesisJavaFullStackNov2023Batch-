package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializationDemo {

	public static void main(String[] args) throws Exception{
//	Employee emp = new Employee();
//	
//	emp.setId(100);
//	emp.setName("Ravi");
//	emp.setSalary(34000);
//	
//	System.out.println(emp);
//	FileOutputStream fos = new FileOutputStream("employee.ser");
//	
//	ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(emp);
//			oos.close();
//			fos.close();
//			System.out.println("Object Serialization done successfully");
		
	FileInputStream fis = new FileInputStream("employee.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj	= ois.readObject();
		Employee emp1 = (Employee)obj;	// down level type casting 
		System.out.println(obj);
		System.out.println(emp1.getName()+" "+emp1.getSalary());
		ois.close();
		fis.close();
		System.out.println("Object de-serialization done successfully");
	}

}
