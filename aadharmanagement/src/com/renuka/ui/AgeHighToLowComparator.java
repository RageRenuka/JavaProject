package com.renuka.ui;

import java.util.Comparator;

import com.renuka.dto.Aadhar;

public class AgeHighToLowComparator implements Comparator<Aadhar> {

	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		if(o1.getAge()<o2.getAge())
			return 1;
		else if (o1.getAge()>o2.getAge())
			return -1;
		else
     return 0;
	}

	
}
