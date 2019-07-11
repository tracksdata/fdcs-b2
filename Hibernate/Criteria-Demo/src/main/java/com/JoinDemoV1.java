package com;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class JoinDemoV1 {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

		Root<Employee> deptRoot = criteriaQuery.from(Employee.class);

		criteriaQuery.select(deptRoot);

		Query<Employee> qry = ses.createQuery(criteriaQuery);

		for (Employee emp : qry.list()) {

			System.out.println(emp.getDeptObj().getDeptId());
			System.out.println(emp.getDeptObj().getDeptName());
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());

			System.out.println("----------------------------------");
		}

	}

}
