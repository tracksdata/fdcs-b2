package com.iti.service;

import java.util.List;

import com.iti.entity.Student;

public interface AdmissionService {
	public void admitStudent(Student student);
	public List<Student> listStudents();
	public Student findStudent(int id) ;
	public List<Student> findStudentByItiCode(String itiCode);
	public List<Student> findStudentByName(String name);

	
}