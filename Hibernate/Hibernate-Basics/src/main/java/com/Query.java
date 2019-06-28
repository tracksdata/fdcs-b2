package com;

import java.util.List;
import java.util.stream.Stream;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Query {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();
		
		MultiIdentifierLoadAccess<Employee> multi=ses.byMultipleIds(Employee.class);
		
		List<Employee> emps=  multi.multiLoad(10,12,13);
		
		emps.forEach(emp->{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------------");
		});
		

		
	/*
		Stream<Employee> emps=	ses.createQuery("select e from Employee e",Employee.class).getResultList().stream();
	List<Employee> ee=ses.createQuery("from Employee").getResultList();
		
	//System.out.println(emps.count());
		
	emps.forEach(emp->{
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println("-----------------------");
	});
	
	System.out.println("=========================");
	
	ee.forEach(emp->{
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println("-----------------------");
	});
	*/
	
	}
	
	

}
