package com.renuka.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	      String cssproperties="<link rel='stylesheet' type='text/css' href='css/style.css'";
		
        PrintWriter pw=response.getWriter();
        pw.write("<html>");
   		pw.write("<head>");
//   		pw.write(cssproperties);
   		pw.write("</head>");
   		pw.write("<body>");
   		pw.write("<table border='1' align='center'>"
   				
   						+"<tr style=background-color:black;color:azure;>"
   						+"<th>Sno</th>"
   					    +"<th>Sname</th>"
   						+"<th>Email</th>"
   						+"<th>Salary</th>"
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
		    response.sendRedirect("form.html");
	}

}
