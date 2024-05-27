package com.renuka.service;

import java.util.List;

import com.renuka.dto.Order;

public interface OrderService {
	public void saveOrder(Order order);
	public Order selectOrderById(int OrderId);
	public List<Order> selectAllOrders();
	public void deleteOrderById(int orderId);
	public Order updateOrder(Order order);
	public List<Order> selectOrderByPriceCondition();
	public Order testLoad(int orderId);
	public Order testGet(int orderId);
	public List<Order> selectMaxOrderPrice();
	public List<Order> selectMinOrderPrice();
	

}