package com.universal.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ApplicationSessionFactory {

	public static SessionFactory getSessionFactory() {
		
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			ServiceRegistry sr = new 
					StandardServiceRegistryBuilder()
					.applySettings(config.getProperties())
					.build();
			
			SessionFactory sf = 
					config.buildSessionFactory(sr);
			
			return sf;
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}
}
