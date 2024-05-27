package com.renukatodaytask;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TodayTask")
public class TodayTask extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		pw.println("Name :"+name);
		String age=request.getParameter("age");
		pw.println("Age :"+age);
		String email=request.getParameter("email");
		pw.println("Email :"+email);
		String cources=request.getParameter("cources");
		pw.println("Cources :"+cources);
		
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
