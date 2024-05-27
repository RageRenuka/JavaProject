package com.renuka.ui;

import java.util.Comparator;

import com.renuka.dto.Adhar;



public class LowToHighIncome implements Comparator<Adhar> {

	@Override
	public int compare(Adhar o1, Adhar o2) {
		if(o1.getIncome()<o2.getIncome())
			return -1;
		else if(o1.getIncome()>o2.getIncome())
			return 1;
		return 0;
	}

	


}
