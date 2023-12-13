package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Trainer;
import com.resource.HibernateResource;

public class TrainerDao {

		public 	int storeTrainer(Trainer trainer) {
			try {
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(trainer);
			tran.commit();
			return 1;
			}catch(Exception e) {
				System.err.println(e);
				return 0;
			}
		}
}
