package com.renuka.collections;

public class Employee {
	int empId;
	String empName;
	double empSalarey;
	int age;
	long mobileNumber;
	
	public Employee(int empId, String empName, double empSalarey, int age, long mobileNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empSalarey = empSalarey;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalarey() {
		return empSalarey;
	}

	public void setEmpSalarey(double empSalarey) {
		this.empSalarey = empSalarey;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalarey=" + empSalarey + ", age=" + age
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	
	
	
	

}
