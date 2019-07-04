package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class WhereParameters {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		String q1 = "from Employee e where e.empName like :ename";

		Query<Employee> qry = ses.createQuery(q1);

	   qry.setParameter("ename", "%a%");
		
		List<Employee> emps = qry.list();

		for (Employee emp : emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-------------------");
		}

		

	}

}
