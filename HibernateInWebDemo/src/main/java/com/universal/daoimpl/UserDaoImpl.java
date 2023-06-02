package com.universal.daoimpl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.universal.dao.UserDao;
import com.universal.model.User;
import com.universal.sessionfactory.ApplicationSessionFactory;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUser(User user) {
		
		SessionFactory sf = null;
		
		try {
			sf = 
		ApplicationSessionFactory.getSessionFactory();
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Query query = 
			session.createQuery("FROM User WHERE "
				+ "username =:uname AND password=:pass");
			
			query.setParameter("uname", 
					user.getUsername());
			query.setParameter("pass", 
					user.getPassword());
			List<User> lst = query.list();
			
			tr.commit();
			
			if(lst.size() > 0)
				return true;
			else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			sf.close();
		}
	}

	@Override
	public boolean addNewUser(User user) {
		
		SessionFactory sf = null;
		
		try {
			sf = 
		ApplicationSessionFactory.getSessionFactory();
			
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(user);
			
			tr.commit();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			sf.close();
		}
	}
}










