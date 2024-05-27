package com.renuka.service;

import java.util.List;

import com.renuka.dao.ProductDao;
import com.renuka.dao.ProductDaoImpl;
import com.renuka.dto.Product;

public class ProductServiceImpl implements ProductService{


	ProductDao productDao = new ProductDaoImpl();

	@Override
	public void saveProductService(Product product) {
		// calculate the GST on product price and save it.
		double actualPrice = product.getProductPrice();
		double gstPrice = gstCalculator(actualPrice);
		product.setProductPrice(gstPrice);
		productDao.saveProductDao(product);

	}

	private double gstCalculator(double actualPrice) {
		double gst = actualPrice * 0.12;
		double gstPrice = actualPrice + gst;
		return gstPrice;

	}

	@Override
	public Product selectProductByIdService(int productId) {
		Product product = productDao.selectProductByIdDao(productId);
		double gstPrice = product.getProductPrice();
		double finalDiscountedPrice = discountPriceCalculator(gstPrice);
		product.setProductPrice(finalDiscountedPrice);
		return product;
	}

	private double discountPriceCalculator(double gstPrice) {
		double discountPrice = gstPrice * 0.20;
		double finalPrice = gstPrice - discountPrice;

		return finalPrice;
	}

	@Override
	public Product selectProductByNameService(String productName) {
		Product product = productDao.selectProductByNameDao(productName);
		double prdPrice = product.getProductPrice();
		double disPrice = discountPriceCalculator(prdPrice);
		product.setProductPrice(disPrice);
		return product;
	}

	@Override
	public List<Product> selectAllProductService() {
		List<Product> prdList = productDao.selectAllProductDao();
		for (Product prd : prdList) {
			double prdPrice = prd.getProductPrice();
			double disPrice = discountPriceCalculator(prdPrice);
			prd.setProductPrice(disPrice);
		}
		return prdList;
	}

	@Override
	public List<Product> selectAllProductByTypeService(String productType) {
		List<Product> prdList = productDao.selectAllProductByTypeDao(productType);
		for (Product prd : prdList) {
			double prdPrice = prd.getProductPrice();
			double disPrice = discountPriceCalculator(prdPrice);
			prd.setProductPrice(disPrice);
		}
		return prdList;
	}

	@Override
	public List<Product> selectAllProductByPriceLowToHighService() {
		List<Product> prdList = productDao.selectAllProductByPriceLowToHighDao();
		for (Product prd : prdList) {
			double prdPrice = prd.getProductPrice();
			double disPrice = discountPriceCalculator(prdPrice);
			prd.setProductPrice(disPrice);
		}
		return prdList;
		}

	@Override
	public List<Product> selectAllProductByPriceHightToLowService() {
		List<Product> prdList = productDao.selectAllProductByPriceHightToLowDao();
		for (Product prd : prdList) {
			double prdPrice = prd.getProductPrice();
			double disPrice = discountPriceCalculator(prdPrice);
			prd.setProductPrice(disPrice);
		}
		return prdList;
	}

	@Override
	public void deleteProductByIdService(int productId) {
		productDao.deleteProductByIdDao(productId);

	}

	@Override
	public Product updateProductService(Product product) {
		double gstPrice = gstCalculator(product.getProductPrice());
	product.setProductPrice(gstPrice);
	Product updatedproduct = productDao.updateProductDao(product);
		return updatedproduct;
	}

}
