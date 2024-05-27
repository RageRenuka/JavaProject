package com.renuka.service;

import java.util.List;

import com.renuka.dto.Product;

public interface ProductService {
	public void saveProductService(Product product);
	public Product selectProductByIdService(int productId);
	public Product selectProductByNameService(String productName);
	public List<Product> selectAllProductService();
	public List<Product> selectAllProductByTypeService(String productType);
	public List<Product> selectAllProductByPriceLowToHighService();
	public List<Product> selectAllProductByPriceHightToLowService();
	public void deleteProductByIdService(int productId);
	public Product updateProductService(Product product);

}
