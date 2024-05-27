package com.renuka.project12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		
		
		//load a driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Class Loaded sucessfully........");
				//create the connection
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
				System.out.println(connection);
				System.out.println("connction is sucessfully");
//				String createtableQuery="create table studentdeatiles(sno number(10),name varchar(15),city varchar(15),email varchar(20))";
				String insertingQuery="insert into student02 values(276,'Manoj','bng')";
				String selectQuery= "select*from student02";
				Statement stmt=connection.createStatement();
				boolean executionstatus=stmt.execute(insertingQuery);
				System.out.println("successfully insert tne values.............");
				ResultSet resultSet=stmt.executeQuery(selectQuery);
			
		    while(resultSet.next()){
		    System.out.println("Sno:"+resultSet.getInt(1)+",sName:"+resultSet.getString(2)+",sCity:"+resultSet.getString(3));
		    System.out.println();
		}
				
				connection.close();
			
				

			}

		
		
	}


