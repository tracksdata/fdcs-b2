package com;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class WhereClause {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		String q1 = "from Employee e where e.salary>=100000";

		TypedQuery<Employee> qry = ses.createQuery(q1,Employee.class);

		List<Employee> emps = qry.getResultList();

		for (Employee emp : emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-------------------");
		}

		

	}

}
