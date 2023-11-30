package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseClassExample {

	public static void main(String[] args) throws Exception{
	// source : keyboard destination : console 
//	InputStreamReader isr = new InputStreamReader(System.in);
//	BufferedReader br = new BufferedReader(isr);
	//InputStreamReader isr = new InputStreamReader(System.in);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("Enter the id");
//	int id = Integer.parseInt(br.readLine());
//	System.out.println("Enter the name");
//	String name = br.readLine();
//	System.out.println("id name "+id);
//	System.out.println("name is "+name);
		
	// Source : File 		Destination : File 
		FileReader fr = new FileReader("C:\\Users\\akash\\Desktop\\My SQL Mini Project.txt");
		FileWriter fw = new FileWriter("demo123.txt");
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
	}

}
