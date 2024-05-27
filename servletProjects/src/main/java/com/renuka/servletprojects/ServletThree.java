package com.renuka.servletprojects;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletThree extends HttpServlet {
	
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    
//    String data11 = (String) request.getAttribute("myData1");
//	String data22 = (String) request.getAttribute("myData2");
	
//	 request.setAttribute("empcource", cource);
//     request.setAttribute("empcity", city);
     
//    String courceemp = (String) request.getAttribute("myData1");
//	String cityemp = (String) request.getAttribute("myData2");
//     out.println(data11);
//     out.println(data22);
//     out.println(courceemp);
//     out.println(cityemp);
	     PrintWriter pw = response.getWriter();

	     response.setContentType("text/html;charset=UTF-8");
	        pw.println("<!DOCTYPE html>");
	        pw.println("<html><body>");
	        pw.println("<h1>Employee Personal Deatiles.......</h1>");
	        
	        
	        
	       
	       
	 
	    pw.println(request.getParameter("empId"));
	    pw.println(request.getParameter("empfName"));
	    pw.println(request.getParameter("emplNmae"));
	    pw.println(request.getParameter("empContact"));
	    pw.println(request.getParameter("empMailId"));
	    pw.println(request.getParameter("empCity"));
		
		pw.println("<h1>Employee Education Deatiles......</h1>");
		
		pw.println("<h2> Employee HightQualification is:" +request.getParameter("qualification")+" </h2>");
		pw.println("<h2> Branch is : "+request.getParameter("branch")+" </h2>");
		pw.println("<h2> Percentage is : "+request.getParameter("percentage")+" </h2>");
		pw.println("<h2> Year Of PassedOut is : "+ request.getParameter("passedOut")+" </h2>");
		pw.println("<h2> City is : "+ request.getParameter("city")+" </h2>");
		
		 pw.println("</form>");
	     pw.println("</body></html>");

	
   

//  String qualification12=(String) request.getAttribute("qualification44");
	
  
//    response.setContentType("text/html");
//     
//      out.println("This is the Third Servlet.......");
//      out.println(request.getParameter("empId"));
//      out.println(request.getParameter("empId"));
    

//out.println("<html><body>");
//out.println("<h2>Data from Servlet A: " + empId99 + "</h2>");
//out.println("<h2>Data from Servlet A: " + qualification12 + "</h2>");
//out.println("<h2>Data from Servlet A: " + empfName99+ "</h2>");
//out.println("</body></html>");
  

  
// out.println(empId12);
//out.println(empfName12);
//out.println(emplName12);
// out.println(empContact12);
// out.println(empMaiId12);
// out.println(empCity12);
	  
	
//	PrintWriter pw=response.getWriter();
////	String empId223=(String) request.getAttribute("empId22");
////	pw.println(empId223);
//	
//String data22 = (String) request.getAttribute("empId22");
//pw.println(data22);
     
    
}

}
