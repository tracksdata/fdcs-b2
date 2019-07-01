package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Fetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Department dept = ses.get(Department.class, 1024);

		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Name: " + dept.getDeptName());

	
		

	}

}
