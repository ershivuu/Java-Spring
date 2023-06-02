package com.universal.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.universal.dao.ProductDao;
import com.universal.pojo.Product;

public class ProductDaoImpl implements ProductDao {

	private HibernateTemplate hTemplate;

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public List<Product> getAllproducts() {
		
		List<Product> lst = 
				hTemplate.execute(
		new HibernateCallback<List<Product>>() {
			
			public List<Product> doInHibernate(
		Session session) throws HibernateException 
			{
				Query q = session.createQuery(
						"From Product");
				return q.list();
			}
		});
		
		return lst;
	}

	public Product searchProduct(int pid) {
		
		Product product = hTemplate.get(Product.class,
				pid);
		return product;
	}

	public boolean addNewProduct(Product product) {
		try {
			hTemplate.save(product);
			return true;
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	public boolean updateProduct(Product product) {
		
		boolean b = hTemplate.execute(
		new HibernateCallback<Boolean>() {
			public Boolean doInHibernate(Session session) 
					throws HibernateException {
				Query q = session.createQuery("UPDATE"
			+ " Product SET pname = :name , price = :prc,"
			+ " qty = :qt WHERE pid = :id");
				q.setParameter("name", product.getPname());
				q.setParameter("prc", product.getPrice());
				q.setParameter("qt", product.getQty());
				q.setParameter("id", product.getPid());
				
				if(q.executeUpdate() > 0)
					return true;
				else
					return false;
			}
		});
		
		return b;
	}

	public boolean deleteProduct(int pid) {
		boolean b = hTemplate.execute(
				new HibernateCallback<Boolean>() {
					public Boolean doInHibernate(Session session) 
							throws HibernateException {
						Query q = session.createQuery("DELETE"
						+ " FROM Product WHERE pid = :id");
						q.setParameter("id", pid);
						
						if(q.executeUpdate() > 0)
							return true;
						else
							return false;
					}
				});
				
				return b;
	}
}





