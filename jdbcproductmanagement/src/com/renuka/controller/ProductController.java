package com.renuka.controller;
import java.util.List;
import java.util.Scanner;

import com.renuka.dto.Manifacturer;
import com.renuka.dto.Product;
import com.renuka.service.ProductService;
import com.renuka.service.ProductServiceImpl;
import com.renuka.testquery.TestQuery;

public class ProductController {
	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		System.out.println("Enter the action you wannt ot perform");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add product");
		System.out.println("2.Select product by id");
		System.out.println("3.Select product by name");
		System.out.println("4.Select All products ");
		System.out.println("5.Select All products by type");
		System.out.println("6.Select all product by price low to high");
		System.out.println("7.Select all product by price high to low");
		int choice = sc.nextInt();
//		private int productId;
//		private String productName;
//		private String productPrice;
//		private String prouctType;
//		private Manifacturer manifacture;
//		private String manifactureName;
//		private String manifactureLocation;
//		private long manifactureLicence;
//		private double weight;
		switch(choice) {
		case 1 : System.out.println("Enter product Details ");
		         Product product = new Product();
		         Manifacturer manifacturer = new Manifacturer();
		         System.out.println("Enter prouduct id");
		         product.setProductId(sc.nextInt());
		         System.out.println("Enter proudct name");
		         product.setProductName(sc.next());
		         System.out.println("Enter proudct price");
		         product.setProductPrice(sc.nextDouble());
		         System.out.println("Enter prouduct type");
		         product.setProuctType(sc.next());
		         System.out.println("Enter Manifacturer name");
		         manifacturer.setManifactureName(sc.next());
		         System.out.println("Enter Manifacturer location");
		         manifacturer.setManifactureLocation(sc.next());
		         System.out.println("Enter manifacturer licence ");
		         manifacturer.setManifactureLicence(sc.nextLong());
		         product.setManifacture(manifacturer);
		         System.out.println("Enter product weight");
		         product.setWeight(sc.nextDouble());
		         productService.saveProductService(product);
		     	break;
		case 2 : System.out.println("Enter the product id");
	             int productId = sc.nextInt();
		        Product selectedProductId = productService.selectProductByIdService(productId);
		        System.out.println(selectedProductId);
		        break;
		case 3: System.out.println("Enter the product name");
		        String productName=sc.next();
		        Product selectProductName=productService.selectProductByNameService(productName);
		        System.out.println(selectProductName);
		        break;
		case 4:
			System.out.println("Selected all products");
			List<Product> proudctList = productService.selectAllProductService();
			for (Product prd : proudctList) {
				System.out.println(prd);
			}
			break;
		case 5:
			System.out.println("Select all products by its type");
			System.out.println("Enter the type of product");
			String type = sc.next();
			List<Product> pdList = productService.selectAllProductByTypeService(type);
			for (Product pd : pdList) {
				System.out.println(pd);
			}
			break;
		case 6:
			System.out.println("select all products by price low to high");
			List<Product> pdPriceList = productService.selectAllProductByPriceLowToHighService();
			for (Product pd : pdPriceList) {
				System.out.println(pd);
			}
			break;
		case 7:
			System.out.println("select all products by price high to low");
			List<Product> pdHightToLowList = productService.selectAllProductByPriceHightToLowService();
			for (Product pd : pdHightToLowList) {
				System.out.println(pd);
			}
			break;
		case 8:
			System.out.println("delete product by id");
			System.out.println("Enter the product id");
			int Id = sc.nextInt();
			productService.deleteProductByIdService(Id);
			break;
		case 9:
			System.out.println("Do you want to update from, find the products below");
			List<Product> allProudctList = productService.selectAllProductService();
			for (Product prd : allProudctList) {
				System.out.println(prd);
			}
			System.out.println("enter the product number you want to update");
			int modifyProductId  = sc.nextInt();
			Product modifyingProduct = productService.selectProductByIdService(modifyProductId);
			System.out.println(modifyingProduct);
			System.out.println("Enter the productname you wish to update");
			String newName = sc.next();
			modifyingProduct.setProductName(newName);
			System.out.println("Enter the product price you wish to update");
			double newPrice = sc.nextDouble();
			modifyingProduct.setProductPrice(newPrice);
			Product modifiedProduct = productService.updateProductService(modifyingProduct);
			System.out.println(modifiedProduct);
			
			break;

		         
		}
	}

}



