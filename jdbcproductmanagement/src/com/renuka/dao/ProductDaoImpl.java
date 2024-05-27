package com.renuka.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import com.renuka.dto.Manifacturer;
import com.renuka.dto.Product;
import com.renuka.ui.ConnectionUtil;
import com.renuka.ui.PriceHighToLowComparator;
import com.renuka.ui.PriceLowToHighComparator;

public class ProductDaoImpl implements ProductDao {

//	private int productId;
//	private String productName;
//	private String productPrice;
//	private String prouctType;
//	private Manifacturer manifacture;
//	private String manifactureName;
//	private String manifactureLocation;
//	private long manifactureLicence;
//	private double weight;

	@Override
	public void saveProductDao(Product product) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt = connection.createStatement();
			String insertProductQuery = "insert into Product values(" 
			+ product.getProductId() + "," 
			+ "'"+ product.getProductName() + "'" + "," 
			+ product.getProductPrice() + "," 
			+ "'" + product.getProuctType() + "'" + "," 
			+ "'" + product.getManifacture().getManifactureName() + "'" + ","
			+ "'"+ product.getManifacture().getManifactureLocation() + "'"+ ","
			+ product.getManifacture().getManifactureLicence() + "," 
			+ product.getWeight() + ")";
			// insert into Product values
			// (101010,'groundnut',140.0,'food','dhathika','kadiri',323232,1000);

			stmt.execute(insertProductQuery);
			ConnectionUtil.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Product selectProductByIdDao(int productId) {
		Connection connection = ConnectionUtil.getConnection();
		Product dummyProduct = new Product();
		Manifacturer dummyManifacturer = new Manifacturer();
		try {
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from product where productId = " + productId;
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				int pId = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String productName = rs.getString(2);
				double productPrice = rs.getDouble(3);
				String productType = rs.getString(4);
				String mName = rs.getString(5);
				String mLocaiton = rs.getString(6);
				long mLicense = rs.getLong(7);
				double productWeight = rs.getDouble(8);
				dummyManifacturer.setManifactureName(mName);
				dummyManifacturer.setManifactureLocation(mLocaiton);
				dummyManifacturer.setManifactureLicence(mLicense);
				dummyProduct.setManifacture(dummyManifacturer);
				dummyProduct.setProductId(pId);
				dummyProduct.setProductName(productName);
				dummyProduct.setProductPrice(productPrice);
				dummyProduct.setProuctType(productType);
				dummyProduct.setWeight(productWeight);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dummyProduct;
	}

	@Override
	public Product selectProductByNameDao(String productName) {
		Connection connection = ConnectionUtil.getConnection();
		Product dummyProduct = new Product();
		Manifacturer dummyManifacturer = new Manifacturer();
		try {
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from product where productName = " + "'"+ productName +"'";
			// select * from product where productname = 'bat';
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				int pId = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String pName = rs.getString(2);
				double productPrice = rs.getDouble(3);
				String productType = rs.getString(4);
				String mName = rs.getString(5);
				String mLocaiton = rs.getString(6);
				long mLicense = rs.getLong(7);
				double productWeight = rs.getDouble(8);
				dummyManifacturer.setManifactureName(mName);
				dummyManifacturer.setManifactureLocation(mLocaiton);
				dummyManifacturer.setManifactureLicence(mLicense);
				dummyProduct.setManifacture(dummyManifacturer);
				dummyProduct.setProductId(pId);
				dummyProduct.setProductName(pName);
				dummyProduct.setProductPrice(productPrice);
				dummyProduct.setProuctType(productType);
				dummyProduct.setWeight(productWeight);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dummyProduct;
	
	}

	@Override
	public List<Product> selectAllProductDao() {
		Connection con = ConnectionUtil.getConnection();
		List<Product> prdList = new ArrayList<Product>();
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from Product");
			while(rs.next()) {
				Product dummyProduct = new Product();
				Manifacturer dummyManifacturer = new Manifacturer();
				int pId = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String pName = rs.getString(2);
				double productPrice = rs.getDouble(3);
				String productType = rs.getString(4);
				String mName = rs.getString(5);
				String mLocaiton = rs.getString(6);
				long mLicense = rs.getLong(7);
				double productWeight = rs.getDouble(8);
				dummyManifacturer.setManifactureName(mName);
				dummyManifacturer.setManifactureLocation(mLocaiton);
				dummyManifacturer.setManifactureLicence(mLicense);
				dummyProduct.setManifacture(dummyManifacturer);
				dummyProduct.setProductId(pId);
				dummyProduct.setProductName(pName);
				dummyProduct.setProductPrice(productPrice);
				dummyProduct.setProuctType(productType);
				dummyProduct.setWeight(productWeight);
				prdList.add(dummyProduct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prdList;
	}

	@Override
	public List<Product> selectAllProductByTypeDao(String productType) {
		Connection con = ConnectionUtil.getConnection();
		List<Product> prdList = new ArrayList<Product>();
		try {
			
			Statement stmt = con.createStatement();
			String selectQueryByType = "select * from product where producttype = " + "'"+ productType +"'";
			ResultSet rs =  stmt.executeQuery(selectQueryByType);
			while(rs.next()) {
				Product dummyProduct = new Product();
				Manifacturer dummyManifacturer = new Manifacturer();
				int pId = rs.getInt(1);
				// dummyProduct.setProductId(rs.getIn(1));
				//dummyProduct.setProductId(pId);
				String pName = rs.getString(2);
				double productPrice = rs.getDouble(3);
				String productType1 = rs.getString(4);
				String mName = rs.getString(5);
				String mLocaiton = rs.getString(6);
				long mLicense = rs.getLong(7);
				double productWeight = rs.getDouble(8);
				dummyManifacturer.setManifactureName(mName);
				dummyManifacturer.setManifactureLocation(mLocaiton);
				dummyManifacturer.setManifactureLicence(mLicense);
				dummyProduct.setManifacture(dummyManifacturer);
				dummyProduct.setProductId(pId);
				dummyProduct.setProductName(pName);
				dummyProduct.setProductPrice(productPrice);
				dummyProduct.setProuctType(productType1);
				dummyProduct.setWeight(productWeight);
				prdList.add(dummyProduct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prdList;
	}

	@Override
	public List<Product> selectAllProductByPriceLowToHighDao() {
		List<Product> prdList = selectAllProductDao();
		 Collections.sort(prdList, new PriceLowToHighComparator());
		return prdList;
	}

	@Override
	public List<Product> selectAllProductByPriceHightToLowDao() {
		List<Product> prdList = selectAllProductDao();
		 Collections.sort(prdList, new PriceHighToLowComparator());
		return prdList;
	}

	@Override
	public void deleteProductByIdDao(int productId) {
		Connection connection = ConnectionUtil.getConnection();
		Product dummyProduct = new Product();
		Manifacturer dummyManifacturer = new Manifacturer();
	
			try {
				Statement stmt = connection.createStatement();
				String deleteQuery = "delete from product where productId = " + productId;
				stmt.execute(deleteQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}



	@Override
	public Product updateProductDao(Product product) {
    Connection connection =  ConnectionUtil.getConnection();
    Statement stmt;
	try {
		stmt = connection.createStatement();
		 String updateQuery = "update Product set productname =" + "'" + product.getProductName()+ "'," +
				    "productprice = " + product.getProductPrice() + " where productid = " + product.getProductId();
				    System.out.println(updateQuery);
				    stmt.execute(updateQuery);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
		return selectProductByIdDao(product.getProductId());
	}

}
	