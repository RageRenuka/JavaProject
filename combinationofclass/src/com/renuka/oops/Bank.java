package com.renuka.oops;

public class Bank {
	
	static String bankName;
	static String accountName;
	static String ifsCode;
	static String branchName;
	String upiId;
	String status;
	String country;
	static long accountNumber;
	long mobileNumber;
	static double balance;
	
	
	
	public int accountdeatiels()
	{
		return 0;
	}
	
	public Bank() {
		System.out.println("This is default construcore of Bank");
		}
	public Bank(String bankName, String accountName, String ifsCode, String branchName, String upiId, String status,
			String country, long accountNumber, long mobileNumber, double balance) {
		super();
		Bank.bankName = bankName;
		this.accountName = accountName;
		this.ifsCode = ifsCode;
		this.branchName = branchName;
		this.upiId = upiId;
		this.status = status;
		this.country = country;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}
	public static void accountdeatiles() {
		System.out.println(bankName+"\n"+accountName+"\n"+branchName+"\n"+ifsCode+"\n"+accountNumber+"\n"+balance);
		
	}
	
	public int hashCode() {
		int code=ifsCode.hashCode();
		System.out.println(code);
	    int code1=upiId.hashCode();
	    System.out.println(code1);
	    return code1;
		
	}
	
	
}
