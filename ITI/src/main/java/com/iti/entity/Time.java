package com.iti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Time {
	
	@Id
	private int admissionId;
	@OneToOne
	@JoinColumn(name="admission_id")
	private Admission admission;
	private int tradeId;
	private int yearId;
	private String itiCode;
	
	
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public int getTradeId() {
		return tradeId;
	}
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}
	public int getYearId() {
		return yearId;
	}
	public void setYearId(int yearId) {
		this.yearId = yearId;
	}
	public String getItiCode() {
		return itiCode;
	}
	public void setItiCode(String itiCode) {
		this.itiCode = itiCode;
	}
	
	
	
	

}
