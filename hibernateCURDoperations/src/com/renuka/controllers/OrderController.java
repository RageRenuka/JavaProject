package com.renuka.controllers;

import java.util.List;
import java.util.Scanner;

import com.renuka.dto.Order;
import com.renuka.service.OrderService;
import com.renuka.service.OrderServiceImpl;

public class OrderController {
	static Scanner sc = new Scanner(System.in);
	static OrderService service = new OrderServiceImpl();

	public static void main(String[] args) {
		System.out.println("Enter Your Coice Of Opertion");
		System.out.println("1.Create An Order");
		System.out.println("2.Select An OrderById");
		System.out.println("3.Delete An OrderById");
		System.out.println("4.Select AllOrders");
		System.out.println("5.Update An OrderById");
		System.out.println("6.select orders price greater then 5000");
		System.out.println("7.toTestLoad");
		System.out.println("8.toTestGet");
		System.out.println("9.select MaxOrderPrice");
		System.out.println("10.select MinOrderPrice");
	

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			createAnOrder();
			break;
		case 2:
			selectAnOrder();
			break;
		case 3:
			deleteAnOrder();
			break;
		case 4:
			selectAllOrders();
			break;
		case 5:
			updateAnOrder();
			break;
		case 6:
			selectOrdersPriceGreateThan5000();
			break;
			
		case 7:
			toTestLoad();
			break;
		case 8:
			toTestGet();
			break;
	
	    case 9:
		   maxOrderPrice();
		break;
		
	    case 10:
			   minOrderPrice();
			break;
			
	 
	}
	
}

	private static void selectOrdersPriceGreateThan5000() {
		List<Order> orderList = service.selectOrderByPriceCondition();
		for (Order ord : orderList)
			System.out.println(ord);
	}

	private static void updateAnOrder() {

		System.out.println("update an order by using an Id");
		System.out.println("Please Enter the orderId  to Update");
		int orderId1 = sc.nextInt();
		Order updateOrder = service.selectOrderById(orderId1);
		System.out.println(updateOrder);
		System.out.println("Enter new Order type to update");
		String OrderType = sc.next();
		updateOrder.setOrderType(OrderType);
		System.out.println("Enter orderPrice to update");
		double price = sc.nextDouble();
		updateOrder.setOrderPrice(price);
		Order updatingOrder = service.updateOrder(updateOrder);
//		System.out.println(updatingOrder);
		System.out.println("Enter orderAddress to update");
		String orderAddress = sc.next();
		updateOrder.setOrderAddress(orderAddress);
		Order updatingorders = service.updateOrder(updateOrder);
		System.out.println(updatingorders);
	}

	private static void selectAllOrders() {
		List<Order> ordersList = service.selectAllOrders();
		for (Order order : ordersList) {
			System.out.println(order);
		}
	}

	private static void deleteAnOrder() {
		System.out.println("Enter OrderId You Want To Delete");
		int order = sc.nextInt();
		service.deleteOrderById(order);
	}

	private static void selectAnOrder() {
		System.out.println("Enter OrderId You Want To Retrive");
		int orderId = sc.nextInt();
		Order order = service.selectOrderById(orderId);
		System.out.println(order);
	}

	private static void createAnOrder() {
		System.out.println("Enter Your Order Dtailes...");
		Order order = new Order();
		System.out.println("Enter Order Type");
		String orderType = sc.next();
		order.setOrderType(orderType);
		System.out.println("Enter Order Price");
		double orderPrice = sc.nextDouble();
		order.setOrderPrice(orderPrice);
		System.out.println("Enter Order Address");
		String orderAddress = sc.next();
		order.setOrderAddress(orderAddress);
		service.saveOrder(order);
	}

	private static void toTestLoad() {
		System.out.println("Enter OrderId  to retrive object");
		int orderId=sc.nextInt();
		Order order=service.testLoad(orderId);
		System.out.println("Load method loared object"+order);

	}

	private static void toTestGet() {
		System.out.println("Enter OrderId  to retrive object");
		int orderId=sc.nextInt();
		Order order=service.testGet(orderId);
		System.out.println("Get method loared object"+order);

	}
	public static void maxOrderPrice() {
		List<Order> ordersList = service.selectMaxOrderPrice();
		for (Order order : ordersList) {
			System.out.println(order);
		}
	}
		public static void minOrderPrice() {
			List<Order> ordersList = service.selectMinOrderPrice();
			for (Order order : ordersList) {
				System.out.println(order);
			}
	}
		
}