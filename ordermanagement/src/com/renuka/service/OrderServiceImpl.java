package com.renuka.service;

import java.util.List;
import java.util.Random;

import com.renuka.dao.OrderDao;
import com.renuka.dao.OrderDaoImpl;


import come.renuka.dto.Order;

public class OrderServiceImpl implements OrderService {
	OrderDao orderDao =new OrderDaoImpl();
	@Override
	public void saveOrderService(Order order) {
		 Random random = new Random();
		    int generatedOrderId =  random.nextInt();
		    if(generatedOrderId<0)
		    	generatedOrderId = generatedOrderId * -1;
		    order.setoId(generatedOrderId);
			orderDao.saveOrderDao(order);
				
		
	}

	@Override
	public Order selectOrderByOrderIdService(int orderId) {
		Order order = orderDao.selectOrderByOrderIdDao(orderId);
		return order;

	}

	@Override
	public Order selectOrderByOrderTypeService(String orderType) {
		Order order = orderDao.selectOrderByOrderTypeDao(orderType);
		return order;
	}

	@Override
	public List<Order> selectAllOrdersService() {
		List<Order> ordList = orderDao.selectAllOrdersDao();

		return ordList;
	}

	@Override
	public List<Order> selectAllOrderByPriceLowToHighService() {
   List<Order> orderlistLow=orderDao.selectAllOrderBypriceLowToHighDao();
		
		return orderlistLow;
	}

	@Override
	public List<Order> selectAllOrderByPriceHightToLowService() {
		 List<Order> orderlistHigh=orderDao.selectAllOrderByPriceHightToLowDao();
			
			return orderlistHigh;
	}

	

	@Override
	public void deleteOrderByIdService(int orderId) {
		orderDao.deleteOrderByIdDao(orderId);
		
	}

	

	@Override
	public Order updateOrderByTypeService(Order order) {
		orderDao.updateOrderByTypeService(order);
		 return order;
	}


	

	
	
	


}
