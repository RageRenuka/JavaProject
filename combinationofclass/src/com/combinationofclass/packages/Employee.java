package com.combinationofclass.packages;

public class Employee {
	private  int empnumber;
	private String empname;
	private double empsalary;
	private long empmobilenum;
	private String empofficename;
	private String emploc;
	
	
	
	public int getEmpNumber() {
		return this.empnumber;
	}
	
	public String getEmpName() {
		return this.empname;
	}
	public double getEmpsalary() {
		return this.empsalary;
	}
	public long getEmpMobileNum() {
		return this.empmobilenum;
	}
	public String getEmpOfficeName() {
		return this.empofficename;
	}
	public String getEmpLoc() {
		return this.emploc;
	}
	
	public Employee() {
	}

	public Employee(int empnumber, String empname, double empsalary, long empmobilenum, String empofficename,
			String emploc) {
		this.empnumber = empnumber;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empmobilenum = empmobilenum;
		this.empofficename = empofficename;
		this.emploc = emploc;
	}

	
	
}
