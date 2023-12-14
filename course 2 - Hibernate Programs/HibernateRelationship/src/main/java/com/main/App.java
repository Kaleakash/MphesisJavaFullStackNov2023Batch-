package com.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	System.out.println("file loaded ");
	SessionFactory sf= con.buildSessionFactory();
	}

}
