package com.renuka.ui;

import java.util.Comparator;

import com.renuka.dto.Aadhar;

public class IncomeHighToLowComparator  implements Comparator<Aadhar>{

	@Override
	public int compare(Aadhar p1, Aadhar p2) {
		if(p1.getIncome()<p2.getIncome())
			return 1;
		else if (p1.getIncome()>p2.getIncome())
			return -1;
		else
		return 0;
	}

}
