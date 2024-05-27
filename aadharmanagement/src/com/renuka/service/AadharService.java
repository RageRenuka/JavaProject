package com.renuka.service;

import java.util.List;

import com.renuka.dto.Aadhar;


public interface AadharService {
	public void saveAadharService(Aadhar aadhar);
	public Aadhar selectAadharByIdService(long aadharId);
	public Aadhar selectAadharByNameService(String aadharName);
	public List<Aadhar> selectAllAadharService();
	public List<Aadhar> selectAllAadharByIncomeLowToHighService();
	public List<Aadhar> selectAllAadharByIncomeHightToLowService();
	Aadhar selectAadharByIdService(int aadharId);
	public void deleteAadharById(int aadharId);
	public Aadhar selectAadharByDistrictDao(String aadharDistrict);
	public List<Aadhar> selectAllAadharByAgeLowToHighDao();
	public List<Aadhar> selectAllAadharByAgeHightToLowDao();
	
	

}
