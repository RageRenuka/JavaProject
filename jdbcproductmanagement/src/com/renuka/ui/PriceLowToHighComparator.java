package com.renuka.ui;

import java.util.Comparator;

import com.renuka.dto.Product;

public class PriceLowToHighComparator  implements Comparator<Product> {

	

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProductPrice()<p2.getProductPrice())
			return -1;
		else if (p1.getProductPrice()>p2.getProductPrice())
			return 1;
		else
		return 0;
	}


}
