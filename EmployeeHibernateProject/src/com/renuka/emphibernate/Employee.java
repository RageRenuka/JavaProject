package com.renuka.emphibernate;


public class Employee {
	private int empid;
	private String empName;
	private double empsalarey;
	private String empEmail;
	private String empCity;
	private long empContact;
	private int empPincode;
	public Employee(int empid, String empName, double empsalarey, String empEmail, String empCity, long empContact,
			int empPincode) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsalarey = empsalarey;
		this.empEmail = empEmail;
		this.empCity = empCity;
		this.empContact = empContact;
		this.empPincode = empPincode;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpsalarey() {
		return empsalarey;
	}
	public void setEmpsalarey(double empsalarey) {
		this.empsalarey = empsalarey;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public long getEmpContact() {
		return empContact;
	}
	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}
	public int getEmpPincode() {
		return empPincode;
	}
	public void setEmpPincode(int empPincode) {
		this.empPincode = empPincode;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsalarey=" + empsalarey + ", empEmail="
				+ empEmail + ", empCity=" + empCity + ", empContact=" + empContact + ", empPincode=" + empPincode + "]";
	}
	
	
	
	
	

}
