package com.renuka.dto;

public class Manifacturer {

	private String manifactureName;
	private String manifactureLocation;
	private long manifactureLicence;
	public String getManifactureName() {
		return manifactureName;
	}
	public void setManifactureName(String manifactureName) {
		this.manifactureName = manifactureName;
	}
	public String getManifactureLocation() {
		return manifactureLocation;
	}
	public void setManifactureLocation(String manifactureLocation) {
		this.manifactureLocation = manifactureLocation;
	}
	public long getManifactureLicence() {
		return manifactureLicence;
	}
	public void setManifactureLicence(long manifactureLicence) {
		this.manifactureLicence = manifactureLicence;
	}
	@Override
	public String toString() {
		return "Manifacturer [manifactureName=" + manifactureName + ", manifactureLocation=" + manifactureLocation
				+ ", manifactureLicence=" + manifactureLicence + "]";
	}


}
