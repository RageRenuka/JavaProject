package com.renuka.emailver;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class SessionPassword
 */
@WebServlet("/SessionPassword")
public class SessionPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pass=req.getParameter("pwd");
		HttpSession session=req.getSession();
		String email=(String)session.getAttribute("EmailId");
		PrintWriter writer=resp.getWriter();
		if(email!=null) {
		
		
		String query="select*from userdeatiels where mailid=? and password?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				resp.sendRedirect("https://www.google.com");
			}
			else {
				RequestDispatcher dispatcher=req.getRequestDispatcher("SessionEmail.html");
				dispatcher.include(req, resp);
//				
//				resp.sendRedirect("SessionEmail.html");
				
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		else {
			writer.println("SESSION TIME OUT.........!!!!");
		}

	}
}

