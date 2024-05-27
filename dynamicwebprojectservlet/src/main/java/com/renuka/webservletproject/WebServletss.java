package com.renuka.webservletproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebServlet
 */
@WebServlet("/WebServletss")
public class WebServletss extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebServletss() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
