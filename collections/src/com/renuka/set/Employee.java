package com.renuka.set;

import java.util.Scanner;

public class Employee implements Comparable<Employee> {
 
	private int empId;
	private String empName;
	private int empAge;
	private double empSal;
	private	long empContact;
	private	String empCountry;
	
	public Employee(int empId, String empName, int empAge, double empSal, long empContact, String empCountry) {
		
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
		this.empContact = empContact;
		this.empCountry = empCountry;
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
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public long getEmpContact() {
		return empContact;
	}
	public void setEmpContact(char empContact) {
		this.empContact = empContact;
	}
	public String getEmpCountry() {
		return empCountry;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal
				+ ", empContact=" + empContact + ", empCountry=" + empCountry + "]";
	}
	
	
	
	//@Override
	//compareTo Age
//	public int compareTo(Employee o) {
//		if(this.empAge<o.empAge) {
//			return -1;
//		}else if(this.empAge>o.empAge){
//			return 1;
//		}else
//		return 0;
//	}
	//compareTo empid
//	public int compareTo(Employee e) {
//		if(this.empId<e.empId) {
//			return -1;
//		}else if(this.empId>e.empId){
//			return 1;
//		}else
//		return 0;
//	}
	//@Override
	//compareTo Salarey
	//Dessending order it will display.
	public int compareTo(Employee o) {
		if(this.empSal>o.getEmpSal()) {
			return -1;
		}else if(this.empSal<o.empSal){
			return 1;
		}else {
		return 0;
		}
}
	//compareTo String 
//	@Override
//	public int compareTo(Employee o) {
//	
//		 return this.empName.compareTo(o.empName);
//	}
	
	
	
}


