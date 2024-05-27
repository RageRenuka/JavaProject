package com.renuka.operations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.renuka.model.Student;
import com.renuka.util.ConnectionUtil;

public class StudentManagement {

public void addStudent(Student student) {
		
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt = connection.createStatement();
			String insertStudentQuery = "insert into Student values (" + student.getsId() + "," +"'"+student.getsName()+ "'," + 
			"'" + student.getsSchool() + "'," + "'" + student.getsClass() + "'," + student.getsMarks() + ")";
			stmt.execute(insertStudentQuery);
			System.out.println("Student record inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Student retriveStudentById(int studentId) {
		Connection connection = ConnectionUtil.getConnection();
		Student dummyStd = new Student();
		try {
			Statement stmt = connection.createStatement();
			String retriveStudent = "select * from Student where studentId =" + studentId;
			ResultSet rs = stmt.executeQuery(retriveStudent);
			
			while(rs.next()) {
				dummyStd.setsId(rs.getInt(1));
				dummyStd.setsName(rs.getString(2));
				dummyStd.setsSchool(rs.getString(3));
				dummyStd.setsClass(rs.getString(4));
				dummyStd.setsMarks(rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dummyStd;
	}
	
	public void deleteStudentById(int studentId) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt = connection.createStatement();
			String deleteStudent = "delete from Student where studentId = " + studentId;
			stmt.execute(deleteStudent);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public List<Student> retriveAllStudent(){
		List<Student> studentList = new ArrayList<Student>();
		Connection connection = ConnectionUtil.getConnection();
	
		try {
			Statement stmt = connection.createStatement();
			String selectAllStudents = "select * from Student";
			ResultSet rs = stmt.executeQuery(selectAllStudents);
			while(rs.next()) {
				Student dummyStudent = new Student();
				dummyStudent.setsId(rs.getInt(1));
				dummyStudent.setsName(rs.getString(2));
				dummyStudent.setsSchool(rs.getString(3));
				dummyStudent.setsClass(rs.getString(4));
				dummyStudent.setsMarks(rs.getDouble(5));
				studentList.add(dummyStudent);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentList;
	}
}
