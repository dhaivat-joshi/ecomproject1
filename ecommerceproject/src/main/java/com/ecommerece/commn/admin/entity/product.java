package com.ecommerece.commn.admin.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prod_id;
	private String prod_name;
	private int prod_amount;
	private int prod_size;
	private String prod_color;
	@OneToOne(cascade = CascadeType.ALL)
	private categories categories;
	
	public product()
	{
		
	}
	public product(int prod_id, String prod_name, int prod_amount, int prod_size, String prod_color,
			com.ecommerece.commn.admin.entity.categories categories) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_amount = prod_amount;
		this.prod_size = prod_size;
		this.prod_color = prod_color;
		this.categories = categories;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_amount() {
		return prod_amount;
	}
	public void setProd_amount(int prod_amount) {
		this.prod_amount = prod_amount;
	}
	public int getProd_size() {
		return prod_size;
	}
	public void setProd_size(int prod_size) {
		this.prod_size = prod_size;
	}
	public String getProd_color() {
		return prod_color;
	}
	public void setProd_color(String prod_color) {
		this.prod_color = prod_color;
	}
	public categories getCategories() {
		return categories;
	}
	public void setCategories(categories categories) {
		this.categories = categories;
	}
	
	
}
