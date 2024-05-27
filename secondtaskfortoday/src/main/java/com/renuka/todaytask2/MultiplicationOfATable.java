package com.renuka.todaytask2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MultiplicationOfATable")
public class MultiplicationOfATable extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cssTag="<link rel='stylesheet' type='text/css' href='home.css'>";
		PrintWriter pw=response.getWriter();
//		response.setContentType("html/text");
	    int number1=Integer.valueOf(request.getParameter("num")).intValue();
	    pw.println("<html>");
	    pw.println("<head>"
	    +cssTag+
	   "</head>");
	    pw.println("<body>");
	    pw.println("<table border='1' width=10% cellpadding=10px  cellspace=20px class="+"tables"+">");
		for(int i=1;i<=10;i++) {
			
			 pw.println("<tr>");
		      pw.println("<td>"+number1+"*"+i+"="+number1*i+"</td>");
		       pw.println("</tr>");
		       pw.println();
		   
		}
		
	    pw.println("</table>");
	    pw.println("</body>");
	  
	    pw.println("</html>");

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
