package com.renuka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionInternallyCurd {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Class Loaded sucessfully........");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
		System.out.println("connction is sucessfully");
		String creatTable="create table employee(sno number(10),name varchar(20),city varchar(15))";
		String insertQuery="insert into employee values(1009,'Vishnu','Hydrabad')";
//		String updateQuery="update employee set sno=1133 where name='Mansi'";
		String deletQuery="delete from employee where  sno=1133";
		String selectQuery="select*from employee";
		Statement stmt=connection.createStatement();
		boolean executionstatus=stmt.execute(deletQuery);
		ResultSet resultSet=stmt.executeQuery(selectQuery);
		while(resultSet.next()){
		    System.out.println("Sno:"+resultSet.getInt(1)+",Name:"+resultSet.getString(2)+",City:"+resultSet.getString(3));
		}
		
		
		

	}

}
