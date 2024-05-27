package com.renuka.batchprocessingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchInJdbc {
 public  int sno;
 public  String name;
 public  String cource;
 public  int fee;
 public  int marks;
public static void main(String[] args) {

	
	Connection connect=null;
	try {
		connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "renuka");
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	
  try {
	Statement stmt=connect.createStatement();
	stmt.addBatch("insert into BatchInJdbc values(12,'RenukaRage','Java',1500,90)");
	
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	System.out.println("insert values succesfully");

}

}
