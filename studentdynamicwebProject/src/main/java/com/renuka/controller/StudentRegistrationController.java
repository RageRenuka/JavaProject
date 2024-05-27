package com.renuka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.renuka.dto.Student;
import com.renuka.service.StudentService;
import com.renuka.service.StudentServiceImpl;


@WebServlet("/StudentRegistrationController")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentService studentService=new StudentServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int stdId=Integer.parseInt(request.getParameter("stdid"));
		String stdName=request.getParameter("stdname");
		String stdClass=request.getParameter("stdclass");
		double stdpercentage=Double.parseDouble(request.getParameter("stdpercentage"));
		String stdSchool=request.getParameter("stdschool");
		Student std=new Student();
		std.setStdId(stdId);
		std.setStdName(stdName);
		std.setStdClass(stdClass);
		std.setStdpercentage(stdpercentage);
		std.setStdSchool(stdSchool);
		studentService.registerStudentService(std);
	    PrintWriter pw=response.getWriter();
	    pw.println(stdName+"student record is successfully registered");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cssTag="<link rel='stylesheet' type='text/css' href='home.css'>";
	List<Student> studentList=studentService.selectAllStudentService();
	PrintWriter pw=	resp.getWriter();
	resp.setContentType("text/html;charset=UTF-8");
	pw.println("<html>");
	  pw.println("<head>"
			    +cssTag+
			   "</head>");
	pw.println("<body>");
	pw.println("<table border='1' width=50% cellpadding=10px  cellspace=20px class="+"tables"+">");
	pw.println("<tr>");
	pw.println("<th>"+"StudentId"+"</th>");
	pw.println("<th>"+"StudentName"+"</th>");
	pw.println("<th>"+"StudentClass"+"</th>");
	pw.println("<th>"+"StudentPercentage"+"</th>");
	pw.println("<th>"+"StudentSchool"+"</th>");
	pw.println("</tr>");
		
		for(Student student:studentList)
		{
			pw.println("<tr>");
			pw.println("<th>"+student.getStdId()+"</th>");
			pw.println("<th>"+student.getStdName()+"</th>");
			pw.println("<th>"+student.getStdClass()+"</th>");
			pw.println("<th>"+student.getStdpercentage()+"</th>");
			pw.println("<th>"+student.getStdSchool()+"</th>");
			pw.println("</tr>");
		}
		pw.println("<table>");
		pw.println("</body>");
		
		pw.println("</html>");
	}

}
