package com.renuka.oops;

public class ICICI extends Bank{
String typeOfCard;

	public ICICI(String bankName, String accountName, String ifsCode, String upiId, String status,
			String country, double balance) {
		System.out.println(bankName+"\n"+accountName+"\n"+ifsCode+"\n"+upiId+"\n"+status+"\n"+country+"\n"+balance);
	}
	public void paymentStatus(String s) {
		if(status==s)
		{
		System.out.println("yes payment is successfully complited");
		}else {
			System.out.println("yes payment is Failed");
		}
	}
	public void accounts() {
		System.out.println("saving account ");
		System.out.println("salary account ");
	}
	public void paymentCardType() {
		System.out.println(typeOfCard);
	}

	
	

}
