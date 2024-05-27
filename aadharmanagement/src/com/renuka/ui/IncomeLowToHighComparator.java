package com.renuka.ui;

import java.util.Comparator;

import com.renuka.dto.Aadhar;

public class IncomeLowToHighComparator  implements Comparator<Aadhar>{

	@Override
	public int compare(Aadhar a1, Aadhar a2) {
		if(a1.getIncome()<a2.getIncome())
			return -1;
		else if (a1.getIncome()>a2.getIncome())
			return 1;
		else
		return 0;
	}

	

}
