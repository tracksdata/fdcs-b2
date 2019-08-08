package com.iti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iti.entity.Address;
import com.iti.entity.Admission;
import com.iti.entity.ContactNumber;
import com.iti.entity.Student;
import com.iti.entity.Time;
import com.iti.service.AdmissionService;

@RestController
@RequestMapping("api/iti")
@CrossOrigin
public class AdmissionControler {

	@Autowired
	private AdmissionService admissionService;

	@PostMapping
	public void registerStudent(@RequestBody Student student) {

		//
		// Address address = new Address();
		// Time time = new Time();
		// ContactNumber contactNumber = new ContactNumber();

//		address.setContactno(contactNumber);
//		student.setAddress(address);
//		time.setAdmission(admission);
//		admission.setStudent(student);
//		student.setAdmission(admission);

		Admission admission = new Admission();
		admission.setAdmissionId(student.getAdmissionId());
		admission.setTradeId(student.getTradeId());
		admission.setYearId(student.getAcademicYear());
		student.setAdmission(admission);

		admissionService.admitStudent(student);

	}

	@GetMapping("/{id}")
	public Student findStudent(@PathVariable("id") int id) {

		return admissionService.findStudent(id);
	}

	@GetMapping
	public List<Student> listAll() {

		return admissionService.listStudents();
	}

	public Student findById(String itiCode) {
		return null;
	}

	public Student findByAdmissionId(int id) {
		return null;
	}

	public Student findByItiCode(String id) {
		return null;
	}

	@GetMapping("name/{name}")
	public List<Student> findStudentsByName(@PathVariable("name") String name) {
		return admissionService.findStudentByName(name);
	}

	public List<Student> findStudentsByAdmissionId(String admissionId) {
		return null;
	}

	@GetMapping("itiCode/{itiCode}")
	public List<Student> findStudentsByItiCode(@PathVariable("itiCode") String itiCode) {
		return admissionService.findStudentByItiCode(itiCode);
	}

	public List<Student> findStudentsByTrade(String itiCode) {
		return null;
	}

	public void updateStudent() {

	}

	public void deleteStudent() {

	}

	public void addItiCode() {

	}

	public void generateReports() {

	}

}
