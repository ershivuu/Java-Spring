package com.universal.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.universal.pojo.Contract_Employee;
import com.universal.pojo.Native_Employee;

public class AppMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Native_Employee ne = new Native_Employee();
		ne.setEmpId(1233);
		ne.setEmpName("Anil");
		ne.setOfc_address("Mumbai");
		
		Contract_Employee ce = new Contract_Employee();
		ce.setEmpId(1234);
		ce.setEmpName("Sunil");
		ce.setSite_address("Indore");
		
		Native_Employee ne1 = new Native_Employee();
		ne1.setEmpId(1235);
		ne1.setEmpName("Sumit");
		
		session.save(ne);
		session.save(ce);
		session.save(ne1);
		
		tr.commit();
		
		System.out.println("object saved");
		
		sf.close();
	}
}







