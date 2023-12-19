package com.pms.resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryResource {

	static SessionFactory sf;
	
	// This code execute only once. 
	static {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		try {
		return sf;
		}catch(Exception e) {
			System.err.println("Session Factory error "+e);
			return null;
		}
	}
}
