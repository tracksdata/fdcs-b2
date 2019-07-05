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

public class SumCount {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);

		Root<Employee> empRoot = criteriaQuery.from(Employee.class);

		criteriaQuery.select(criteriaBuilder.sum(empRoot.get("salary")));

		Query<Double> qry = ses.createQuery(criteriaQuery);

		double sum = qry.getSingleResult();

		System.out.println("Count: " + sum);

	}

}
