package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class AggregateDemo {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);

		Root<Employee> empRoot = criteriaQuery.from(Employee.class);

		criteriaQuery.select(criteriaBuilder.count(empRoot));

		Query<Long> qry = ses.createQuery(criteriaQuery);

		long count = qry.getSingleResult();

		System.out.println("Count: " + count);
		
		

	}

}
