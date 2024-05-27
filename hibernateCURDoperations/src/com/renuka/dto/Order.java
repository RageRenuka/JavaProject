package com.renuka.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OrderTable")

public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="OID")
	private int orderId;
	@Column(name = "orderType")
	private String orderType;
	@Column(name = "orderPrice")
	private double orderPrice;
	@Column(name = "orderAddress")
	private String orderAddress;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderType=" + orderType + ", orderPrice=" + orderPrice
				+ ", orderAddress=" + orderAddress + "]";
	}
	
	
	
	

}
