package com.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		
		Connection connection = null; 
		try {
			String url="jdbc:mysql://localhost:3306/shopping_cart";
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "dj", "dj123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
