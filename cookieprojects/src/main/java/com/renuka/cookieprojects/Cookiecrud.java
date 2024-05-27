package com.renuka.cookieprojects;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Cookiecrud  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String contact=req.getParameter("number");
		String city=req.getParameter("city");
		String datatime=req.getParameter("time");
		
		//creating the cookie
		Cookie cookiename = new Cookie("nameCookie",name);
		Cookie cookiecontact = new Cookie("contactCookie",contact);
		Cookie cookiecity = new Cookie("cityCookie",city);
		Cookie cookiedatatime = new Cookie("datatimeCookie",datatime);
		
		resp.addCookie(cookiename);
		resp.addCookie(cookiecontact);
		resp.addCookie(cookiecity);
		resp.addCookie(cookiedatatime);
		
		resp.sendRedirect("two");
		
		

}
	}
