package com;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class WhereClause2 {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		String q1 = "from Employee e where e.empName like '%s%'";

		TypedQuery<Employee> qry = ses.createQuery(q1,Employee.class);
		
		CriteriaBuilder  cu=ses.getCriteriaBuilder();
	
		CriteriaQuery<Employee> eee=cu.createQuery(Employee.class)
				
		Root<Employee> root=eee.from(Employee.class);
		eee.select(root);
		
		TypedQuery<Employee> qq1= ses.createQuery(eee);
		
		
		
		

		List<Employee> emps = qq1.getResultList();

		for (Employee emp : emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-------------------");
		}

		

	}

}
