package com.codebyshiv.entities;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column
	private String code;

	@Column
	private String name;
	private String description;
	private double price;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
