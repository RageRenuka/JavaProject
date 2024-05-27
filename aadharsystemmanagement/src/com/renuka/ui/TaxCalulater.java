package com.renuka.ui;


public class TaxCalulater {
String name ;
	double income;
	public TaxCalulater() {
		
	}
	@Override
	public String toString() {
		return "TaxCalulater [name=" + name + ", income=" + income + "]";
	}
	public TaxCalulater(String name, double income) {
		super();
		this.name = name;
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}

	

	
	

}
