package com.renuka.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection(){
		Connection connection = null;
		try {
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "renuka");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
		
	}

}
