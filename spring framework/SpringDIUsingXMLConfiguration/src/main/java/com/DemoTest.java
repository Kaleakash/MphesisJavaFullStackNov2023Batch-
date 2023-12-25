package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		
		Resource res = new ClassPathResource("beans.xml");	// load the xml file. 
		BeanFactory obj = new XmlBeanFactory(res);
//		Employee e1 = (Employee)obj.getBean("emp1");		// object class return type . done type casting 
//		e1.display();
		//Employee e2 = (Employee)obj.getBean("emp2");
		//e2.display();
//		Employee e3 = (Employee)obj.getBean("emp1");		// object class return type . done type casting 
//		e3.display();
		//Employee e4 = (Employee)obj.getBean("emp2");
		//e4.display();
		
		Employee e5 = (Employee)obj.getBean("emp1");
		System.out.println(e5);                  // it will call toString method 
		
		Employee e6 = (Employee)obj.getBean("emp2");
		System.out.println(e6);                  // it will call toString method 
	}

}













