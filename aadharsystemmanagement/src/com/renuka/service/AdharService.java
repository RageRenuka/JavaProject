package com.renuka.service;



import java.util.List;

import com.renuka.dto.Adhar;



public interface AdharService {

	public  void saveAdharService(Adhar adhar) ;
	public Adhar getAdharByIdService(int adharId);
	public Adhar getAdharByNameService(String name);
	public void deleteAdharByIdService(int adharId);
	public List<Adhar> getAllAdharHolderDetilesService();
	public List<Adhar> getAdharHoldersByReligion(String religion);
	public List<Adhar> getAdharHolderslessthanBasicSalaryService();
	public List<Adhar> getAdharHoldersLowToHighService();
	public List<Adhar> getAdharHoldersHighToLow();
	public List<Adhar> incrementedAdharHoldersService();
	public List<Adhar> getAdharHoldersBelongsToTheState(String stateName);
	public Adhar updateAdharService(Adhar adhar);
	
	
	
	
	
	
	
		
	

}
