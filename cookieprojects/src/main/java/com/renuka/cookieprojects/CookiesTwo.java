package com.renuka.cookieprojects;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookiesTwo extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pr = resp.getWriter();
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title> User Details Page </title>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("<form action= \"three\" method=\"post\">");
		pr.println("Enter School Name <input type=\"text\" name =\"schoolname\"><br>");
		pr.println("Enter Collage Name <input type=\"text\" name =\"collagename\"><br>");
		pr.println("<input type=\"submit\" value =\"Go\">");
		pr.println("</form>");
		pr.println("</body>");
		pr.println("</html>");
	}

}
