package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

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
		
		public 	int deleteTrainer(int tid) {	
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			Trainer t1 = session.find(Trainer.class, tid);
			if(t1==null) {
				return 0;
			}else {
				tran.begin();
					session.delete(t1);
				tran.commit();
				return 1;
			}	
		}
		
		public 	int updateTrainer(Trainer trainer) {	
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			Trainer t1 = session.find(Trainer.class, trainer.getTid());
			if(t1==null) {
				return 0;
			}else {
				tran.begin();
					t1.setTname(trainer.getTname());
					session.update(t1);
				tran.commit();
				return 1;
			}	
		}
		
		public Trainer findTrainer(int tid) {	
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			Trainer t1 = session.find(Trainer.class, tid);
			return t1;
		}
		
		public List<Trainer> findAllTrainers() {
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			//TypedQuery tq	= session.createQuery("select t from Trainer t");
			//TypedQuery tq	= session.createQuery("from Trainer t");
			TypedQuery tq	= session.createQuery("from Trainer");
			List<Trainer> listOfTrainer = tq.getResultList();
			return listOfTrainer;
		}
		public List<String> findAllTrainerNames() {
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			//TypedQuery tq	= session.createQuery("select t from Trainer t");
			//TypedQuery tq	= session.createQuery("from Trainer t");
			TypedQuery tq	= session.createQuery("select t.tname from Trainer t");
			List<String> trainerNames = tq.getResultList();
			return trainerNames;
		}
		
		public List<Object[]> findAllTrainerIdAndName() {
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			//TypedQuery tq	= session.createQuery("select t from Trainer t");
			//TypedQuery tq	= session.createQuery("from Trainer t");
			TypedQuery tq	= session.createQuery("select t.tid, t.tname from Trainer t");
			List<Object[]> trainerNames = tq.getResultList();
			return trainerNames;
		}
		
}


