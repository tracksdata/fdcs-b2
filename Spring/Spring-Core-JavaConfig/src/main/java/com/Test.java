package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.employee.config.AppConfg;
import com.cts.employee.dao.EmployeeDaoImpl;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfg.class);
		EmployeeDaoImpl empDao = ac.getBean(EmployeeDaoImpl.class);
		empDao.saveEmployee();
		ac.registerShutdownHook();
		ac.close();

	}

}
