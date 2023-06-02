package com.universal.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.universal.dao.ProductDao;
import com.universal.daoimpl.ProductDaoImpl;
import com.universal.pojo.Product;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext context = 
		new ClassPathXmlApplicationContext("Spring.xml");
		
		ProductDao daoImpl = 
				context.getBean("daoImpl",
		ProductDaoImpl.class);
		
//		List<Product> lst = daoImpl.getAllproducts();
//		lst.forEach(System.out::println);
		
//		Product pr = daoImpl.searchProduct(9);
//		if(pr != null)
//			System.out.println(pr);
//		else
//			System.out.println("No such product found");
		
//		Product product = new Product();
//		product.setPname("sandals");
//		product.setPrice(1300);
//		product.setQty(50);
//		
//		if(daoImpl.addNewProduct(product))
//			System.out.println("product added successfully");
//		else
//			System.out.println("product insertion failed");
//		
//		Product product = new Product();
//		product.setPid(10);
//		product.setPname("floaters");
//		product.setPrice(1500);
//		product.setQty(10);
//		
//		if(daoImpl.updateProduct(product))
//			System.out.println("product updated");
//		else
//			System.out.println("product updation failed");
//		
//		if(daoImpl.deleteProduct(10))
//			System.out.println("product deleted");
//		else
//			System.out.println("product deletion failed");
	}
}
