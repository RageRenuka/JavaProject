package com.renuka.repo;

import java.util.List;

import com.renuka.dto.Order;

public interface OrderRepo {
	
	public void saveOrderRepo(Order order);
	public Order selectOrderByIdRepo(int OrderId);
	public List<Order> selectAllOrdersRepo();
	public void deleteOrderByIdRepo(int orderId);
	public Order updateOrderRepo(Order order) ;
	public List<Order> selectOrdersByPriceRepo();
	public Order testLoad(int orderId);
	public Order testGet(int orderId);
	public List<Order> selectMaxOrderPrice();
	public List<Order> selectMinOrderPrice();
	
	

}
