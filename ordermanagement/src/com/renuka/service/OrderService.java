package com.renuka.service;

import java.util.List;

import come.renuka.dto.Order;

public interface OrderService {
	public void saveOrderService(Order order);
	public Order selectOrderByOrderIdService(int orderId);
	public Order selectOrderByOrderTypeService(String orderType);
	public List<Order> selectAllOrdersService();
	public List<Order> selectAllOrderByPriceLowToHighService();
	public List<Order> selectAllOrderByPriceHightToLowService();
	public void deleteOrderByIdService(int  orderId);
	public Order updateOrderByTypeService(Order  order);
	
}
