package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class DeleteTest {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = new Employee();
		
		emp.setEmpId(11);
		emp.setEmpName("James");
		emp.setSalary(15000);

		ses.merge(emp);
		

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
