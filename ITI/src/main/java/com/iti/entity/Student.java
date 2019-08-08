package com.iti.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Student {
	@Id
	private int admissionId;
	private String itiCode;
	private int tradeId;
	private int academicYear;
	@Column(length = 20)
	private String studentName;
	@Column(length = 20)
	private String fatherName;
	@Column(length = 20)
	private String motherName;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(length = 15)
	private String sscStatus;
	private double gpa;
	private int sscMarks;
	private int yearofpass;
	@Column(length = 5)
	private String caste;
	@Column(length = 5)
	private String subcaste;
	private String[] enclosedCertifecates;
	@Column(length = 20)
	private String rationcardNumber;
	@Column(length = 20)
	private long adhaarcardNumber;
	@Temporal(TemporalType.DATE)
	private Date admissionDate;
	@Transient
	private int meritNo;
	private long hallticketNumber;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "admission_id")
	private Admission admission;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private Address address;
	

	public long getHallticketNumber() {
		return hallticketNumber;
	}

	public void setHallticketNumber(long hallticketNumber) {
		this.hallticketNumber = hallticketNumber;
	}

	public String getSscStatus() {
		return sscStatus;
	}

	public void setSscStatus(String sscStatus) {
		this.sscStatus = sscStatus;
	}

	public int getSscMarks() {
		return sscMarks;
	}

	public void setSscMarks(int sscMarks) {
		this.sscMarks = sscMarks;
	}

	public int getMeritNo() {
		return meritNo;
	}

	public void setMeritNo(int meritNo) {
		this.meritNo = meritNo;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getYearofpass() {
		return yearofpass;
	}

	public void setYearofpass(int yearofpass) {
		this.yearofpass = yearofpass;
	}

	public String getSubcaste() {
		return subcaste;
	}

	public void setSubcaste(String subcaste) {
		this.subcaste = subcaste;
	}

	public String getRationcardNumber() {
		return rationcardNumber;
	}

	public void setRationcardNumber(String rationcardNumber) {
		this.rationcardNumber = rationcardNumber;
	}

	public long getAdhaarcardNumber() {
		return adhaarcardNumber;
	}

	public void setAdhaarcardNumber(long adhaarcardNumber) {
		this.adhaarcardNumber = adhaarcardNumber;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public int getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}

	public String getItiCode() {
		return itiCode;
	}

	public void setItiCode(String itiCode) {
		this.itiCode = itiCode;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public double getGpa() {
		return gpa;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String[] getEnclosedCertifecates() {
		return enclosedCertifecates;
	}

	public void setEnclosedCertifecates(String[] enclosedCertifecates) {
		this.enclosedCertifecates = enclosedCertifecates;
	}

	


}
