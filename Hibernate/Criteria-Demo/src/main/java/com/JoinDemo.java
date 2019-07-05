package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.config.HibernateUtil;
import com.cts.entity.Department;
import com.cts.entity.Employee;

public class JoinDemo {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<Employee> empRoot = criteriaQuery.from(Employee.class);
		Root<Department> deptRoot = criteriaQuery.from(Department.class);
		
		criteriaQuery.multiselect(empRoot,deptRoot);
		
		criteriaQuery.where(criteriaBuilder.equal(empRoot.get("deptObj"), deptRoot.get("deptId")));
	
		
		
		Query<Object[]> qry = ses.createQuery(criteriaQuery);

		
		for(Object[] columns:qry.list()) {
			
			for(Object col:columns) {
				if(col instanceof Department) {
					Department dept=(Department) col;
					System.out.println(dept.getDeptId());
					System.out.println(dept.getDeptName());
				}
				
				if(col instanceof Employee) {
					Employee emp=(Employee) col;
					System.out.println(emp.getEmpId());
					System.out.println(emp.getEmpName());
					System.out.println(emp.getSalary());
				}
				
			}
			System.out.println("-------------");
		}
		
		
	/*
		for (Employee emp : qry.list()) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("----------------------------------");
		}
		
	*/	

	}

}
