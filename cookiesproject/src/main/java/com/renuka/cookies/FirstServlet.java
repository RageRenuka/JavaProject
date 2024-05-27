package com.renuka.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	//  how to create coocies. 
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
//			Cookie cookiePassword = new Cookie("passwordCookie",password);
//			Cookie cookieUserName = new Cookie("usernameCookie", username);
//			cookieUserName.setMaxAge(50);
//			resp.addCookie(cookiePassword);
//			resp.addCookie(cookieUserName);
			PrintWriter pr=resp.getWriter();
			
			HttpSession sesstion=req.getSession();
			System.out.println("this is first servelt deatiles........");
			System.out.println("this is the session Id: "+sesstion.getId());
			
		
			System.out.println("Sesstion Creating Time: "+sesstion.getCreationTime());
			System.out.println("Enumaretion it will goives the enumaretion package: "+sesstion.getAttributeNames());
			System.out.println("maxinactivetimeinterval: "+sesstion.getMaxInactiveInterval());
			
			
			
			String cssTag="<link rel='stylesheet' type='text/css' href='home.css'>";
			resp.setContentType("text/html;charset=UTF-8");
//			PrintWriter pr = resp.getWriter();
			pr.println("<html>");
			pr.println("<head>"
					    +cssTag+
					   "</head>");
		
			pr.println("<body>");
			pr.println("<form action= \"two\" method=\"post\">");
			pr.println("Enter School Name <input type=\"text\" name =\"schoolname\"><br>");
			pr.println("Enter Collage Name <input type=\"text\" name =\"collagename\"><br>");
			pr.println("<input type=\"submit\" value =\"Go\">");
			pr.println("</form>");
			pr.println("</body>");
			pr.println("</html>");

		
		
		
	}

}
