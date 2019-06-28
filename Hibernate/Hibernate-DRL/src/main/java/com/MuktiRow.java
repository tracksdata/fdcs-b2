package com;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;

import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Employee;
/*
 * 
 * 	Fetching Operations
 * -----------------------
 * 	1. Single Row
 * 	2. Multi Row 
 * 
 *  
 *  1. Single Row
 *  ---------------
 *  	-> eager fetching
 *  		-> get() method
 *  
 *  	-> lazy fetching
 *  		-> load() method
 *  
 *  2. Multi Row 
 *  ------------
 *  -> HQL
 *  -> Criteria API
 *  -> Native SQL
 * 
 * 
 */

public class MuktiRow {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		MultiIdentifierLoadAccess<Employee> multi = ses.byMultipleIds(Employee.class);

		List<Employee> emps = multi.multiLoad(10, 12, 13);

		/*
		for (Employee emp : emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("--------------------");
		}
		
		*/
		
		/*
		emps.forEach(emp->{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("--------------------");
		});
		*/
		
		
	//	emps.stream().map(emp->emp.getEmpName()+" is earning "+emp.getSalary()+" salary").forEach(System.out::println);
	
		
		
		
		
		
	
		
		
		
		
		
		
		
		

		System.out.println("--- Done ---");

	}

}
