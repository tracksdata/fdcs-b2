package com.iti.entity;

import java.io.Serializable;

public class MyArrayString implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] enclosedCertifecates;
	
	public MyArrayString() {
		// TODO Auto-generated constructor stub
	}

	public String[] getEnclosedCertifecates() {
		return enclosedCertifecates;
	}

	public void setEnclosedCertifecates(String[] enclosedCertifecates) {
		this.enclosedCertifecates = enclosedCertifecates;
	}
	
	

}
