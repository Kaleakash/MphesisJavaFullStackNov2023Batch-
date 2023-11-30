package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoreAndRetrievePrimitiveDataInformation {

	public static void main(String[] args) throws Exception {
//		int id=100;
//		String name ="Ravi Kumar";
//		float salary = 24000;
//		// store the information in file 
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.close();
//		fos.close();
//		System.out.println("primitive information stored in file");
		
		// read primitive data from file 
		FileInputStream fis= new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int eid = dis.readInt();
		String ename = dis.readUTF();
		float esalary = dis.readFloat();
		System.out.println("id is "+eid);
		System.out.println("name is "+ename);
		System.out.println("salary is "+esalary);
		fis.close();
		dis.close();
	}

}
