package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee e1 = new Employee(10, "Praveem", 37463744);
		Employee e2 = new Employee(11, "James", 4584785);
		Employee e3 = new Employee(12, "Ruth", 94754975);
		Employee e4 = new Employee(13, "Ella", 3645747);
		Employee e5 = new Employee(14, "Goedic", 345566);
		Employee e6 = new Employee(15, "Wall", 45040588);

		Department dept = new Department();
		dept.setDeptId(1024);
		dept.setDeptName("HR");
		dept.setLoc("Mumbai");

		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);

		ses.save(dept);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
