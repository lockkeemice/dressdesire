package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CartDao;
import com.project.model.Cart;
@Service
public class CartServiceImpl implements CartService {
@Autowired
CartDao cartDao;
	public List<Cart> list(String user_id) {
		// TODO Auto-generated method stub
		return cartDao.list(user_id);
	}

	public Cart get(int id) {
		// TODO Auto-generated method stub
		return cartDao.get(id);
	}

	public boolean save(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.save(cart);
	}

	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.update(cart);
	}

	public boolean delete(Cart Cart) {
		// TODO Auto-generated method stub
		return cartDao.delete(Cart);
	}

	public Double getTotalAmount(String id) {
		// TODO Auto-generated method stub
		return cartDao.getTotalAmount(id);
	}

	public Cart getCart(String user_id, String product_name) {
		// TODO Auto-generated method stub
		return cartDao.getCart(user_id, product_name);
	}

	public Integer getQuantity(String user_id, String product_name) {
		// TODO Auto-generated method stub
		return cartDao.getQuantity(user_id, product_name);
	}

	public void removeCartProduct(String product_name) {
		cartDao.removeCartProduct(product_name);
		
	}


	
	}


