package com.universal.dao;

import java.util.List;

import com.universal.pojo.Product;

public interface ProductDao {

	//query operations
	List<Product> getAllproducts();
	Product searchProduct(int pid);
	
	//crud operations
	boolean addNewProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int pid);
}








