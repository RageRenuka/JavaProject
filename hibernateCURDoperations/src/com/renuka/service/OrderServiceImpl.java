package com.renuka.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.renuka.dto.Order;
import com.renuka.repo.OrderRepo;
import com.renuka.repo.OrderRepoImpl;
import com.renuka.util.SessionUtil;

public class OrderServiceImpl implements OrderService {
	OrderRepo repo=new OrderRepoImpl();

	@Override
	public void saveOrder(Order order) {
		repo.saveOrderRepo(order);	
	}
	@Override
	public Order selectOrderById(int OrderId) {
		Order order=repo.selectOrderByIdRepo(OrderId);
		return order;
	}
	@Override
	public List<Order> selectAllOrders() {
		List<Order> orderList =	repo.selectAllOrdersRepo();
		return orderList;
	}
	@Override
	public void deleteOrderById(int orderId) {
		repo.deleteOrderByIdRepo(orderId);
	}

	@Override
	public Order updateOrder(Order order) {
   Order Order1= repo.updateOrderRepo(order);
		return Order1;
	}
@Override
	public List<Order> selectOrderByPriceCondition() {
		 List<Order> orderList =   repo.selectOrdersByPriceRepo();
			return orderList;
	}
@Override
public Order testLoad(int orderId) {
	// TODO Auto-generated method stub
	return repo.testLoad(orderId);
}
@Override
public Order testGet(int orderId) {
	
	return repo.testGet(orderId);
}
@Override
public List<Order> selectMaxOrderPrice() {
	List<Order> maxorderList=repo.selectMaxOrderPrice();
	return maxorderList;
}
@Override
public List<Order> selectMinOrderPrice() {
	List<Order> minorderList=repo.selectMinOrderPrice();
	return minorderList;
}



}
