package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class SingleColumnFetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		String q1 = "select e.empName from Employee e";

		Query<Object> qry = ses.createQuery(q1);

		List<Object> values = qry.list();

		for (Object value : values) {
			System.out.println(value);
		}

	}

}
