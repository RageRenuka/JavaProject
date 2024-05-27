package com.renuka.dto;

public class Address {
private String village;
private String mondal;
private String district;
private String state;
private int pincode;
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getMondal() {
	return mondal;
}
public void setMondal(String mondal) {
	this.mondal = mondal;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [village=" + village + ", mondal=" + mondal + ", district=" + district + ", state=" + state
			+ ", pincode=" + pincode + "]";
}


}