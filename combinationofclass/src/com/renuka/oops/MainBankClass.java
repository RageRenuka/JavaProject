package com.renuka.oops;

public class MainBankClass {

	public static void main(String[] args) {
		SBI s=new SBI("INDIAN", "Renuka","indian0000165", "renuka@indian.com","Active","india", 15600.000);
		s.above65age="elible for non Salaried people";
		s.interestratef=(float)10.25;
		s.maxage=60;
		s.minage=25;
		s.mobileNumber=98768765;
		Bank.accountdeatiles();
		s.typeOfCard="cariditecard";
		s.personalLonesdeatiles();
		s.personalLones(20);
	s.personalLonesdeatiles();
	Bank b=new Bank("ICICI", "SURESH", "icici09009175", "suresh@icici.com", "active", "india", "active",99999999, 90909990, 23000);
	b.accountdeatiels();
	b.country="india";
	b.mobileNumber=908798754;
	b.status="not Active";
	b.upiId="abc@sbi.com";
	b.hashCode();
	Bank.accountName="Sai Kumar";
	Bank.accountNumber=1111198658;
	Bank.balance=965000;
	Bank.ifsCode="hdfc0000123";
	Bank.accountdeatiles();
	
	ICICI c=new ICICI("icici", "Bibin", "bibin@icici.com", "not active", "india","fghj",23000);
	c.typeOfCard="debitecard";
	c.accounts();
	c.paymentCardType();
	c.paymentStatus("debitecard");
	Bank.accountdeatiles();

	}

}
