package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class MultiColumnFetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		String q1 = "select e.empId,e.salary,e.empName from Employee e";

		Query<Object[]> qry = ses.createQuery(q1);

		List<Object[]> rows = qry.list();

		for (Object[] row : rows) {

			for (Object column : row) {
				System.out.println(column);
			}
			System.out.println("------------------");

		}

	}

}
