package com.tap.service;

import java.util.List;

import com.tap.entity.Student;

// we use dependancy injection that is provide injection and also 
//loose couple
//on the dependacy we use interface and create a class to implements
//interface
public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
