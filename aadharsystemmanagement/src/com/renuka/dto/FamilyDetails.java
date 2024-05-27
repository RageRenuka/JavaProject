package com.renuka.dto;


public class FamilyDetails {
	private String fatherName;
	private String motherName;
	
	public FamilyDetails() {
		
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

	@Override
	public String toString() {
		return "FamilyDetails [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}
	
	
	

}
