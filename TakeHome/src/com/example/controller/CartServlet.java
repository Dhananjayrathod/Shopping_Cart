package com.example.controller;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Cart;
import com.example.service.factory.CartFactory;

/**
 * Servlet implementation class CartServlet
 */
/*@WebServlet("/CartServlet")*/
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
				
    public CartServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   
    	int id= (int) request.getSession().getAttribute("id");
		
		int productId= Integer.parseInt(request.getParameter("productId"));
		
		int quantity = 1;
		
		int stockId = CartFactory.create().getStock(productId);
		
		if(stockId >=quantity) {
			ProductSelection.insertIntoCart(id,productId,quantity);	
		}
		
		List<Cart> result = new ArrayList<Cart>();
		
		result = CartFactory.create().getProducts(id);
		
		request.setAttribute("Cart", result);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/Main.jsp");
		rd.forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
