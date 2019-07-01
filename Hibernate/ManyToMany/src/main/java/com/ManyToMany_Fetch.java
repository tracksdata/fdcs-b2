package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Course;
import com.cts.employee.entity.Student;

public class ManyToMany_Fetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

	
		Course c=ses.get(Course.class, 104);
		System.out.println(c.getCourseId());
		System.out.println(c.getCourseName());
		System.out.println(c.getCourseFee());
		
		c.getStudents().forEach(student->{
			System.out.println(student.getStudentId());
			System.out.println(student.getStudentName());
			System.out.println("---------------------------");
		});
		
		

		System.out.println(" --- Done ---");

	}

}
