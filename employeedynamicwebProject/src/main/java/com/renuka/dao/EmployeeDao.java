package com.renuka.dao;

import java.util.List;

import com.renuka.dto.Employee;

public interface EmployeeDao {
	public void registerEmployeeDao(Employee employee);
	public Employee selectEmployeeByIdDao(int empId);
	public List<Employee> selectAllEmployeeDao();
	public Void deleteAEmployeeByIdDao(int EmpId);
	public Employee updateEmployee(Employee Employee);

}
