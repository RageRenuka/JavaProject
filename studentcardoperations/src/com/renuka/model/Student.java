package com.renuka.model;

public class Student {

	private int sId;
	private String sName;
	private String sSchool;
	private String sClass;
	private double sMarks;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsSchool() {
		return sSchool;
	}

	public void setsSchool(String sSchool) {
		this.sSchool = sSchool;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public double getsMarks() {
		return sMarks;
	}

	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sSchool=" + sSchool + ", sClass=" + sClass + ", sMarks="
				+ sMarks + "]";
	}

}

