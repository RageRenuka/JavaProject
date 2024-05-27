package com.renuka.service;

import java.util.List;

import com.renuka.dao.StudentDao;
import com.renuka.dao.StudentDaoImpl;
import com.renuka.dto.Student;

public class StudentServiceImpl implements StudentService {
   
	StudentDao studentDao=new StudentDaoImpl();
	@Override
	public void registerStudentService(Student student) {
		studentDao.registerStudentDao(student);
		
	}

	@Override
	public Student selectStudentByIdService(int stdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudentService() {

		List <Student> studentList=studentDao.selectAllStudentDao();
		  return studentList;
	}

	@Override
	public void deleteAstudentByIdService(int stdId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
