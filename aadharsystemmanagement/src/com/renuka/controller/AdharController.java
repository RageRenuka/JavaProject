package com.renuka.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.renuka.dto.Address;
import com.renuka.dto.Adhar;
import com.renuka.dto.FamilyDetails;
import com.renuka.service.AdharServiceImpl;



public class AdharController {
	public static void main(String[] args) throws SQLException {
		AdharServiceImpl adharSevice = new AdharServiceImpl();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" 1. Save Adhar Detiles : ");
			System.out.println(" 2. Get adhar holder detiles by adhar Id : ");
			System.out.println(" 3. Get adhar holder detiles by adhar Name : ");
			System.out.println(" 4.Get all adhar holder detiles :: ");
			System.out.println(" 5.  Get adhar holder detiles based on their religion :");
			System.out.println(" 6.  Delete adahr detiles by Id : ");
			System.out.println(" 7. Get adhar holder detiles whoose income is less than 500000 : ");
			System.out.println(" 8. Income from low to high :   ");
			System.out.println(" 9. Income from high to low : ");
			System.out.println(" 10.Increment salary by 30% whoose salary is less than 500000 : ");
			System.out.println(" 11.Select adhar holder detiles  who belongs to AndhraPradesh:  ");
			System.out.println(" 12. Update adhar : ");
			int number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.println(" Enter Adhar Detiles : ");
				Adhar adhar = new Adhar();
				FamilyDetails fd = new FamilyDetails();
				Address address = new Address();
				System.out.println(" Enter Adhar Id: ");
				adhar.setAadharId(sc.nextDouble());
				System.out.println(" Enter adhar  holder name : ");
				adhar.setAadharCardHolderName(sc.next());
				System.out.println(" Enter Gender : ");
				adhar.setGender(sc.next().charAt(0));
				System.out.println(" Enter Mobile number : ");
				adhar.setMobilenumber(sc.nextLong());
				System.out.println(" Enter age : ");
				adhar.setAge(sc.nextInt());
				System.out.println(" Enter family detiles : ");

				System.out.println(" Enter Father Name : ");
				fd.setFatherName(sc.next());
				System.out.println(" Enter Mother Name : ");
				fd.setMotherName(sc.next());
				adhar.setFamilyDetailes(fd);
				System.out.println(" Enter Address of Adhar holder : ");

				System.out.println(" Enter state name : ");
				address.setStateName(sc.next());
				System.out.println(" Enter District name : ");
				address.setDistrictName(sc.next());
				System.out.println(" Enter Constuiency name : ");
				address.setConstituencyName(sc.next());
				System.out.println("Enter Mandal name : ");
				address.setMandalName(sc.next());
				System.out.println(" Enter Village name : ");
				address.setVillageName(sc.next());
				System.out.println(" Enter Street name : ");
				address.setStreetName(sc.next());
				System.out.println(" Enter house number :");
				address.setHouseNo(sc.nextInt());
				System.out.println(" Enter pincode : ");
				address.setPincode(sc.nextInt());
				adhar.setAddress(address);
				System.out.println(" Enter income  : ");
				adhar.setIncome(sc.nextDouble());
				System.out.println(" Enter religion : ");
				adhar.setReligion(sc.next());

				System.out.println(adhar);
				adharSevice.saveAdharService(adhar);
				break;
			case 2:
				System.out.println(" Please enter  Adhar Id : ");
				int adharId = sc.nextInt();
				Adhar adharSeletedById = adharSevice.getAdharByIdService(adharId);
				System.out.println(adharSeletedById);
				break;
			case 3:
				System.out.println(" Please enter  Adhar Name : ");
				String adharName = sc.next();
				Adhar adharSeletedByName = adharSevice.getAdharByNameService(adharName);
				System.out.println(adharSeletedByName);
				break;
			case 4:
				System.out.println(" Getting all Adhar holderdetiles :");
				List<Adhar> adharList = adharSevice.getAllAdharHolderDetilesService();
				for (Adhar ad : adharList) {
					System.out.println(ad);
				}
				break;
			case 5:
				System.out.println(" Please enter religion : ");
				String religionName = sc.next();
				List<Adhar> adharListBasedOnReligion = adharSevice.getAdharHoldersByReligion(religionName);
				for (Adhar add : adharListBasedOnReligion)
					System.out.println(add);
				break;
			case 6:
				System.out.println(" Please enter adahr id you want delete : ");
				int adharIDD = sc.nextInt();
				adharSevice.deleteAdharByIdService(adharIDD);
				System.out.println("Deleted");
				break;
			case 7:
				break;
			case 8:
				List<Adhar> lowToHighList = adharSevice.getAdharHoldersLowToHighService();
				for (Adhar ad : lowToHighList)
					System.out.println(ad);
				break;
			case 9:
				List<Adhar> HighToLow = adharSevice.getAdharHoldersHighToLow();
				for (Adhar ad : HighToLow)
					System.out.println(ad);
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				System.out.println(" Select the name want to update : ");
				String Name = sc.next();
				Adhar updatingAdhar = adharSevice.getAdharByNameService(Name);
				System.out.println(updatingAdhar);
				System.out.println(" Enter the  adharId you want to update : ");
				long updatedId = sc.nextLong();
				updatingAdhar.setAadharId(updatedId);
				System.out.println(updatingAdhar);
//	System.out.println(" Enter id you want update : ");
//	int updatedId=sc.nextInt();
//	updatingAdhar.setAdharId(updatedId);
//	System.out.println(" Enter the religion you want to update : ");
//	String updatedReligion=sc.next();
//	updatingAdhar.setReligion(updatedReligion);
				Adhar updatedAdhar = adharSevice.updateAdharService(updatingAdhar);
				System.out.println(updatedAdhar);

			}
		}
	}
}
