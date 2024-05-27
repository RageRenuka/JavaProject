package com.renuka.threads;

public class Bank_1 extends Thread {
	
	private  Bank bank;
	
	public Bank_1(Bank bank) {
		this.bank=bank;
	}
	public void setBank(Bank bank)
	{
		this.bank=bank;
	}
	public Bank getBank() {
		return this.bank;
	}
@Override
public void run() {
	for(int i=0;i<10;i++) {
		bank.accountOpertion(500, "withdraw");
	}
	//System.out.println(bank.getName()+" balance: "+bank.getBalance());
}
	
}
