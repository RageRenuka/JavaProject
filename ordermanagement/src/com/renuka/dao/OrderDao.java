package com.renuka.dao;

import java.util.List;



import come.renuka.dto.Order;

public interface OrderDao {
	public void saveOrderDao(Order order);
	public Order selectOrderByOrderIdDao(int orderId);
	public Order selectOrderByOrderTypeDao(String orderType);
	public List<Order> selectAllOrdersDao();
	public List<Order> selectAllOrderBypriceLowToHighDao();
	public List<Order> selectAllOrderByPriceHightToLowDao();
	public void deleteOrderByIdDao(int  orderId);
	public Order updateOrderByTypeService(Order order);

}
