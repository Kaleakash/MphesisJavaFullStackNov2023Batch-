package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Student;
import com.resource.HibernateResource;

public class StudentDao {

	
	
	
	public List<Student> findAllStudents() {
		SessionFactory sf = HibernateResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Student");
		List<Student> listOfStudents= tq.getResultList();
		return listOfStudents;
	}
}
