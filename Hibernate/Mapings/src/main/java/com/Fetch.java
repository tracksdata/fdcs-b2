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
public class Fetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = ses.get(Employee.class, 100);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		System.out.println(emp.getDept().getDeptId());

		System.out.println(emp.getDept().getDeptName());
		System.out.println(emp.getDept().getLoc());

		System.out.println(emp.getDept().getAcc().getAccountNo());
		System.out.println(emp.getDept().getAcc().getAccountName());

	}

}
