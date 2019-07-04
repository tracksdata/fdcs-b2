package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class SaveTest {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = new Employee();
		emp.setEmpId(15);
		emp.setEmpName("Ritam");
		emp.setSalary(237527);

		

		ses.save(emp);
	

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
