package com.renuka.dao;

import java.sql.SQLException;
import java.util.List;

import com.renuka.dto.Adhar;



public interface AdharDao {

	public  void saveAdharDao(Adhar adhar) throws SQLException ;
	public Adhar getAdharByIdDao(int adharId);
	public Adhar getAdharByNameDao(String name);
	public void deleteAdharByIdDao(int adharId);
	public List<Adhar> getAllAdharHolderDetilesDao();
	public List<Adhar> getAdharHoldersByReligion(String religion);
	public List<Adhar> getAdharHolderslessthanBasicSalaryDao();
	public List<Adhar> getAdharHoldersLowToHighDao();
	public List<Adhar> getAdharHoldersHighToLow();
	public List<Adhar> incrementedAdharHoldersDao();
	public List<Adhar>  getAdharHoldersBelongsToAndhraPradesh(String stateName);
	public Adhar updateAdharDao(Adhar adhar);
}
