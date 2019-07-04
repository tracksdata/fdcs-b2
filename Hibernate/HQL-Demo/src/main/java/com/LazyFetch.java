package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class LazyFetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		String q1 = "from Employee e where e.empId>=13 ";

		Query<Employee> qry = ses.createQuery(q1);

		Iterator<Employee> it = qry.iterate();

		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-------------------");
		}

	}

}
