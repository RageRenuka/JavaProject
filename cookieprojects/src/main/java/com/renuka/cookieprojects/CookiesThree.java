package com.renuka.cookieprojects;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookiesThree  extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String school = req.getParameter("schoolname");
		String collage = req.getParameter("collagename");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pr = resp.getWriter();
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title> All details  </title>");
		pr.println("</head>");
		pr.println("<body>");
		Cookie[] cookies = req.getCookies();
		pr.println(" Name <p>" + cookies[0].getValue() + "</p>"  );
		pr.println(" Contact <p>" + cookies[1].getValue() + "</p>"  );
		pr.println(" City <p>" + cookies[2].getValue() + "</p>"  );
		pr.println(" Date&time <p>" + cookies[3].getValue() + "</p>"  );
		pr.println(" school <p>" + school + "</p>"  );
		pr.println(" collage <p>" + collage + "</p>"  );
		pr.println("</body>");
		pr.println("</html>");

	}

}
