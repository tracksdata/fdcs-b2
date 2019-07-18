package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accDao;

	@Transactional
	public void transferFunds(long fromAccount, long toAccount, double amount) {

		accDao.debit(fromAccount, amount);
		accDao.fundsTransfer(toAccount, amount);

	}

}
