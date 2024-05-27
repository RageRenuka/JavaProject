package com.renuka.studentops;

import java.util.List;
import java.util.Scanner;

import com.renuka.model.Student;
import com.renuka.operations.StudentManagement;

public class StudentOps {
	public static void main(String[] args) {

		System.out.println("Select the operation you want to perform ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. add student");
		System.out.println("2.select one student by id");
		System.out.println("3.delete one student by id ");
		System.out.println("4.retrive all students from the database");
		int choice = sc.nextInt();
		StudentManagement obj = new StudentManagement();
		switch(choice) {
		case 1 : System.out.println("You want to insert a student Please enter student details. ");
		               Student std = new Student();
		               System.out.println("Enter student id");
		               std.setsId(sc.nextInt());
		               System.out.println("Enter student name");
		               std.setsName(sc.next());
		               System.out.println("Enter student school");
		               std.setsSchool(sc.next());
		               System.out.println("Enter student class");
		               std.setsClass(sc.next());
		               System.out.println("Enter student marks");
		               std.setsMarks(sc.nextDouble());
		         obj.addStudent(std);  
		         break;
		case 2 : System.out.println("Enter the student number you want to retrive");
		         int sid = sc.nextInt();
		         obj.retriveStudentById(sid);
		         break;
		case 3 : System.out.println("You want to delete a student, Please enter the student id ");
		         int sid1 = sc.nextInt();
		         obj.deleteStudentById(sid1);
		         break;
		case 4 : System.out.println("select all student "); 
		       List<Student> stdList = obj.retriveAllStudent();
		       for(Student std1 : stdList) 
		    	   System.out.println(std1);
		       break;
		  default   : System.out.println("no such choice");
		       }
		}

	}





