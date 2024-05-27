package com.renuka.servletprojects;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletSecond  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("This is the second servlet..........");
//		
		//response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        out.println("<!DOCTYPE html>");
        out.println("<html><body>");
        out.println("<h2>Employee Education Deatiles</h2>");
//        out.println("<form action='three' method='get'>");
        out.println("<form action=\"three\" method=\"get\">");
        out.println("HighestQualification: <input type='text' name='qualification'><br>");
        out.println("Branch:<input type='text' name='branch'><br>");
        out.println("Percentage: <input type='text' name='percentage'><br>");
        out.println("PassedOut: <input type='text' name='passedOut'><br>");
        out.println("Collage: <input type='text' name='collage'><br>");
        out.println("City: <input type='text' name='city'><br>");
        out.println("<input type='submit' value='submit'>");
        out.println("</form>");
        out.println("</body></html>");
        
        
    	
      ServletContext context= getServletContext();
    	String  empId= (String) context.getAttribute("emId");
    	String empfName = (String) context.getAttribute("firstname");
    	String emplName =  (String) context.getAttribute("lastname");
    	String empContact =  (String) context.getAttribute("contact");
    	String empMailId =  (String) context.getAttribute("mail");
    	String empCity =  (String) context.getAttribute("city1");
        
//        String data9 = (String) request.getAttribute("data1");
//        String data8 = (String) request.getAttribute("data2");
//        String data7 = (String) request.getAttribute("data3");
//        
//        String data6 = (String) request.getAttribute("data4");
//        String data5 = (String) request.getAttribute("data5");
//        String data4 = (String) request.getAttribute("data6");
        
        
        
        
        
      response.sendRedirect("three.html");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
//        
//        String qualifications= request.getParameter("qualification");
//        String branchs= request.getParameter("branch");
//        String percentages= request.getParameter("percentage");
//        String passedOuts= request.getParameter("passedOut");
//        String collages= request.getParameter("collage");
//        String citys= request.getParameter("city");
////        
//   ServletContext context = getServletContext();
//	context.setAttribute("qualifications1",qualifications);
//	context.setAttribute("branchs1",branchs);
//	context.setAttribute("percentages1",percentages);
//	context.setAttribute("passedOuts1",passedOuts);
//	context.setAttribute("collages1",collages);
//	context.setAttribute("citys1",citys);
//		
	
	
//	RequestDispatcher rd = request.getRequestDispatcher("three.html");
//	rd.forward(request, response);
       
        
        
//        request.setAttribute("qualification44", qualifications);
//        request.setAttribute("branch44", branchs);
//        request.setAttribute("percentage44", percentages);
//        request.setAttribute("passedOut44", passedOuts);
//        request.setAttribute("collage44", collages);
//        request.setAttribute("city44", citys);
//   	 response.sendRedirect("three.html");
//        
       
       
        
//        String name= request.getParameter("empname");
//        String email= request.getParameter("empemail");
//        String cource= request.getParameter("cource");
//        String city= request.getParameter("city");
     
//        out.println(cource);
//        out.println(city);
        
       
        
//        String someName = (String)request.getAttribute("empName");
//        pw.println(name);
//        pw.println(email);
//        
//        RequestDispatcher dispatcher =
//			       getServletContext().getRequestDispatcher("three");
//			    dispatcher.include(request, response);
			   
		
//    	RequestDispatcher rd=	request.getRequestDispatcher("three");
//		rd.forward(request, response);
//		rd.include(request, response);
////		response.sendRedirect("three");
//	}
		
////		String data11 = (String) request.getAttribute("myData1");
////		String data22 = (String) request.getAttribute("myData2");
//
//        // Display the data
////        response.setContentType("text/html");
////        PrintWriter out = response.getWriter();|
//        
////        out.println("<html><body>");
////        out.println("<h2>Data from Servlet A: " + data11 + "</h2>");
////        out.println("<h2>Data from Servlet A: " + data22+ "</h2>");
////        out.println("</body></html>");
        
//        request.setAttribute("empcource", cource);
//        request.setAttribute("empcity", city);
        
//	     RequestDispatcher rd = request.getRequestDispatcher("three");
//	     rd.forward(request,response);
//        
//        String courceemp = (String) request.getAttribute("myData1");
//		String cityemp = (String) request.getAttribute("myData2");
		
//	 
		
		
	}
}
