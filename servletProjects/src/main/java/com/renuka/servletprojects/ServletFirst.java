package com.renuka.servletprojects;

import java.io.IOException;
import java.io.PrintWriter;



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
//import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;






public class ServletFirst extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr = response.getWriter();
		
//		
		
		     
	    pr.println("This is the first Servlet........");
	    String empId=request.getParameter("empId");
	    String empfName= request.getParameter("empfName");
	    String emplName= request.getParameter("emplName");
	    String empContact=request.getParameter("empContact");
	    String empMailId= request.getParameter("empMailId");
	    String empCity= request.getParameter("empCity");
	    
	    
	    ServletContext context =  getServletContext();
	  	context.setAttribute("emId",empId);
  		context.setAttribute("firstname",empfName);
	  	context.setAttribute("lastname",emplName);
	  	context.setAttribute("contact",empContact);
  		context.setAttribute("mail",empMailId);
  		context.setAttribute("city1", empCity);
	  	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    request.setAttribute("data1", empId);
//	    request.setAttribute("data2", empfName);
//	    request.setAttribute("data3", emplName);
//	    request.setAttribute("data4", empContact);	
//	    request.setAttribute("data5", empMailId);
//	    request.setAttribute("data6", empCity);
//	    
//	  
	    
	    
		response.sendRedirect("two");	

	    
//	        request.setAttribute("myData1", data1);
//	        request.setAttribute("myData2", data2);
//	     
	     
	     
//	     RequestDispatcher rd = request.getRequestDispatcher("second");
//	     rd.forward(request,response);6
	    
//	     RequestDispatcher rd=	request.getRequestDispatcher("second");
//////	     
//	        response.sendRedirect("two");
//
//		
//		 
//		 
////		 RequestDispatcher dispatcher =
////			       getServletContext().getRequestDispatcher("second");
//			    rd.include(request, response);
////			    dispatcher.include(request, response);
//			 rd.forward(request, response);
//			    pr.println(name);
//			     pr.println(email);
	     
	    
	}

}
