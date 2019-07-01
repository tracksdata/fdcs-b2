package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

//ABC20220190701001
public class UpdateTest {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = ses.get(Employee.class, "ABC101561984690011");
				//new Employee();

		emp.setEmpName("Praveen S");
		emp.setSalary(348738473);

		ses.update(emp);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
