package com.renuka.dao;

import java.util.List;

import com.renuka.dto.Product;

public interface ProductDao {
	public void saveProductDao(Product product);
	public Product selectProductByIdDao(int productId);
	public Product selectProductByNameDao(String productName);
	public List<Product> selectAllProductDao();
	public List<Product> selectAllProductByTypeDao(String productType);
	public List<Product> selectAllProductByPriceLowToHighDao();
	public List<Product> selectAllProductByPriceHightToLowDao();
	public void deleteProductByIdDao(int productId);
	public Product updateProductDao(Product product);

}
