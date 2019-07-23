package com.cts.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entities.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sf;

	public void debit(long accountNumber, double amount) {

		Session ses = sf.getCurrentSession();
		Account acc = ses.get(Account.class, accountNumber);

		if (acc.getBalance() >= amount) {
			acc.setBalance(acc.getBalance() - amount);
			ses.update(acc);
		} else {
			System.out.println("Insuffient Balance");
		}

	}

	public void credit(long accountNumber, double amount) {
		Session ses = sf.getCurrentSession();
		Account acc = ses.get(Account.class, accountNumber);
		acc.setBalance(acc.getBalance() + amount);
		ses.update(acc);
	}

	public void fundsTransfer(long toAccount, double amount) {
		Session ses = sf.getCurrentSession();
		Account acc = ses.get(Account.class, toAccount);
		acc.setBalance(acc.getBalance() + amount);
		ses.update(acc);

	}

}
