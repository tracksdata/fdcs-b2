package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(4586384);

		emp.setDeptId(1000);
		emp.setDeptName("HR");
		emp.setLoc("Kolkata");

		emp.setProjId(1024);
		emp.setProjName("FDCS");

		ses.save(emp);
		tx.commit();

		System.out.println("--- Done ---");

	}

}
