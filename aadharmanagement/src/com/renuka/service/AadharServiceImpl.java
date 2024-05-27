package com.renuka.service;

import java.util.List;

import com.renuka.dao.AadharDao;
import com.renuka.dao.AadharDaoImpl;
import com.renuka.dto.Aadhar;




public class AadharServiceImpl implements AadharService {

	AadharDao aadharDao=new AadharDaoImpl();

	@Override
	public void saveAadharService(Aadhar aadhar) {
		
				double actualIncome = aadhar.getIncome();
				double gstIncome = gstCalculator(actualIncome);
				aadhar.setIncome(gstIncome);
				aadharDao.saveAadharDao(aadhar);

			}

			private double gstCalculator(double actualIncome) {
				double gst = actualIncome * 0.16;
				double gstIncome = actualIncome + gst;
				return gstIncome;

	}

	@Override
	public Aadhar selectAadharByIdService(int aadharId) {
		Aadhar aadhar = aadharDao.selectAadharByIdDao(aadharId);
		double gstIncome = aadhar.getIncome();
		double finalDiscountedIncome = discountIncomeCalculator(gstIncome);
		aadhar.setIncome(finalDiscountedIncome);
		return aadhar;
	}

	private double discountIncomeCalculator(double gstImcome) {
		double discountImcome = gstImcome * 0.20;
		double finalImcome = gstImcome - discountImcome;

		return finalImcome;
	}

	
	@Override
	public Aadhar selectAadharByNameService(String aadharName) {
		Aadhar aadhar = aadharDao.selectAadharByNameDao(aadharName);
		double prdIncome = aadhar.getIncome();
		double disIncome = discountIncomeCalculator(prdIncome);
		aadhar.setIncome(disIncome);
		return aadhar;
	}

	@Override
	public List<Aadhar> selectAllAadharService() {
		List<Aadhar> prdList = aadharDao.selectAllAadharDao();
		for (Aadhar prd : prdList) {
			double prdIncome = prd.getIncome();
			double disIncome= discountIncomeCalculator(prdIncome);
			prd.setIncome(disIncome);
		}
		return prdList;
	}

	@Override
	public List<Aadhar> selectAllAadharByIncomeLowToHighService() {
		List<Aadhar> aadharlist1=aadharDao.selectAllAadharByIncomeLowToHighDao();
		
		return aadharlist1;
	}

	@Override
	public List<Aadhar> selectAllAadharByIncomeHightToLowService() {
    List<Aadhar> aadharlist1=aadharDao.selectAllAadharByIncomeHightToLowDao();
		
		return aadharlist1;
	
	}

	@Override
	public Aadhar selectAadharByIdService(long aadharId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAadharById(int aadharId) {
		aadharDao.deleteAadharByIdDao(aadharId);
		
	}

	@Override
	public Aadhar selectAadharByDistrictDao(String aadharDistrict) {
		Aadhar aadhar = aadharDao.selectAadharByDistrictDao(aadharDistrict);
		double ardIncome = aadhar.getIncome();
		double disIncome = discountIncomeCalculator(ardIncome);
		aadhar.setIncome(disIncome);
		return aadhar;
		
		
	}

	@Override
	public List<Aadhar> selectAllAadharByAgeLowToHighDao() {
		List<Aadhar> aadharlist1=aadharDao.selectAllAadharByAgeLowToHighDao();
		return aadharlist1;
	}

	@Override
	public List<Aadhar> selectAllAadharByAgeHightToLowDao() {
		List<Aadhar> aadharlist1=aadharDao.selectAllAadharByAgeHightToLowDao();
		return aadharlist1;
	}



	
}