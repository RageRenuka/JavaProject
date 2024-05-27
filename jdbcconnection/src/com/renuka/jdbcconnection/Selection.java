package com.renuka.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Selection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
			String insertingQuery="insert into employedeatiles1(1001,'Mounika',876543210,'mouni@gmail.com')";
			//String creating=" create table employedeatiles1(empno number(10),empname varchar(15),contact number(14),email varchar(17))";
			Statement stmt=connection.createStatement();
			stmt.executeQuery(insertingQuery);
			System.out.println("successfully insert tne values.............");
	
	}

}
