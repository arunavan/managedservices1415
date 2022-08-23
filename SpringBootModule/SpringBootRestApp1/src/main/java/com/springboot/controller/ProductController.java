package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.ProductDao;
import com.springboot.model.Product;

@RestController
@RequestMapping(value="/api")
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	// method1
	//@RequestMapping(value="/product",method=RequestMethod.GET)
	@GetMapping("/product")
	public List<Product> getProductDetails() {
		return  productDao.getAllProducts();
		
	}
	//@RequestMapping(value="/productwithcode",method=RequestMethod.GET)
	@GetMapping("/productwithcode")
	public String getProductDetailswithCode() {
		return "product details are here with code 001";
	}
	//@RequestMapping(value="/product",method=RequestMethod.POST)
	@PostMapping("/product")
	public String addProductDetails() {
		Product p=new Product(4,"pen",80.90);
		productDao.addProduct(p);
		return "inserted";
	}
	//@RequestMapping(value="/product",method=RequestMethod.PUT)
	@PutMapping("/product")
	public String updateProductDetails() {
		return "updated";
	}
	//@RequestMapping(value="/product",method=RequestMethod.DELETE)
	@DeleteMapping("/product")
	public String deleteProductDetails() {
		return "deleted";
	}
}
