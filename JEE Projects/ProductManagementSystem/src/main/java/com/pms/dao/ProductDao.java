package com.pms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pms.entity.Product;
import com.pms.resource.SessionFactoryResource;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(product);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
