package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ProductDao;
import com.project.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductDao productDao;
	public void saveOrUpdateProduct(Product product) {
		
		  productDao.saveOrUpdateProduct(product);
		// TODO Auto-generated method stub
		
	}

	public List<Product> getAllProducts() {
		
		return productDao.getAllProducts();
		// TODO Auto-generated method stub
		
	}

	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}

}
