package com.renuka.comtroller;

import java.io.IOException;
import java.io.PrintWriter;

import com.renuka.dto.Employee;
import com.renuka.service.EmployeeService;
import com.renuka.service.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeRegisterForm extends HttpServlet {
	
	EmployeeService empService=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empId"));
		String empName=req.getParameter("empName");
		String empCity=req.getParameter("empCity");
		int empContact=Integer.parseInt(req.getParameter("empContact"));
		String empMail=req.getParameter("empMail");
		int empAge=Integer.parseInt(req.getParameter("empAge"));
		double empSalary=Double.parseDouble(req.getParameter("empSalarey"));
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpCity(empCity);
		emp.setContct(empContact);
		emp.setEmpMail(empMail);
		emp.setAge(empAge);
		emp.setSalary(empSalary);
		empService.registerEmployeeService(emp);
		PrintWriter pw=resp.getWriter();
		pw.println(empName+ "Employee record is successfully registered");
		
	}

}
