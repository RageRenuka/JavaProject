package com.renuka.dto;

public class Aadhar {
	private int aadharId;
	private String aadharCardHolderName;
	private Address address;
	private double income;
	private long mobilenumber;
	private int age;
	public long getAadharId() {
		return aadharId;
	}
	public void setAadharI(int finalDiscountedIncome) {
		this.aadharId = finalDiscountedIncome;
	}
	public String getAadharCardHolderName() {
		return aadharCardHolderName;
	}
	public void setAadharCardHolderName(String aadharCardHolderName) {
		this.aadharCardHolderName = aadharCardHolderName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharCardHolderName=" + aadharCardHolderName + ", address="
				+ address + ", income=" + income + ", mobilenumber=" + mobilenumber + ",- age=" + age + "]";
	}
	public void setAadharId(int aadharId) {
		this.aadharId=aadharId;
		
	}
	
	

}
