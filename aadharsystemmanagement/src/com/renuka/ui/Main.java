package com.renuka.ui;



public class Main {
//	public static double taxCalulater(double income) {
//		TaxCalulater txx = new TaxCalulater();
//		double incrementedIncome;
//		double  addingIncrementation = 0;
//		double afterDeduction=0;
//
//		if (txx.getIncome() <= 500000) {
//			incrementedIncome = income * 0.30;
//			double afterIncrementation = income + incrementedIncome;
//			 addingIncrementation = incrementedIncome + afterIncrementation;
//			
//
//		} else if (txx.getIncome() > 500000 && txx.getIncome() <= 1000000) {
//			double deductionsAmount = income * 0.10;
//			 afterDeduction = income - deductionsAmount;
//			
//
//		} else if (txx.getIncome() > 1000000 && txx.getIncome() <= 3000000) {
//			double deductionsAmount = income * 0.20;
//			 afterDeduction = income - deductionsAmount;
//			
//		}
//		if (txx.getIncome() > 3000000) {
//			double deductionsAmount = income * 0.40;
//			 afterDeduction = income - deductionsAmount;
//			
//		}
//		if(txx.getIncome()>=50000)
//		return addingIncrementation ;
//		else
//			return afterDeduction;
//		return afterDeduction;

//	}
	public static int  taxCalculater(int income) {
		int result=0;
		int res=0;
		if(income<10000) {
			result =income+2000;
		}
		else if(income>10000&&income<=20000) {
			 res =income+3000;
		}
		else if(income>=25000)
			res=income+4000;
		if(income<10000)
		return result;
		else 
			return res;
		
		
		
	}

	public static void main(String[] args) {
		int rr=taxCalculater(25000);
		System.out.println(rr);

	}
}
