package com.renuka.testquery;

import com.renuka.dto.Aadhar;


public class TestQuery {

	public void testProduct(Aadhar aadhar) {
		
		String insertAadharQuery = "insert into Aadhar values(" + 
				aadhar.getAadharId() + ",'" +
				aadhar.getAadharCardHolderName() + "',"+  
                aadhar.getAddress().getVillage() + "','" +
                aadhar.getAddress().getMondal() + "','" +
                aadhar.getAddress().getDistrict() + "','" +
                aadhar.getAddress().getState() + "','" +
                aadhar.getAddress().getPincode() + "','" +
                aadhar.getIncome() + ",'" +
                aadhar.getMobilenumber() + ",'" +
                aadhar.getAge() + ",'" +
               ")";
		       System.out.println(insertAadharQuery);
	}


}
