package com.example.controller;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductSelection {

	public static void insertIntoCart(int id,int pid,int quantity)
	{
		Connection con=null;
		java.sql.PreparedStatement pstmt;
		ResultSet rs;
		

		try {
				con=DBConnection.getConnection();
		
				String updateStock="select product_id,price, stock from product where product_id= ?";
				
				pstmt=con.prepareStatement(updateStock,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				pstmt.setInt(1, pid);
				rs=pstmt.executeQuery();
				rs.next();
				int price=rs.getInt("price");
				int new_stock=rs.getInt("stock");
				
				new_stock = new_stock-quantity;
				
				rs.updateInt("stock", new_stock);
				
				rs.updateRow();
				
				pstmt.clearParameters();
				
				pstmt.close();
				
				String sql="INSERT INTO cart(uid,product_id,quantity,price)VALUES(?,?,?,?)";
				
				int total_price = price * quantity;
				
				pstmt=con.prepareStatement(sql);
				
				pstmt.setInt(1, id);
				pstmt.setInt(2, pid);
				pstmt.setInt(3, quantity);
				pstmt.setInt(4, total_price);
				
				pstmt.execute();
				
				pstmt.clearParameters();
				pstmt.close();
				
				
					
				
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
