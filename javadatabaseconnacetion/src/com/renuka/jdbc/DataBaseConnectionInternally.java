package com.renuka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectionInternally {

	public static void main(String[] args) throws ClassNotFoundException, SQLException	{
//		
		//load a driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Class Loaded sucessfully........");
		//create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
		System.out.println(connection);
		System.out.println("connction is sucessfully");
//		String createtableQuery="create table studentdeatiles(sno number(10),name varchar(15),city varchar(15),email varchar(20))";
		String insertingQuery="insert into studentdeatiles values(276,'Manoj','bng','ashok@gmail.com')";
		String selectQuery= "select*from studentdeatiles";
		Statement stmt=connection.createStatement();
		boolean executionstatus=stmt.execute(insertingQuery);
		System.out.println("successfully insert tne values.............");
		ResultSet resultSet=stmt.executeQuery(selectQuery);
	
    while(resultSet.next()){
    System.out.println("Sno:"+resultSet.getInt(1)+",Name:"+resultSet.getString(2)+",City:"+resultSet.getString(3)+",Email:"+resultSet.getString(4));
    System.out.println();
}
		
		connection.close();
	
		

	}

}
