package com.cts.employee.entity;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustomKey implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String key = "ABC10";

		long st = System.currentTimeMillis();
		key = key + st;

		return key;
	}

}
