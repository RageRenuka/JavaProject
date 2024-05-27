package com.renuka.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DataBaseConnectionExternallyProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		InputStream ios = new FileInputStream(new File("C:\\Users\\user\\databaseproperties.properties"));
		Properties properties = new Properties();
		properties.load(ios);
		Class.forName(properties.getProperty("db.driver.class"));
		Connection connection=DriverManager.getConnection(properties.getProperty("db.connection.url"),properties.getProperty("db.username"),properties.getProperty("db.password"));
		System.out.println("Connected Succesfully");
	String creatingTable="create table student1(sno number(10),sname varchar(20))";
//	String modifyQuery="alter table student1 drop email";
		String insertQuery="insert into student1 values(1001,'Lall iy')";
		String selectQuery="select*from student1";
		Statement stmt=connection.createStatement();
		boolean executeStatus=stmt.execute(insertQuery);
		ResultSet resultSet=stmt.executeQuery(selectQuery);
		System.out.println(resultSet);
		while (resultSet.next()) {
			System.out.println("Sno:"+resultSet.getInt(1)+",Name:"+resultSet.getString(2));
			System.out.println();
		}
		System.out.println(resultSet);
		connection.close();

		

	}

}
