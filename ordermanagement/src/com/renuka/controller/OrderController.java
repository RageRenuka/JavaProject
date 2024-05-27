package com.renuka.controller;

import java.util.List;
import java.util.Scanner;


import com.renuka.service.OrderService;
import com.renuka.service.OrderServiceImpl;

import come.renuka.dto.Address;
import come.renuka.dto.Order;

public class OrderController {

	public static void main(String[] args) {
		  OrderService orderService = new OrderServiceImpl();
		System.out.println("Enter order details ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Adding the Order deatiles .....");
		System.out.println("2.Select the Order By Id .....");
		System.out.println("3.Select the Order By Type .....");
		System.out.println("4.Select All Orders........ ");
		System.out.println("5.select all Price Low To High");
		System.out.println("6.select all Price High To Low");
	    System.out.println("7.delete Order Record");
	    System.out.println("8.update Order Record");
	   
	  
		
		int choice = sc.nextInt();

switch(choice) {
	case 1:
	    System.out.println("Enter order type");
		String otype = sc.next();
		System.out.println("Enter order price");
		double oprice = sc.nextDouble();
		System.out.println("Enter order delivery doorno");
		int ddno = sc.nextInt();
		System.out.println("Enter order delivery street");
		String dstreet = sc.next();
		System.out.println("Enter order delivery city");
		String dcity = sc.next();
		System.out.println("Enter order delivery state");
		String dstate= sc.next();
		System.out.println("Enter order pin");
	     long pin = sc.nextLong();
	    System.out.println("Enter the order landmark");
	    String landMark = sc.next();
	    Order order = new Order();
	    Address address = new Address();
	    address.setdNo(ddno);
	    address.setStreet(dstreet);
	    address.setCity(dcity);
	    address.setState(dstate);
	    address.setPin(pin);
	    address.setLandMark(landMark);
	    order.setoType(otype);
	    order.setoPrice(oprice);
	    order.setOdAddress(address);
  
	    orderService.saveOrderService(order);
	    System.out.println("Ading the values Successfully.....in a Table");
		break;
	case 2:
	    
	    System.out.println("Enter the order id you want to retrive");
	    int oid = sc.nextInt();
	    OrderService orderService1 = new OrderServiceImpl();
	    Order order2 =  orderService1.selectOrderByOrderIdService(oid);
		System.out.println(order2);
		break;
	case 3:
	 
	    System.out.println("Enter the order Type you want to retrive");
	    String otypeName = sc.next();
	    OrderService orderServicetype = new OrderServiceImpl();
	    Order orderType =  orderServicetype.selectOrderByOrderTypeService(otypeName);
		System.out.println(orderType);
			break;
		
	case 4:
		System.out.println("Selected all Orders");
		
		List<Order> OrderList1 =orderService.selectAllOrdersService();
		
		for (Order prd : OrderList1) {
			System.out.println(prd);
		}
		break;
	case 5:
		System.out.println("select all Oders by Price low to high");
		List<Order> orderListLowToHigh = orderService.selectAllOrderByPriceLowToHighService();
		for (Order od : orderListLowToHigh) {
			System.out.println(od);
		}
		break;
	case 6:
		System.out.println("select all Oders by Price low to high");
		List<Order> orderListHighToLow = orderService.selectAllOrderByPriceHightToLowService();
		for (Order od : orderListHighToLow) {
			System.out.println(od);
		}
		break;
	case 7:
		System.out.println("delete the order Record");
		int ordertypeId=sc.nextInt();
		orderService.deleteOrderByIdService(ordertypeId);
		break;
	case 8:
		System.out.println("Do you want to update order, find the orders below");
		System.out.println("enter the order id you want to update");
		int modifyorderId  = sc.nextInt();
		Order modifyingorders = orderService.selectOrderByOrderIdService(modifyorderId);
		System.out.println(modifyingorders);
		System.out.println("Enter the ordertype you wish to update");
		String newName = sc.next();
		modifyingorders.setoType(newName);
		System.out.println("Enter the price u want to update");
		double price = sc.nextDouble();
		modifyingorders.setoPrice(price);
		Order modifiedorder = orderService.updateOrderByTypeService(modifyingorders);
		System.out.println(modifiedorder);		
		break;
	

	
}
	}
	
}
