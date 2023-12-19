package com.pms.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pms.entity.Product;
import com.pms.resource.SessionFactoryResource;

public class ProductDao {
// alter table product modify column url varchar(10000);
//  alter table product modify column url blob;
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
	
	public List<Product> findAllProduct() {
		SessionFactory sf = SessionFactoryResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Product");  
		List<Product> listOfProduct = tq.getResultList();
		return listOfProduct;
	}
}
