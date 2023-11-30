package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterWiseClassExample {

	public static void main(String[] args) throws Exception{
	// source : keyboard destination : console 
//	InputStreamReader isr = new InputStreamReader(System.in);
//	BufferedReader br = new BufferedReader(isr);
	//InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the id");
	int id = Integer.parseInt(br.readLine());
	System.out.println("Enter the name");
	String name = br.readLine();
	System.out.println("id name "+id);
	System.out.println("name is "+name);
	}

}
