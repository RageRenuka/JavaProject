package com.renuka.testquery;

import com.renuka.dto.Product;



public class TestQuery {

	

		public void testProduct(Product product) {
			
			String insertProductQuery = "insert into Product values(" + 
	                product.getProductId() + ",'" +
	                product.getProductName() + "',"+
	                product.getProductPrice()+ ",'" +
	                product.getProuctType() + "','" +
	                product.getManifacture().getManifactureName() + "','" +
	                product.getManifacture().getManifactureLocation() + "',"+
	                product.getManifacture().getManifactureLicence() + "," +
	                product.getWeight() + ")";
			       System.out.println(insertProductQuery);
		}


	}


