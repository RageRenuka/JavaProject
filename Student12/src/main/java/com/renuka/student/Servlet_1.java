package com.renuka.student;



import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_1 extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Class Loaded sucessfully........");
		//create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
		System.out.println(connection);
		System.out.println("connction is sucessfully");
//		String createtableQuery="create table studentdeatiles(sno number(10),name varchar(15),city varchar(15),email varchar(20))";
		
		String selectQuery= "select*from student02";

	
		System.out.println("successfully insert tne values.............");
	
	
    while(resultSet.next()){
    System.out.println("Sno:"+resultSet.getInt(1)+",sName:"+resultSet.getString(2)+",sCity:"+resultSet.getString(3));
    System.out.println();
}
		
		connection.close();
	
		

	}

		
	


}


