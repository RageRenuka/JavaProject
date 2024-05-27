package com.renuka.service;

import java.util.List;

import com.renuka.dto.Employee;

public interface EmployeeService {
	public void registerEmployeeService(Employee employee);
	public Employee selectEmployeeByIdService(int empId);
	public List<Employee> selectAllEmployeeService();
	public Void deleteAEmployeeByIdService(int EmpId);
	public Employee updateEmployee(Employee Employee);
	

}
