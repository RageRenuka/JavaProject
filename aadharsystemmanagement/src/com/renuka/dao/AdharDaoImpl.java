package com.renuka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.renuka.dto.Address;
import com.renuka.dto.Adhar;
import com.renuka.dto.FamilyDetails;
import com.renuka.ui.DBConnection;



public class AdharDaoImpl implements AdharDao {
	Adhar adhar = new Adhar();

	@Override
	public void saveAdharDao(Adhar adhar) throws SQLException {
		Connection connection = DBConnection.getConnection();
		Statement stmt = connection.createStatement();
		String insertQuery = "insert into Adhar values(" + adhar.getAadharId()+ ",'" + adhar.getAadharCardHolderName() + "','"
				+ adhar.getGender() + "'," + adhar.getMobilenumber() + "," + adhar.getAge() + ",'"
				+ adhar.getFamilyDetailes().getFatherName() + "','" + adhar.getFamilyDetailes().getMotherName() + "','"
				+ adhar.getAddress().getStateName() + "','" + adhar.getAddress().getDistrictName() + "','"
				+ adhar.getAddress().getConstituencyName() + "','" + adhar.getAddress().getMandalName() + "','"
				+ adhar.getAddress().getVillageName() + "','" + adhar.getAddress().getStreetName() + "',"
				+ adhar.getAddress().getHouseNo() + "," + adhar.getAddress().getPincode() + "," + adhar.getIncome()
				+ ",'" + adhar.getReligion() + "'" + ")";
		stmt.execute(insertQuery);
		connection.close();

	}

	@Override
	public Adhar getAdharByIdDao(int adharId) {
		Adhar duplicateAdhar = new Adhar();
		FamilyDetails fd = new FamilyDetails();
		Address address = new Address();
		try {
			Connection connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from adhar where adharId =" + adharId;
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				duplicateAdhar.setAadharId(rs.getInt(1));
				duplicateAdhar.setAadharCardHolderName(rs.getString(2));
				duplicateAdhar.setGender(rs.getString(3).charAt(0));
				duplicateAdhar.setMobilenumber(rs.getLong(4));
				duplicateAdhar.setAge(rs.getInt(5));
				fd.setFatherName(rs.getString(6));
				fd.setMotherName(rs.getString(7));
				duplicateAdhar.setFamilyDetailes(fd);
				address.setStateName(rs.getString(8));
				address.setDistrictName(rs.getString(9));
				address.setConstituencyName(rs.getString(10));
				address.setMandalName(rs.getString(11));
				address.setVillageName(rs.getString(12));
				address.setStreetName(rs.getString(13));
				address.setHouseNo(rs.getInt(14));
				address.setPincode(rs.getInt(15));
				duplicateAdhar.setIncome(rs.getInt(16));
				duplicateAdhar.setAddress(address);
				duplicateAdhar.setReligion(rs.getString(17));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return duplicateAdhar;
	}

	@Override
	public Adhar getAdharByNameDao(String name) {
		Adhar duplicateAdhar = new Adhar();
		FamilyDetails fd = new FamilyDetails();
		Address address = new Address();
		try {
			Connection connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from adhar where name =" + "'" + name + "'";
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				duplicateAdhar.setAadharId(rs.getInt(1));
				duplicateAdhar.setAadharCardHolderName(rs.getString(2));
				duplicateAdhar.setGender(rs.getString(3).charAt(0));
				duplicateAdhar.setMobilenumber(rs.getLong(4));
				duplicateAdhar.setAge(rs.getInt(5));
				fd.setFatherName(rs.getString(6));
				fd.setMotherName(rs.getString(7));
				duplicateAdhar.setFamilyDetailes(fd);
				address.setStateName(rs.getString(8));
				address.setDistrictName(rs.getString(9));
				address.setConstituencyName(rs.getString(10));
				address.setMandalName(rs.getString(11));
				address.setVillageName(rs.getString(12));
				address.setStreetName(rs.getString(13));
				address.setHouseNo(rs.getInt(14));
				address.setPincode(rs.getInt(15));
				duplicateAdhar.setIncome(rs.getInt(16));
				duplicateAdhar.setAddress(address);
				duplicateAdhar.setReligion(rs.getString(17));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return duplicateAdhar;
	}

	@Override
	public void deleteAdharByIdDao(int adharId) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String deleteQuery = "delete from where adharId=" + adharId;
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Adhar> getAllAdharHolderDetilesDao() {

		List<Adhar> adharList = new ArrayList<Adhar>();
		try {
			Connection connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String selectALLQuery = "select * from adhar";
			ResultSet rs = stmt.executeQuery(selectALLQuery);

			while (rs.next()) {
				Adhar duplicateAdhar = new Adhar();
				FamilyDetails fd = new FamilyDetails();
				Address address = new Address();
				duplicateAdhar.setAadharId(rs.getInt(1));
				duplicateAdhar.setAadharCardHolderName(rs.getString(2));
				duplicateAdhar.setGender(rs.getString(3).charAt(0));
				duplicateAdhar.setMobilenumber(rs.getLong(4));
				duplicateAdhar.setAge(rs.getInt(5));
				fd.setFatherName(rs.getString(6));
				fd.setMotherName(rs.getString(7));
				duplicateAdhar.setFamilyDetailes(fd);
				address.setStateName(rs.getString(8));
				address.setDistrictName(rs.getString(9));
				address.setConstituencyName(rs.getString(10));
				address.setMandalName(rs.getString(11));
				address.setVillageName(rs.getString(12));
				address.setStreetName(rs.getString(13));
				address.setHouseNo(rs.getInt(14));
				address.setPincode(rs.getInt(15));
				duplicateAdhar.setIncome(rs.getInt(16));
				duplicateAdhar.setAddress(address);
				duplicateAdhar.setReligion(rs.getString(17));
				adharList.add(duplicateAdhar);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adharList;
	}

	@Override
	public List<Adhar> getAdharHoldersByReligion(String religionName) {
		List<Adhar> adharList = new ArrayList<Adhar>();
		try {
			Connection connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String selectALLQuery = "select * from adhar where religion=" + "'" + religionName + "'";
			ResultSet rs = stmt.executeQuery(selectALLQuery);

			while (rs.next()) {
				Adhar duplicateAdhar = new Adhar();
				FamilyDetails fd = new FamilyDetails();
				Address address = new Address();
				duplicateAdhar.setAadharId(rs.getInt(1));
				duplicateAdhar.setAadharCardHolderName(rs.getString(2));
				duplicateAdhar.setGender(rs.getString(3).charAt(0));
				duplicateAdhar.setMobilenumber(rs.getLong(4));
				duplicateAdhar.setAge(rs.getInt(5));
				fd.setFatherName(rs.getString(6));
				fd.setMotherName(rs.getString(7));
				duplicateAdhar.setFamilyDetailes(fd);
				address.setStateName(rs.getString(8));
				address.setDistrictName(rs.getString(9));
				address.setConstituencyName(rs.getString(10));
				address.setMandalName(rs.getString(11));
				address.setVillageName(rs.getString(12));
				address.setStreetName(rs.getString(13));
				address.setHouseNo(rs.getInt(14));
				address.setPincode(rs.getInt(15));
				duplicateAdhar.setIncome(rs.getInt(16));
				duplicateAdhar.setAddress(address);
				duplicateAdhar.setReligion(rs.getString(17));
				adharList.add(duplicateAdhar);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adharList;
	}

	@Override
	public List<Adhar> getAdharHolderslessthanBasicSalaryDao() {

		return null;
	}

	@Override
	public List<Adhar> getAdharHoldersLowToHighDao() {
		List<Adhar> lowToHighList = getAllAdharHolderDetilesDao();
		Collections.sort(lowToHighList, new LowToHighIncome());
		return lowToHighList;
	}

	@Override
	public List<Adhar> getAdharHoldersHighToLow() {
		List<Adhar> HighToLowList = getAllAdharHolderDetilesDao();
		Collections.sort(HighToLowList, new HighToLowIncome());
		return HighToLowList;
	}

	@Override
	public List<Adhar> incrementedAdharHoldersDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adhar> getAdharHoldersBelongsToAndhraPradesh(String stateName) {
		List<Adhar> adharList = new ArrayList<Adhar>();
		try {
			Connection connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String selectALLQuery = "select * from where stateName=" + "'" + stateName + "'";
			ResultSet rs = stmt.executeQuery(selectALLQuery);

			while (rs.next()) {
				Adhar duplicateAdhar = new Adhar();
				FamilyDetails fd = new FamilyDetails();
				Address address = new Address();
				duplicateAdhar.setAadharId(rs.getInt(1));
				duplicateAdhar.setAadharCardHolderName(rs.getString(2));
				duplicateAdhar.setGender(rs.getString(3).charAt(0));
				duplicateAdhar.setMobilenumber(rs.getLong(4));
				duplicateAdhar.setAge(rs.getInt(5));
				fd.setFatherName(rs.getString(6));
				fd.setMotherName(rs.getString(7));
				duplicateAdhar.setFamilyDetailes(fd);
				address.setStateName(rs.getString(8));
				address.setDistrictName(rs.getString(9));
				address.setConstituencyName(rs.getString(10));
				address.setMandalName(rs.getString(11));
				address.setVillageName(rs.getString(12));
				address.setStreetName(rs.getString(13));
				address.setHouseNo(rs.getInt(14));
				address.setPincode(rs.getInt(15));
				duplicateAdhar.setIncome(rs.getInt(16));
				duplicateAdhar.setAddress(address);
				duplicateAdhar.setReligion(rs.getString(17));
				adharList.add(duplicateAdhar);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adharList;
	}

	@Override
	public Adhar updateAdharDao(Adhar adhar) {

		try {
			Connection connection = DBConnection.getConnection();
			Statement stmt = connection.createStatement();
			String updateQuery = "update adhar set adharid =" +  adhar.getAadharId();

			stmt.execute(updateQuery);
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adhar ;

	};
}
