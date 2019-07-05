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

public class MultiColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<Employee> empRoot = criteriaQuery.from(Employee.class);

		criteriaQuery.multiselect(empRoot.get("empId"), empRoot.get("empName"));
		
		Query<Object[]> rows = ses.createQuery(criteriaQuery);

		for (Object[] columns : rows.list()) {

			for (Object column : columns) {
				System.out.println(column);
			}

			System.out.println("--------------------------");
		}

	}

}
