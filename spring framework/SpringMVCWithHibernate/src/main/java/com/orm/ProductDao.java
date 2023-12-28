package com.orm;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sf;
	
	public int storeProduct(Product product) {
		try {
			System.out.println("dao layer");
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
	
	public int deleteProduct(int pid) {
		try {
		
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			Product p = session.find(Product.class, pid);
			if(p==null) {
				return 0;
			}else {
				tran.begin();
					session.delete(p);
				tran.commit();
				return 1;
			}
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> findAllProduct() {
		Session session = sf.openSession();
		TypedQuery<Product> qry = session.createQuery("from Product");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
}
