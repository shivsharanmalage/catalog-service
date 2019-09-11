package com.codebyshiv.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebyshiv.entities.Product;
import com.codebyshiv.exceptions.ProductNotFoundException;
import com.codebyshiv.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	
	//@GetMapping("")
	@RequestMapping("")
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
	
	
	 //@GetMapping("/{code}") - Annotation for mapping HTTP GET requests onto specific handlermethods. 
	 @RequestMapping("/{code}")
	 public Product productByCode(@PathVariable String code) {
	        return productService.findProductByCode(code)
	                .orElseThrow(() -> new ProductNotFoundException("Product with code ["+code+"] doesn't exist"));
	    }

}
