package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Resource res = new ClassPathResource("beans.xml");	// load the xml file. 
		//BeanFactory obj = new XmlBeanFactory(res);

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");	//this file enable @Component annotation 
		Address add = (Address)ac.getBean("address");
		System.out.println(add);
		add.setCity("Bangalore");
		add.setState("Kar");
		System.out.println(add);
		System.out.println("----------------------");
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
	}

}
