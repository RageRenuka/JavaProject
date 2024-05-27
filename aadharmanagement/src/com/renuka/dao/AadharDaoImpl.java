package com.renuka.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.renuka.dto.Aadhar;
import com.renuka.dto.Address;
import com.renuka.ui.AgeHighToLowComparator;
import com.renuka.ui.AgeLowToHighComparator;

import com.renuka.ui.ConnectionUtil;
import com.renuka.ui.IncomeHighToLowComparator;
import com.renuka.ui.IncomeLowToHighComparator;
public  class AadharDaoImpl implements AadharDao {
private String aadharCardHolderName;

//	private long aadharId;
//	private String aadharCardHolderName;
//	private Address address;
//	private double income;
//	private long mobilenumber;
//	private int age;
//	private String village;
//	private String mondal;
//	private String district;
//	private String state;
//	private int pincode;
	@Override
	public void saveAadharDao(Aadhar aadhar)  {
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt= connection.createStatement();
			String creatingAadharQuery="insert into Aadhar values("
					+aadhar.getAadharId()+","
					+"'"+aadhar.getAadharCardHolderName()+"'"+","
					+"'"+aadhar.getAddress().getVillage()+"'"+","
					+"'"+aadhar.getAddress().getMondal()+"'"+","
					+"'"+aadhar.getAddress().getDistrict()+"'"+","
					+"'"+aadhar.getAddress().getState()+"'"+","
					+aadhar.getAddress().getPincode()+","
					+aadhar.getIncome()+","
					+aadhar.getMobilenumber()+","
					+aadhar.getAge()
					+")" ;
			stmt.execute(creatingAadharQuery);
			ConnectionUtil.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
		
	}

	@Override
	public Aadhar selectAadharByIdDao(int aadharId) {
		
		Connection connection = ConnectionUtil.getConnection();
		Aadhar dummyAadhar = new Aadhar();
		Address dummyAddress = new Address();
		try {
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from aadhar where aadharId = " + aadharId;
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				int aadharId1 = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String aadharName = rs.getString(2);
				String addressVillage = rs.getString(3);
				String addressMondal=rs.getString(4);
				String addressDistrict=rs.getString(5);
				String addressState=rs.getString(6);
				int addressPincode=rs.getInt(7);
				double aadharIncome=rs.getDouble(8);
				long aadharMobileNumber=rs.getLong(9);
				int aadharAge=rs.getInt(10);
				
				
				
				dummyAddress.setVillage(addressVillage);
				dummyAddress.setMondal(addressMondal);
				dummyAddress.setDistrict(addressDistrict);
				dummyAddress.setState(addressState);
				dummyAddress.setPincode(addressPincode);
				
				dummyAadhar.setAddress(dummyAddress);
				dummyAadhar.setAadharId(aadharId1);
				dummyAadhar.setAadharCardHolderName(aadharName);
				dummyAadhar.setIncome(aadharIncome);
				dummyAadhar.setMobilenumber(aadharMobileNumber);
				dummyAadhar.setAge(aadharAge);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dummyAadhar;
	}


	@Override
	public Aadhar selectAadharByNameDao(String aadharName) {

		Connection connection = ConnectionUtil.getConnection();
		Aadhar dummyAadhar = new Aadhar();
		Address dummyAddress = new Address();
		try {
			Statement stmt = connection.createStatement();
//	String selectQuery = "select * from aadhar where aadharCardHolderName =" +"'"+aadharCardHolderName+"'";
//	String selectALLQuery = "select * from aadhar where aadharCardHolderName=" + "'" + aadharCardHolderName + "'";
	String selectallQuery="select*from aadhar where aadharCardHolderName="+"'"+ aadharName+"'";
//	String selectALLQuery = "select * from adhar where stateName=" + "'" + stateName + "'";
	
			ResultSet rs = stmt.executeQuery(selectallQuery);

			while (rs.next()) {
				int aadharId1 = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String aadharName1 = rs.getString(2);
				String addressVillage = rs.getString(3);
				String addressMondal=rs.getString(4);
				String addressDistrict=rs.getString(5);
				String addressState=rs.getString(6);
				int addressPincode=rs.getInt(7);
				double aadharIncome=rs.getDouble(8);
				long aadharMobileNumber=rs.getLong(9);
				int aadharAge=rs.getInt(10);
				
				
				
				dummyAddress.setVillage(addressVillage);
				dummyAddress.setMondal(addressMondal);
				dummyAddress.setDistrict(addressDistrict);
				dummyAddress.setState(addressState);
				dummyAddress.setPincode(addressPincode);
				
				dummyAadhar.setAddress(dummyAddress);
				dummyAadhar.setAadharId(aadharId1);
				dummyAadhar.setAadharCardHolderName(aadharName1);
				dummyAadhar.setIncome(aadharIncome);
				dummyAadhar.setMobilenumber(aadharMobileNumber);
				dummyAadhar.setAge(aadharAge);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dummyAadhar;
	}

	

	@Override
	public List<Aadhar> selectAllAadharDao() {
		Connection connection = ConnectionUtil.getConnection();
		List<Aadhar> prdList = new ArrayList<Aadhar>();
//		Aadhar dummyAadhar = new Aadhar();
//		Address dummyAddress = new Address();
		try {
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from aadhar ";
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				Aadhar dummyAadhar = new Aadhar();
				Address dummyAddress = new Address();
				int aadharId1 = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String aadharName = rs.getString(2);
				String addressVillage = rs.getString(3);
				String addressMondal=rs.getString(4);
				String addressDistrict=rs.getString(5);
				String addressState=rs.getString(6);
				int addressPincode=rs.getInt(7);
				double aadharIncome=rs.getDouble(8);
				long aadharMobileNumber=rs.getLong(9);
				int aadharAge=rs.getInt(10);
				
				
				
				dummyAddress.setVillage(addressVillage);
				dummyAddress.setMondal(addressMondal);
				dummyAddress.setDistrict(addressDistrict);
				dummyAddress.setState(addressState);
				dummyAddress.setPincode(addressPincode);
				
				dummyAadhar.setAddress(dummyAddress);
				dummyAadhar.setAadharId(aadharId1);
				dummyAadhar.setAadharCardHolderName(aadharName);
				dummyAadhar.setIncome(aadharIncome);
				dummyAadhar.setMobilenumber(aadharMobileNumber);
				dummyAadhar.setAge(aadharAge);
				prdList.add(dummyAadhar);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prdList;
	}

	@Override
	public List<Aadhar> selectAllAadharByIncomeLowToHighDao() {
		List<Aadhar> ardList = selectAllAadharDao();
		 Collections.sort(ardList, new IncomeLowToHighComparator());
		return ardList;
	}

	@Override
	public List<Aadhar> selectAllAadharByIncomeHightToLowDao() {
		List<Aadhar> ardList = selectAllAadharDao();
		 Collections.sort(ardList, new IncomeHighToLowComparator());
		return ardList;
	}

	@Override
	public void deleteAadharByIdDao(int aadharId) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt=connection.createStatement();
			String strdeleteQuery="delete from aadhar where aadharId="+aadharId;
			stmt.execute(strdeleteQuery);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Aadhar selectAadharByDistrictDao(String aadharDistrict) {
		Connection connection = ConnectionUtil.getConnection();
		Aadhar dummyAadhar = new Aadhar();
		Address dummyAddress = new Address();
		try {
			Statement stmt = connection.createStatement();

	String selectallQuery="select*from aadhar where district="+"'"+ aadharDistrict+"'";

	
			ResultSet rs = stmt.executeQuery(selectallQuery);

			while (rs.next()) {
				int aadharId1 = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String aadharName1 = rs.getString(2);
				String addressVillage = rs.getString(3);
				String addressMondal=rs.getString(4);
				String addressDistrict=rs.getString(5);
				String addressState=rs.getString(6);
				int addressPincode=rs.getInt(7);
				double aadharIncome=rs.getDouble(8);
				long aadharMobileNumber=rs.getLong(9);
				int aadharAge=rs.getInt(10);
				
				
				
				dummyAddress.setVillage(addressVillage);
				dummyAddress.setMondal(addressMondal);
				dummyAddress.setDistrict(addressDistrict);
				dummyAddress.setState(addressState);
				dummyAddress.setPincode(addressPincode);
				
				dummyAadhar.setAddress(dummyAddress);
				dummyAadhar.setAadharId(aadharId1);
				dummyAadhar.setAadharCardHolderName(aadharName1);
				dummyAadhar.setIncome(aadharIncome);
				dummyAadhar.setMobilenumber(aadharMobileNumber);
				dummyAadhar.setAge(aadharAge);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dummyAadhar;
	}

	
	@Override
	public List<Aadhar> selectAllAadharByAgeLowToHighDao() {
		List<Aadhar> ardList = selectAllAadharDao();
		 Collections.sort(ardList, new AgeLowToHighComparator());
		return ardList;
	}

	@Override
	public List<Aadhar> selectAllAadharByAgeHightToLowDao() {
		List<Aadhar> ardList = selectAllAadharDao();
		 Collections.sort(ardList, new AgeHighToLowComparator());
		return ardList;
	}

	

	}

	

	

		
	

	

	


