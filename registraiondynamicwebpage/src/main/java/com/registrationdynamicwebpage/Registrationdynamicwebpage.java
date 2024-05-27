package com.registrationdynamicwebpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrationdynamicwebpage
 */
@WebServlet("/Registrationdynamicwebpage")
public class Registrationdynamicwebpage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
	    String s=request.getParameter("name");
	    pw.println("Name: "+s);
	    String mobile=request.getParameter("number");
	    pw.println("MobileNumber: "+mobile);
	    String email=request.getParameter("email");
	    pw.println("EmaiId: "+email);
	    String age=request.getParameter("age");
	    pw.println("EmaiId: "+age);
	    String course=request.getParameter("course");
	    pw.println("Course: "+course);
	    String fee=request.getParameter("coursefee");
	    pw.println("CourseFee: "+fee);
	    String datetime=request.getParameter("datetime");
	    pw.println("Time&Date: "+datetime);
	    	pw.close();
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
