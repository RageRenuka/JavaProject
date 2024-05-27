package com.renuka.dao;

import java.util.List;

import com.renuka.dto.Aadhar;


public interface AadharDao {
	public void saveAadharDao(Aadhar aadhar);
	public Aadhar selectAadharByIdDao(int aadharId);
	public Aadhar selectAadharByNameDao(String aadharName);
	public List<Aadhar> selectAllAadharDao();
	public List<Aadhar> selectAllAadharByIncomeLowToHighDao();
	public List<Aadhar> selectAllAadharByIncomeHightToLowDao();
	public void deleteAadharByIdDao(int aadharId);
	public Aadhar selectAadharByDistrictDao(String aadharDistrict);
	public List<Aadhar> selectAllAadharByAgeLowToHighDao();
	public List<Aadhar> selectAllAadharByAgeHightToLowDao();

	
	
	

}
