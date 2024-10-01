package com.alten.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alten.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
