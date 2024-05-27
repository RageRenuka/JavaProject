package com.renuka.createtable;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.renuka.util.ConnectionUtil;

public class CreateStudentTable {

	public static void main(String[] args) {
		
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			String createTable = "create table Student(sid number, sname varchar(20), sschool varchar(20), sclass varchar(20),smarks number)";
			System.out.println(createTable);
stmt.execute(createTable);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
