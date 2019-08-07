package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.EmployeeDao;
import com.cts.product.entities.Employee;

@RestController
@CrossOrigin
@RequestMapping("api/employees")
public class EmployeeRestController {

	@Autowired
	private EmployeeDao empDao;

	@GetMapping
	public ResponseEntity<List<Employee>> listAll() {
		return ResponseEntity.ok(empDao.findAll());
	}

	@PostMapping
	public ResponseEntity<Employee> saveEmpployee(@RequestBody Employee emp) {

		return ResponseEntity.ok(empDao.save(emp));
	}

}
