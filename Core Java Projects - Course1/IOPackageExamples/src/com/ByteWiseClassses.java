package com;

import java.io.DataInputStream;
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
		
		// source :keyword , destination : file 
				DataInputStream dis = new DataInputStream(System.in);
				FileOutputStream fos = new FileOutputStream("abc.txt");
				PrintStream ps = System.out;
				ps.println("Enter the data");
				int ch;
				while((ch = dis.read())!= '@') {
					fos.write(ch);
				}
				fos.close();
				System.out.println("Data stored in file");
	}

}
