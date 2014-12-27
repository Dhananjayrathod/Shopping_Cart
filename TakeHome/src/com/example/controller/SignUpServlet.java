package com.example.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;



/**
 * Servlet implementation class SignUpServlet
 */

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con;
       java.sql.PreparedStatement pstmt;
       ResultSet rs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();

    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//AJAX code for avoiding duplicate entry start here
		String requestType = request.getParameter("reuqestType");
	
		if(requestType != null && requestType.equalsIgnoreCase("ajaxUserValidation"))
		{
			boolean isUser = false;
			String userName = request.getParameter("userName");
			if (userName.equals("")) {
				userName = "User name cannot be empty";
			} else {
				
				isUser = UserValidation.isUserExist(userName);
				
			}
			response.setContentType("text/plain");
			response.getWriter().write(String.valueOf(isUser));
			
		}else{
	//AJAX code ends here

								
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String mob_no=request.getParameter("mobilenumber");
			String usrname=request.getParameter("username");
			String pwd =request.getParameter("password");
			
			
	    	try {
		    		con=DBConnection.getConnection();
				
					String sql="insert into user_reg(name,address,mobile_no,user_name,passwd)values(?,?,?,?,?)";
					
					pstmt=con.prepareStatement(sql);
					
					pstmt.setString(1, name);
					pstmt.setString(2, address);
					pstmt.setString(3, mob_no);
					pstmt.setString(4, usrname);
					pstmt.setString(5, pwd);
					
					pstmt.execute();
					pstmt.clearParameters();
					
					pstmt.close();
					
					
					String sql1="select uid from user_reg where name= ? AND user_name=?";
					
					pstmt=con.prepareStatement(sql1);
					
					pstmt.setString(1, name);
					pstmt.setString(2, usrname);
					
					rs=pstmt.executeQuery();
					
					rs.next();
					
					int id= rs.getInt("uid");
					
					System.out.println(id);
					
					pstmt.close();
					
					HttpSession sess=request.getSession();
					
					RequestDispatcher rd;
					
					sess.setAttribute("user", name);
					sess.setAttribute("id", id);
					rd=request.getRequestDispatcher("/Main.jsp");
					rd.forward(request, response);
		
					} catch (Exception e) {
					
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

	
}
