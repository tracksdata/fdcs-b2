package com.cts.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "myKey", strategy = "com.cts.employee.entity.MyCustomKey")
@DynamicUpdate
public class Employee {

	@Id
	@GeneratedValue(generator = "myKey")
	private String emp_Id;
	private String empName;
	private double salary;

	@Version
	private long versionNo;

	public long getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(long versionNo) {
		this.versionNo = versionNo;
	}

	public String getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
