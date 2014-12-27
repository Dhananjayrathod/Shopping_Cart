package com.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * Servlet implementation class BillingServlet
 */
/*@WebServlet("/BillingServlet")*/
public class BillingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection conn=null;	
	PreparedStatement pstmt;
	ResultSet rs;
    
		
    public BillingServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			conn=DBConnection.getConnection();
			int total_price=0;
		
			int uid=(int) request.getSession().getAttribute("id");
			
			try {
				
					//To get list of all cart
				
					List<Cart> result = new ArrayList<Cart>();
					
					result = CartFactory.create().getProducts(uid);

					// Total bill amount
					
					total_price=CartFactory.create().getTotal(uid);
					
					//Insert into Billing table
					
					String insertinbilling="insert into billing (uid,total_amt) values(?,?)";
					
		
					pstmt=conn.prepareStatement(insertinbilling);
					
					pstmt.setInt(1, uid);
					pstmt.setInt(2, total_price);
					
					pstmt.execute();
					pstmt.clearParameters();
					pstmt.close();
					
					//Get the latest bill
					
					String getBillNo="select MAX(bill_no) from billing ";
					
					pstmt=conn.prepareStatement(getBillNo);
					
					rs=pstmt.executeQuery();
					
					rs.next();
					int bill_no=rs.getInt("MAX(bill_no)");
					
					pstmt.clearParameters();
					pstmt.close();
					
					//Insert into order_inv table 
					
					String query = "insert into order_inv(bill_no,product_id,quantity,total_prod_price) values(?,?,?,?)";
					
					pstmt=conn.prepareStatement(query);
					
					for(Cart list: result)
					{
						pstmt.setInt(1, bill_no);
						pstmt.setInt(2,list.getProductId() );
						pstmt.setInt(3, list.getQuantity());
						pstmt.setInt(4, list.getPrice());
						pstmt.execute();
						pstmt.clearParameters();
					}		
					
					
					pstmt.close();
					
					//Delete entry from cart table
					
					String deletequery="DELETE from cart where uid=? ";
					pstmt=conn.prepareStatement(deletequery);
					pstmt.setInt(1, uid);
					pstmt.execute();
					pstmt.clearParameters();
					pstmt.close();
					
					RequestDispatcher rd=request.getRequestDispatcher("/Bill.jsp");
					rd.forward(request, response);
					
					
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
			
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
