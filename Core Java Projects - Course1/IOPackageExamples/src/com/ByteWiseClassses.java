package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseClassses {

	public static void main(String[] args) throws Exception{
//	// source :keyword , destination : console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the data");
//		String info = dis.readLine();
//		ps.println(info);
		
//		// source :keyword , destination : file 	override the value 
//				DataInputStream dis = new DataInputStream(System.in);
//				FileOutputStream fos = new FileOutputStream("abc.txt");
//				PrintStream ps = System.out;
//				ps.println("Enter the data");
//				int ch;
//				while((ch = dis.read())!= '@') {
//					fos.write(ch);
//				}
//				fos.close();
//				System.out.println("Data stored in file");
		
		
//		// source :keyword , destination : file append the value 
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("xyz.txt",true);
//		PrintStream ps = System.out;
//		ps.println("Enter the data");
//		int ch;
//		while((ch = dis.read())!= '@') {
//			fos.write(ch);		// type casting 
//			System.out.print(ch+" "+(char)ch);
//		}
//		fos.close();
//		System.out.println("Data stored in file");
		
		// source : file , destination : file 
		FileInputStream fis = new FileInputStream("xyz.txt");
		FileOutputStream fos = new FileOutputStream("D:\\demo.txt");
		int ch;
		while((ch=fis.read()) != -1) {		// -1 = EOF
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("file copied....");
	}

}
