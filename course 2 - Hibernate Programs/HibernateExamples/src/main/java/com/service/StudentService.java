package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao sd = new StudentDao();
	
	public String storeStudent(Student student) {
		if(sd.storeStudent(student)>0) {
			return "Student record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	public List<Student> findAllStudents() {
		return sd.findAllStudents();
	}
}
