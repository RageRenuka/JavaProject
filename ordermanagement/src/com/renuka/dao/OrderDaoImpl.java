package com.renuka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.renuka.ui.ConnectionUtil;
import com.renuka.ui.TypePriceHighToLowComparator;
import com.renuka.ui.TypePriceLowToHighComparator;

import come.renuka.dto.Address;
import come.renuka.dto.Order;

public class OrderDaoImpl implements OrderDao {

	@Override
	public void saveOrderDao(Order order) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into order1 values(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, order.getoId());
			pstmt.setString(2, order.getoType());
			pstmt.setDouble(3, order.getoPrice());
			pstmt.setInt(4, order.getOdAddress().getdNo());
			pstmt.setString(5, order.getOdAddress().getStreet());
			pstmt.setString(6, order.getOdAddress().getCity());
			pstmt.setString(7, order.getOdAddress().getState());
			pstmt.setLong(8, order.getOdAddress().getPin());
			pstmt.setString(9, order.getOdAddress().getLandMark());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

	@Override
	public Order selectOrderByOrderIdDao(int orderId) {
		Connection connection = ConnectionUtil.getConnection();
		Order order = new Order();
		Address address = new Address();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from order1 where oid = ?");
			pstmt.setInt(1, orderId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int ord = rs.getInt(1);
				String otype = rs.getString(2);
				double oprice = rs.getDouble(3);
				int dno = rs.getInt(4);
				String street = rs.getString(5);
				String city = rs.getString(6);
				String state = rs.getString(7);
				long pin = rs.getLong(8);
				String landmark = rs.getString(9);
				address.setdNo(dno);
				address.setStreet(street);
				address.setCity(city);
				address.setState(state);
				address.setPin(pin);
				address.setLandMark(landmark);
				order.setOdAddress(address);
				order.setoId(ord);
				order.setoType(otype);
				order.setoPrice(oprice);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return order;
		}

	@Override
	public Order selectOrderByOrderTypeDao(String orderType) {
		Connection connection = ConnectionUtil.getConnection();
		Order order = new Order();
		Address address = new Address();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from order1 where oType = ?");
			pstmt.setString(1, orderType);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int ord = rs.getInt(1);
				String otype = rs.getString(2);
				double oprice = rs.getDouble(3);
				int dno = rs.getInt(4);
				String street = rs.getString(5);
				String city = rs.getString(6);
				String state = rs.getString(7);
				long pin = rs.getLong(8);
				String landmark = rs.getString(9);
				address.setdNo(dno);
				address.setStreet(street);
				address.setCity(city);
				address.setState(state);
				address.setPin(pin);
				address.setLandMark(landmark);
				order.setOdAddress(address);
				order.setoId(ord);
				order.setoType(otype);
				order.setoPrice(oprice);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return order;
	}

	@Override
	public List<Order> selectAllOrdersDao() {
		Connection connection = ConnectionUtil.getConnection();
		List<Order> ordList = new ArrayList<Order>();

		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from order1");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Order dummyOrder = new Order();
				Address dummyAddress = new Address();
				
				int orderId1 = rs.getInt(1);
				String ordertypeName = rs.getString(2);
				double orderPrice=rs.getDouble(3);
				int addressDno=rs.getInt(4);
				String addressStreet=rs.getString(5);
				String addressCity=rs.getString(6);
				String addressState=rs.getString(7);
				int addressPin=rs.getInt(8);
				String addressLandMark=rs.getString(9);
				
				
				
				
				dummyAddress.setdNo(addressDno);
				dummyAddress.setStreet(addressStreet);
				dummyAddress.setCity(addressCity);
				dummyAddress.setState(addressState);
				dummyAddress.setPin(addressPin);
				dummyAddress.setLandMark(addressLandMark);
				
				dummyOrder.setOdAddress(dummyAddress);
				dummyOrder.setoId(orderId1);
				dummyOrder.setoType(ordertypeName);
				dummyOrder.setoPrice(orderPrice);
				
				
				ordList.add(dummyOrder);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ordList;
	}

	@Override
	public List<Order> selectAllOrderBypriceLowToHighDao() {
		List<Order> ordListlow = selectAllOrdersDao();
		 Collections.sort(ordListlow, new TypePriceLowToHighComparator());
		return ordListlow;
	}

	@Override
	public List<Order> selectAllOrderByPriceHightToLowDao() {
		List<Order> ordListhigh = selectAllOrdersDao();
		 Collections.sort(ordListhigh, new TypePriceHighToLowComparator());
		return ordListhigh;
	}
//	public void batchProcessing() {
//		Connection connect=ConnectionUtil.getConnection();
//		try {
//			Statement stmt=connect.createStatement();
//			stmt.addBatch("create table batchJdbc(sno number(10),name varchar(10),cource,varchar(15))");
//			stmt.addBatch("alter table batchJdbc(fee number(10))");
//			stmt.executeBatch();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	

	@Override
	public void deleteOrderByIdDao(int orderId) {
		Connection connection = ConnectionUtil.getConnection();
		Order order = new Order();
		Address address = new Address();
		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from order1 where oId = ?");
			pstmt.setLong(1,orderId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//
				int ord = rs.getInt(1);
				String otype = rs.getString(2);
				double oprice = rs.getDouble(3);
				int dno = rs.getInt(4);
				String street = rs.getString(5);
				String city = rs.getString(6);
				String state = rs.getString(7);
				long pin = rs.getLong(8);
				String landmark = rs.getString(9);
				address.setdNo(dno);
				address.setStreet(street);
				address.setCity(city);
				address.setState(state);
				address.setPin(pin);
				address.setLandMark(landmark);
				order.setOdAddress(address);
				order.setoId(ord);
				order.setoType(otype);
				order.setoPrice(oprice);
				System.out.println("Delete the record successFully....");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	
		
		//@Override
		public Order updateOrderByTypeService(Order order) {
			Connection connection = ConnectionUtil.getConnection();
			Order order1 = new Order();
			Address address = new Address();
			try {
				PreparedStatement pstmt = connection.prepareStatement("update order1 set oType=?,oPrice=?  where oId= ?");
			
				pstmt.setString(1, order.getoType());
				pstmt.setDouble(2, order.getoPrice());
				pstmt.setInt(3, order.getoId());;
				
				pstmt.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			 return selectOrderByOrderIdDao(order.getoId());
		}
//	public void batchProcessing() {
//		Connection connect=ConnectionUtil.getConnection();
//		try {
//			Statement stmt=connect.createStatement();
//			stmt.addBatch("create table batchJdbc(sno number(10),name varchar(10),cource,varchar(15))");
////			stmt.addBatch(" rename batchJdbc to batchJdbc1");
////			stmt.addBatch("alter table batchJdbc(fee number(10))");
//			int res[]=stmt.executeBatch();
//			System.out.println(res.length);
//			for(int i:res) {
//				System.out.println(i);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		OrderDaoImpl odi=new OrderDaoImpl();
//		odi.batchProcessing();
//	}
//

	}	

		
		
	
	



	


