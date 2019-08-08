package com.iti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iti.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	public List<Student> findStudentByStudentName(String name);
	public List<Student> findStudentByItiCode(String itiCode);
	
	
	
	

}
