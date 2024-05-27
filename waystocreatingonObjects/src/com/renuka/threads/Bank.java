package com.renuka.threads;

public class Bank {
	private int accountNo;
	private String name;
	private double balance;
	public Bank(int accountNo,String name,double balance) {
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public int getAccountNo() {
		return this.accountNo;
		
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
//	public static void deposit(double amount)
//	{
//		balance=balance+amount;
//	}
//	public static void withdraw(double amount)
//	{
//		balance=balance-amount;
//	}
	public synchronized void accountOpertion(double amount,String opertionType) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String currentThreadName=Thread.currentThread().getName();
		System.out.println(currentThreadName);
		if(opertionType.equals("withdraw")) {
			this.balance=this.balance-amount;
		}else if(opertionType.equals("desposit")) {
			this.balance=this.balance+amount;
		}
	}
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
