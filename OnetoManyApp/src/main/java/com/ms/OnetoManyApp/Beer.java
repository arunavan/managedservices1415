package com.ms.OnetoManyApp;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Beer_Tab")
public class Beer {
	@Id
	private int beerId;
	private String beerName;
	@OneToMany(cascade=CascadeType.ALL,targetEntity=SideDish.class)
	@JoinTable(name="beer_dish")
	private Set <SideDish> dishes;
	
	public int getBeerId() {
		return beerId;
	}
	public void setBeerId(int beerId) {
		this.beerId = beerId;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public Set<SideDish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<SideDish> dishes) {
		this.dishes = dishes;
	}
	
	

}
