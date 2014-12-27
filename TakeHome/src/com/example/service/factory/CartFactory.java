package com.example.service.factory;

import com.example.service.CartService;
import com.example.service.impl.CartServiceImpl;

public class CartFactory {

	public static CartService create(){
		CartService cartService = new CartServiceImpl();
		return cartService;
	}
}
