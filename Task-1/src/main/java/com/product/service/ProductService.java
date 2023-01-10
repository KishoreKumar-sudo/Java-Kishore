package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	//CRUD Operations
	
	//Create Product
	public void saveProduct(Product product) {
		productRepository.save(product);
	}
	
	//Get All Products
	public List<Product> getProducts(){
		return productRepository.findAll();
		//return productRepository.findById(null);
	}
	
	//update Product
	public void updateProduct (Product product) {
		productRepository.save(product);
	}
	
	//delete product
	public void deleteProduct(Integer id){
		productRepository.deleteById(id);
	}
	
}
