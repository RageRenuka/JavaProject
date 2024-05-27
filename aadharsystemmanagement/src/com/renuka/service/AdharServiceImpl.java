package com.renuka.service;

import java.sql.SQLException;
import java.util.List;

import com.renuka.dao.AdharDaoImpl;
import com.renuka.dto.Adhar;



public class AdharServiceImpl implements AdharService {
	AdharDaoImpl adharDao = new AdharDaoImpl();

	@Override
	public void saveAdharService(Adhar adhar) {
		try {
			adharDao.saveAdharDao(adhar);
			double taxAmount=taxCalulater(adhar.getIncome());
			adhar.setIncome(taxAmount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Adhar getAdharByIdService(int adharId) {
		Adhar adhar = adharDao.getAdharByIdDao(adharId);
//		double adharIncome = adhar.getIncome();
//		double ss = taxCalulater(adharIncome);
//		adhar.setIncome(ss);
		return adhar;
	}

	@Override
	public Adhar getAdharByNameService(String name) {
		Adhar adhar = adharDao.getAdharByNameDao(name);
		return adhar;
	}

	@Override
	public void deleteAdharByIdService(int adharId) {
		adharDao.deleteAdharByIdDao(adharId);

	}

	@Override
	public List<Adhar> getAllAdharHolderDetilesService() {
		List<Adhar> adharList= adharDao.getAllAdharHolderDetilesDao();
		return adharList;
	}

	@Override
	public List<Adhar> getAdharHoldersByReligion(String religionName) {
		List<Adhar> adharList = adharDao.getAdharHoldersByReligion(religionName);
		return adharList;
	}

	@Override
	public List<Adhar> getAdharHolderslessthanBasicSalaryService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adhar> getAdharHoldersLowToHighService() {
		List<Adhar> lowtoHighList=adharDao.getAdharHoldersLowToHighDao();
		return lowtoHighList;
	}

	@Override
	public List<Adhar> getAdharHoldersHighToLow() {
		List<Adhar> highToLowList=adharDao.getAdharHoldersHighToLow();
		return  highToLowList;
	}

	@Override
	public List<Adhar> incrementedAdharHoldersService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adhar> getAdharHoldersBelongsToTheState(String stateName) {
		List<Adhar> adharList = adharDao.getAdharHoldersBelongsToAndhraPradesh(stateName);
		return adharList;
	}

	public static double taxCalulater(double income) {
		Adhar adhar = new Adhar();

		double incrementationBasedOnIncome = 0;
		double deductionBasedOnIncome = 0;

		if (adhar.getIncome() <= 500000) {
			double incrementedIncome = income * 0.30;
			double afterIncrementation = income + incrementedIncome;
			incrementationBasedOnIncome = incrementedIncome + afterIncrementation;
			adhar.setIncome(incrementationBasedOnIncome);

		}
		else if (adhar.getIncome() > 500000 && adhar.getIncome() <= 100000) {
			double deductionsAmount = income * 0.10;
			deductionBasedOnIncome = income - deductionsAmount;
			adhar.setIncome(deductionBasedOnIncome);

		}
		else if (adhar.getIncome() > 1000000 && adhar.getIncome() <= 3000000) {
			double deductionsAmount = income * 0.20;
			deductionBasedOnIncome = income - deductionsAmount;
			adhar.setIncome(deductionBasedOnIncome);
		}
		else if (adhar.getIncome() > 3000000) {
			double deductionsAmount = income * 0.40;
			deductionBasedOnIncome = income - deductionsAmount;
			adhar.setIncome(deductionBasedOnIncome);

		}
		if (adhar.getIncome() <= 500000)
			return incrementationBasedOnIncome;
		else
			return deductionBasedOnIncome;

	}

	@Override
	public Adhar updateAdharService(Adhar adhar) {
		Adhar adharr =adharDao.updateAdharDao(adhar);
		return adharr;
	}

}
