package com.renuka.threads;

public class Bank_2 extends Thread {
	
 private   Bank bank;
	
	public Bank_2(Bank bank) {
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
			bank.accountOpertion(500, "deposit");
		}
		//System.out.println(bank.getName()+" balance:"+bank.getBalance());
	}
}
