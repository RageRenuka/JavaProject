package com.renuka.dao;

import java.util.List;

import com.renuka.dto.Student;

public interface StudentDao {
	public void registerStudentDao(Student student);
	public Student selectStudentByIdDao(int stdId);
	public List<Student> selectAllStudentDao();
	public void deleteAstudentByIdDao(int stdId);
	public Student updateStudent(Student student);

}
