package com.renuka.ui;

import java.util.Comparator;

import com.renuka.dto.Aadhar;

public class AgeLowToHighComparator implements Comparator<Aadhar> {

	

	@Override
	public int compare(Aadhar a1, Aadhar a2) {
		if(a1.getAge()<a2.getAge())
			return 1;
		else if (a1.getAge()>a2.getAge())
			return -1;
		else
		return 0;
	}

}
