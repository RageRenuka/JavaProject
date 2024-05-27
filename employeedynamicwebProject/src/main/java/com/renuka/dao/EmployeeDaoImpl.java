package com.renuka.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.renuka.dto.Employee;
import com.renuka.util.ConnectionUtil;


public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void registerEmployeeDao(Employee employee) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt= connection.createStatement();
			String creatingEmployeeQuery="insert into EmployeeTable values("
					+employee.getEmpId()+","
					+"'"+employee.getEmpName()+"'"
					+"'"+employee.getEmpCity()+"'"
					+"'"+employee.getContct()+"'"
					+"'"+employee.getEmpMail()+"'"
					+"'"+employee.getAge()+","
					+","+employee.getSalary()+")" ;
			stmt.execute(creatingEmployeeQuery);
			ConnectionUtil.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
	    
		
	}

	@Override
	public Employee selectEmployeeByIdDao(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectAllEmployeeDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void deleteAEmployeeByIdDao(int EmpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
