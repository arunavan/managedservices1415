package com.springboot.model;

public class Product {

	
	Integer id;
	String nmae;
	Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNmae() {
		return nmae;
	}
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product(Integer id, String nmae, Double price) {
		super();
		this.id = id;
		this.nmae = nmae;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", nmae=" + nmae + ", price=" + price + "]";
	}
	
}
