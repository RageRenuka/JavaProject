package com.renuka.jdbc;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnectionExteranlly {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		InputStream ios = new FileInputStream(new File("C:\\Users\\user\\databaseproperties.properties"));
		Properties properties = new Properties();
		properties.load(ios);
		Class.forName(properties.getProperty("databaseDriver"));
		System.out.println("Successfully loaded");
		Connection connect = DriverManager.getConnection(properties.getProperty("databaseUrl"),
				properties.getProperty("databaseUser"), properties.getProperty("databasePassword"));
		System.out.println(connect);
		System.out.println("Connected Succesfully");
		String selectQuery = "select * from studentdeatiles";
		Statement st = connect.createStatement();
		ResultSet resultSet= st.executeQuery(selectQuery);
		while (resultSet.next()) {
			System.out.println("Sno:"+resultSet.getInt(1)+",Name:"+resultSet.getString(2)+",City:"+resultSet.getString(3)+",Email:"+resultSet.getString(4));
			System.out.println();
		}
		System.out.println(resultSet);
		connect.close();
	}

}
