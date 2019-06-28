package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setEmpName("James");
		emp.setSalary(3487384);

		Department dept = new Department();
		dept.setDeptId(10);
		dept.setDeptName("HR");
		dept.setLoc("Mumbai");

		emp.setDept(dept);

		ses.save(emp);
		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
