package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.resource.HibernateResource;

public class StudentDao {

	public int storeStudent(Student student) {
		try {
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(student);
			tran.commit();
			return 1;
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	
	public List<Student> findAllStudents() {
		SessionFactory sf = HibernateResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Student");
		List<Student> listOfStudents= tq.getResultList();
		return listOfStudents;
	}
}
