package com.renuka;



public class Address implements Cloneable{
	
	private int plotNumber;
	private String locality;
	private String city;
	private String state;
	private String country;
	private long pin;
	
		public int getPlotNumber() {
		return plotNumber;
	}

	public void setPlotNumber(int plotNumber) {
		this.plotNumber = plotNumber;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [plotNumber=" + plotNumber + ", locality=" + locality + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pin=" + pin + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
