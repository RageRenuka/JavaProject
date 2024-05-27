package com.renuka.controller;

import java.util.List;
import java.util.Scanner;

import com.renuka.dto.Aadhar;
import com.renuka.dto.Address;

import com.renuka.service.AadharService;
import com.renuka.service.AadharServiceImpl;


public class AadharController {

	public static void main(String[] args) {
		AadharService adharService=new AadharServiceImpl();
		System.out.println("Enter the action you wannt ot perform");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add aadhar");
		System.out.println("2.Select aadhar by id");
		System.out.println("3.Select Aadhar by name");
		System.out.println("4.Select All aadhars ");
		System.out.println("5.Select all aadhar by Income low to high");
		System.out.println("6.Select all aadhar by Income high to low");
		System.out.println("7.delete adharId");
		System.out.println("8.select Aadhar by District");
		System.out.println("9.Select all aadhar by Age low to high");
		System.out.println("10.Select all aadhar by Age high to low");
	
		int choice = sc.nextInt();

		switch(choice) {
		case 1 : System.out.println("Enter adhars Details ");
		         Aadhar aadhar=new Aadhar();
		         Address aadharaddress=new  Address();
		         System.out.println("Enter Aadhar id");
		         int aid=sc.nextInt();
		         aadhar.setAadharId(aid);
		         System.out.println("Enter aadharCardHolderName");
		         aadhar.setAadharCardHolderName(sc.next());
		         System.out.println("Enter AdharAddress village");
		         aadharaddress.setVillage(sc.next());
		         System.out.println("Enter AdharAddress mondal");
		         aadharaddress.setMondal(sc.next());
		         System.out.println("Enter AdharAddress District");
		         aadharaddress.setDistrict(sc.next());
		         System.out.println("Enter AdharAddress State");
		         aadharaddress.setState(sc.next());
		         System.out.println("Enter AdharAddress Pincode");
		         aadharaddress.setPincode(sc.nextInt());
		         System.out.println("Enter Aadhar income");
		         aadhar.setIncome(sc.nextDouble());
		         System.out.println("Enter Aadhar MobileNumber");
		         aadhar.setMobilenumber(sc.nextLong());
		         System.out.println("Enter Aadhar Age");
		         aadhar.setAge(sc.nextInt());
		         aadhar.setAddress(aadharaddress);
		         adharService.saveAadharService(aadhar);
		         break;
		case 2 : System.out.println("Enter the Aadhar id");
        int aadharId = sc.nextInt();
        Aadhar selectedaadharId = adharService.selectAadharByIdService(aadharId);
       System.out.println(selectedaadharId);
       break;
       
		case 3: System.out.println("Enter the Aadhar name");
        String aadharName=sc.next();
        Aadhar selectProductName=adharService.selectAadharByNameService(aadharName);
        System.out.println(selectProductName);
        break;
		case 4:
			System.out.println("Selected all adhars");
			List<Aadhar> aadharList1 = adharService.selectAllAadharService();
			for (Aadhar prd : aadharList1) {
				System.out.println(prd);
			}
			break;
		case 5:
			System.out.println("select all adhars by income low to high");
			List<Aadhar> aadharList = adharService.selectAllAadharByIncomeLowToHighService();
			for (Aadhar pd : aadharList) {
				System.out.println(pd);
			}
			break;
		case 6:
			System.out.println("select all adhars by income high to low");
			List<Aadhar> hightToLowList = adharService.selectAllAadharByIncomeHightToLowService();
			for (Aadhar pd : hightToLowList) {
				System.out.println(pd);
			}
			break;
		case 7:
			System.out.println("delete the addhar id");
			int aadharId2=sc.nextInt();
			adharService.deleteAadharById(aadharId2);
			break;
		case 8: System.out.println("Enter the Aadhar District ");
        String aadhardistritic=sc.next();
        Aadhar selectaadhardistritic=adharService.selectAadharByDistrictDao(aadhardistritic);
        System.out.println(selectaadhardistritic);
        break;
		case 9:
			System.out.println("select all adhars by Age low to high");
			List<Aadhar> aadharList12 = adharService.selectAllAadharByAgeLowToHighDao();
			for (Aadhar pd : aadharList12) {
				System.out.println(pd);
			}
			break;
		case 10:
			System.out.println("select all adhars by Age high to low");
			List<Aadhar> aadharList123 = adharService.selectAllAadharByAgeHightToLowDao();
			for (Aadhar pd : aadharList123) {
				System.out.println(pd);
			}
			break;
		
			
	}

	}
}
