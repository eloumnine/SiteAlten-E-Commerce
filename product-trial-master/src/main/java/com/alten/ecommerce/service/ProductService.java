package com.alten.ecommerce.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alten.ecommerce.dao.ProductRepository;
import com.alten.ecommerce.entities.Product;

@Service

public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	/*
	 * @Override 
	 * public Product createProduct(Product product) { 
	 * 		return productRepository.save(product); 
	 * }
	 */
	
	@Override
	public ResponseEntity<Product> createProduct(Product product) {
		Product saveProduct = productRepository.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveProduct);
	}

	/*
	 * @Override 
	 * public void deleteProduct(Long id) {
	 * 		productRepository.deleteById(id); 
	 * }
	 */

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteProduct(Long id) {
		Product chercheProduct = productRepository.findById(id).orElse(null);
		productRepository.delete(chercheProduct);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	/*
	 * @Override 
	 * public Product updateProduct(Long id, Product product) { 
			 * Product chercheProduct = productRepository.findById(id).orElseThrow(()-> new
			 * ConfigDataResourceNotFoundException("Product not found with id !!"));
			 * 
			 * chercheProduct.setName(productDetails.getName());
			 * chercheProduct.setPrice(productDetails.getPrice());
			 * chercheProduct.setDescription(productDetails.getDescription());
			 * chercheProduct.setQuantity(productDetails.getQuantity());
			 * chercheProduct.setInventoryStatus(productDetails.getInventoryStatus());
			 * chercheProduct.setUpdatedAt(LocalDateTime.now());
			 * 
			 * return productRepository.save(existingProduct); }
	 */

	@Override
	public ResponseEntity<Product> updateProduct(Long id, Product product) {
		
		Product chercheProduct = productRepository.findById(id).orElse(null);
		
		chercheProduct.setName(product.getName());
		chercheProduct.setCategory(product.getCategory());
		chercheProduct.setPrice(product.getPrice());
		chercheProduct.setDescription(product.getDescription());
        chercheProduct.setQuantity(product.getQuantity());
        chercheProduct.setInventoryStatus(product.getInventoryStatus());
        
        
        final Product insertProduct = productRepository.save(chercheProduct);
		return ResponseEntity.ok(insertProduct);
   
	}
	

}
