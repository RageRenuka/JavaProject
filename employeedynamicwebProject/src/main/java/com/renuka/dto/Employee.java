package com.renuka.dto;

public class Employee {
	private int empId;
	private String  empName;
	private String empCity;
	private int contct;
	private String empMail;
	private int age;
	private Double salary;
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
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public int getContct() {
		return contct;
	}
	public void setContct(int contct) {
		this.contct = contct;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", contct=" + contct
				+ ", empMail=" + empMail + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
