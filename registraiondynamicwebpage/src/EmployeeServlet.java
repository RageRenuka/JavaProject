package com.renuka.webproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public EmployeeServlet() {
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
         pw.write("<html>");
    		pw.write("<head>");

    		pw.write("</head>");
    		pw.write("<body>");
    		pw.write("<table border='1' align='center'>"
    				
    						+"<tr style=background-color:black;color:azure;>"
    						+"<th>EmpNnumber</th>"
    					    +"<th>EmpName</th>"
    						+"<th>Email</th>"
    						+"<th>EmpSalary</th>"
    						+"<th>Contact</th>"
    						+"<th>Age</th>"
    						+ "</tr>"
	                    +"<tr>"
    		                +"<td>"+request.getParameter("sno")+"</td>"
  						+"<td>"+request.getParameter("name")+"</td>"
  						+"<td>"+request.getParameter("email")+"</td>"
  						+"<td>"+request.getParameter("salary")+"</td>"
  						+"<td>"+request.getParameter("number")+"</td>"      						
  						+"<td>"+request.getParameter("age")+"</td>"
						 +"</tr>");
    					pw.write("</table>");
    					pw.write("</body>");
    					pw.write("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		 doGet(request, response);	
	}

}
