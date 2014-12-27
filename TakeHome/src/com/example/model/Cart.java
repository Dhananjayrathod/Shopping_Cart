package com.example.model;

public class Cart {

	private int cartId;
	
	private int uId;
	
	private int productId;
	
	private String productName;
	
	private int quantity;
	
	private int price;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", uId=" + uId + ", productId="
				+ productId + ", productName=" + productName + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
	
}
