package com.example.service;

import java.util.List;

import com.example.model.Cart;

public interface CartService {

	public int getStock(int productId);
	
	public List<Cart> getProducts(int userId);
	
	public int getTotal(int userId);
	
}
