package com.renuka.oops;

public class SBI extends ICICI{
	
	public SBI(String bankName, String accountName, String ifsCode, String upiId, String status, String country,
			double balance) {
		super(bankName, accountName, ifsCode, upiId, status, country, balance);
		// TODO Auto-generated constructor stub
	}
	int minage;
	int maxage;
	String above65age;
	float interestratef;
	
	

	public void paymentCardType() {
		System.out.println("This is SBI payment card type method");
		
		System.out.println(typeOfCard);
	}
	public void personalLones(int a) {
		
		if(minage>=18){
			System.out.println("this age is eligeble for PersonalLone");
		}else {
		System.out.println("this age is not eligeble for PersonalLone");
		}
	}
	public void personalLonesdeatiles() {
		System.out.println(minage+"\n"+maxage+"\n"+above65age+"\n"+interestratef);
		
	}
	
}
