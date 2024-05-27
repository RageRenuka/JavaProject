package com.renuka.dispacherservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletOne extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		ServletContext context = getServletContext();
//		context.setAttribute("firstName", req.getParameter("firstname"));
//     ServletConfig servletConfig =  getServletConfig();
//      String servletNameConfiguredInWebDotXML =  servletConfig.getServletName();
//      System.out.println(servletNameConfiguredInWebDotXML);
	 
	RequestDispatcher rd = req.getRequestDispatcher("two");
//	rd.include(req, resp);
	rd.forward(req, resp);
		
		
		
	}
	}

