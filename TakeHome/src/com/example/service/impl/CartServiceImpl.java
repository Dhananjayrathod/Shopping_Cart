package com.example.service.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.controller.DBConnection;
import com.example.model.Cart;
import com.example.service.CartService;

public class CartServiceImpl implements CartService{

	@Override
	public int getStock(int productId) {
		
		int stockId = 0;
		Connection connection = DBConnection.getConnection();
			    		
		String sql="select stock from product where product_id= ?";
		
		try {
			
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, productId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				stockId = rs.getInt("stock");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
	    	try {
	    		connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
		
		return stockId;
		
	}
	

	@Override
	public List<Cart> getProducts(int userId) {
		
		String query = "select cart.product_id,product_name,quantity,cart.price from cart inner join product on cart.product_id = product.product_id where uid=?";
		List<Cart> carts = new ArrayList<Cart>();
		Connection connection = DBConnection.getConnection();
		try {
				PreparedStatement pstmt = connection.prepareStatement(query);
				pstmt.setInt(1, userId);
				ResultSet rs=pstmt.executeQuery();
				
				while(rs.next())
				{
					Cart cart = new Cart();
					
					cart.setProductId(rs.getInt("product_id"));
					cart.setProductName(rs.getString("product_name"));
					cart.setQuantity(rs.getInt("quantity"));
					cart.setPrice(rs.getInt("price"));
					
					carts.add(cart);
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return carts;
	}


	@Override
	public int getTotal(int userId) {
		
			int totalprice=0;
			
			String query="select price from cart where uid= ? ";
			
			Connection connection =DBConnection.getConnection();
			
			try {
					
					PreparedStatement pstmt= connection.prepareStatement(query);
					pstmt.setInt(1, userId);
					ResultSet rs= pstmt.executeQuery();
					
					while(rs.next())
					{
						totalprice=totalprice+rs.getInt("price");
					}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		return totalprice;
	}


	
}
