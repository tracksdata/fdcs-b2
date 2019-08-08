package com.iti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.dao.AddressDao;
import com.iti.dao.AdmissionDao;
import com.iti.dao.StudentDao;
import com.iti.dao.TimeDao;
import com.iti.entity.Student;

@Service
public class AdmissionServiceImpl implements AdmissionService {
	
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private AdmissionDao admissionDao;
	@Autowired
	private TimeDao timeDao;
	@Autowired
	private AddressDao addressDao;
	
	@Override
	public void admitStudent(Student student) {
		
		studentDao.save(student);
		
	}
	@Override
	public List<Student> listStudents(){
		return studentDao.findAll();
	}
	
	public List<Student> findStudentByName(String name){
		return studentDao.findStudentByStudentName(name);
	}
	
	public List<Student> findStudentByItiCode(String itiCode){
		return studentDao.findStudentByStudentName(itiCode);
	}
	
	public Student findStudent(int id) {
		
		return studentDao.findById(id).orElse(null);
	}
	
	

}
