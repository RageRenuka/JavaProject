package com.renuka.ui;

import java.util.Comparator;

import come.renuka.dto.Order;

public class TypePriceLowToHighComparator implements Comparator<Order>{

	

	@Override
	public int compare(Order o1, Order o2) {
		if(o1.getoPrice()<o2.getoPrice())
			return -1;
		else if (o1.getoPrice()>o2.getoPrice())
			return 1;
		else
		return 0;
	}

}
