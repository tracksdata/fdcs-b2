package com;

public class Bank implements Customer, Manager, Cleark {

	@Override
	public void withDraw() {
		System.out.println("-- Withdrawing");

	}

	@Override
	public void deposit() {
		System.out.println("-- depositing");

	}

	@Override
	public void openAccount() {
		System.out.println("-- Opening accoiunt");

	}

	@Override
	public void closeAccount() {
		System.out.println("--closing account");

	}

	@Override
	public void clearkOperations() {
		System.out.println("-- Clearkal Operations");

	}

}
