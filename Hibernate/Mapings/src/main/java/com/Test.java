package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Account;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

/*
 * 1. One to One
 * 2. One to Many (Collections)
 * 3. Many to One
 * 4. Many to Many (Collections)
 * 
 */
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

		Account acc = new Account();
		acc.setAccountNo(348738474);
		acc.setAccountName("David");

		emp.setDept(dept);

		dept.setAcc(acc);

		ses.save(emp);
		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
