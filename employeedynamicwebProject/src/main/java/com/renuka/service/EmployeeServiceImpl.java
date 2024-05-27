package com.renuka.service;

import java.util.List;

import com.renuka.dao.EmployeeDao;
import com.renuka.dao.EmployeeDaoImpl;
import com.renuka.dto.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao=new EmployeeDaoImpl();
	@Override
	public void registerEmployeeService(Employee employee) {
		employeeDao.registerEmployeeDao(employee);
		
	}

	@Override
	public Employee selectEmployeeByIdService(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectAllEmployeeService() {
		List <Employee> employeeList=employeeDao.selectAllEmployeeDao();
		  return employeeList;
	}

	@Override
	public Void deleteAEmployeeByIdService(int EmpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
