package com.renuka.dto;

public class Adhar {
	private long aadharId;
	private String aadharCardHolderName;
	private Address address;
	private double income;
	private long mobilenumber;
	private int age;

	public long getAadharId() {
		return aadharId;
	}

	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
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
		return "Adhar [aadharId=" + aadharId + ", aadharCardHolderName=" + aadharCardHolderName + ", address=" + address
				+ ", income=" + income + ", mobilenumber=" + mobilenumber + ", age=" + age + "]";
	}

	public void setAadharId(double finalDiscountedIncome) {
		// TODO Auto-generated method stub
		
	}

	public void setGender(char charAt) {
		// TODO Auto-generated method stub
		
	}

	public void setFamilyDetailes(FamilyDetails fd) {
		// TODO Auto-generated method stub
		
	}

	public void setReligion(String next) {
		// TODO Auto-generated method stub
		
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}

	public FamilyDetails getFamilyDetailes() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getReligion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
