package com.example.controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserValidation {

	public static boolean isUserExist(String username){
		
		boolean isUser = false;
		
		Connection con = null;
		Statement stmt;
		ResultSet rs;
		
		try {
		
			con=DBConnection.getConnection();
			
			String sql="select user_name from user_reg";
			
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
							
				if(username.equals(rs.getString("user_name")))
				{
					isUser = true;
				}
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		return isUser;
	}
}
