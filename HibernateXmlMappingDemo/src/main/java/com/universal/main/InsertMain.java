package com.universal.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.universal.pojo.Product;

public class InsertMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Product product = new Product();
		product.setName("keyboard");
		product.setPrice(450);
		product.setQty(20);
		
		session.save(product);
		
		tr.commit();
		System.out.println("object saved "
				+ "into the database");
		
		sf.close();
	}
}