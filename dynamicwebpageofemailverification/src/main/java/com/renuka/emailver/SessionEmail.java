package com.renuka.emailver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionEmail
 */
@WebServlet("/SessionEmail")
public class SessionEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("em");
		String query="select*from userdeatiels where mailid=?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			
			HttpSession session=req.getSession();
			session.setAttribute("EmailId", email);
			session.setMaxInactiveInterval(10);
			
			if(rs.next()) {
//				RequestDispatcher dispatcher=req.getRequestDispatcher("SessionPassowrdPage.html");
//				dispatcher.include(req, resp);
				resp.sendRedirect("SessionPassowrdPage.html");
			}
			else {
				RequestDispatcher dispatcher=req.getRequestDispatcher("SessionEmail.html");
				dispatcher.include(req, resp);
//				resp.sendRedirect("SessionEmail.html");
				
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
