package com.renuka.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String school = req.getParameter("schoolname");
		String collage = req.getParameter("collagename");
		PrintWriter pr=resp.getWriter();
		HttpSession sesstion2=req.getSession(true);
		System.out.println("this is second servelt deatiles........");
		System.out.println("it gives you sesstion last access time: "+sesstion2.getLastAccessedTime());
		System.out.println("it gives you sesstion creating time: "+sesstion2.getCreationTime());
		System.out.println("it gives you server tostring object: "+sesstion2.getServletContext());
		System.out.println(sesstion2.isNew());
		//pr.println(req.getParameter("sesstion.setAttribute(getServletName(), sesstion)"));
		
		
		
		
		
		resp.setContentType("text/html;charset=UTF-8");
//		PrintWriter pr = resp.getWriter();
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title> All details  </title>");
		pr.println("</head>");
		pr.println("<body>");
//		Cookie[] cookies = req.getCookies();
//		pr.println(" UserName <p>" + cookies[1].getValue() + "</p>"  );
//		pr.println(" Password <p>" + cookies[0].getValue() + "</p>"  );
		pr.println(" school <p>" + school + "</p>"  );
		pr.println(" collage <p>" + collage + "</p>"  );
		pr.println("</body>");
		pr.println("</html>");

	}
}
