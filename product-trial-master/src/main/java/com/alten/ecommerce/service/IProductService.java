package com.alten.ecommerce.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.alten.ecommerce.entities.Product;

public interface IProductService {
	
	public List<Product> getAllProducts();
	public Product getProductById(Long id);
	//public Product createProduct(Product product);
	public ResponseEntity<Product> createProduct(Product product);
	//public void deleteProduct(Long id);
	public ResponseEntity<Map<String, Boolean>> deleteProduct(Long id);
	//public Product updateProduct(Long id, Product product);
	public ResponseEntity<Product> updateProduct(Long id, Product product);
	
}
