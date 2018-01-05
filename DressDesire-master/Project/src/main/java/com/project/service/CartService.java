package com.project.service;

import java.util.List;

import com.project.model.Cart;

public interface CartService {
	public List<Cart> list(String user_id);
	public Cart get(int id);

	public boolean save(Cart cart);
	public boolean update(Cart cart);
	public boolean delete(Cart Cart);

	

	public Double getTotalAmount(String id);
	
	public Cart getCart(String user_id, String product_name);
	
	public Integer getQuantity(String user_id, String product_name);
	
	
	public void removeCartProduct(String product_name);
	
	

}
