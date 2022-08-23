package com.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.model.Product;

@Repository
public class ProductDao {
	static List<Product> plist=new ArrayList<>();
	
	static {
		plist.add(new Product(1,"bag",89.90));
		plist.add(new Product(2,"box",89.90));
		plist.add(new Product(3,"table",89.90));
		
	}
	
	public List<Product> getAllProducts() {
		
		return plist;
	}
	
	public void addProduct(Product p) {
		plist.add(p);
	}
	
	

}
