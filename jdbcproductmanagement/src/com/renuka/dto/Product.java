package com.renuka.dto;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private String prouctType;
	private Manifacturer manifacture;
	private double weight;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProuctType() {
		return prouctType;
	}
	public void setProuctType(String prouctType) {
		this.prouctType = prouctType;
	}
	public Manifacturer getManifacture() {
		return manifacture;
	}
	public void setManifacture(Manifacturer manifacture) {
		this.manifacture = manifacture;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", prouctType=" + prouctType + ", weight=" + weight + "]";
	}


}
