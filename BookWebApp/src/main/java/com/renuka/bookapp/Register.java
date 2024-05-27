package com.renuka.bookapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final String query="INSERT INTO book(bookname,bookedition,bookprice)values(?,?,?)";

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String bookname=request.getParameter("bookname");
		String bookedition=request.getParameter("bookedition");
		float bookprice=Float.parseFloat(request.getParameter("bookprice"));
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
			
		}
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka")){
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, bookname);
			ps.setString(2, bookedition);
			ps.setFloat(3, bookprice);
			int count=ps.executeUpdate();
			if(count==1){
				pw.println("<h2>Record is Registered Successfully</h2>");
				
			}else {
				pw.println("<h2>Record is not Registered Successfully</h2>");
			}
			
		} catch (SQLException se) {
			
			se.printStackTrace();
			pw.println("<h1>"+se.getMessage()+"</h2>");
			
		}
		 catch (Exception e) {
				
				e.printStackTrace();
				pw.println("<h1>"+e.getMessage()+"</h2>");
				
			}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
