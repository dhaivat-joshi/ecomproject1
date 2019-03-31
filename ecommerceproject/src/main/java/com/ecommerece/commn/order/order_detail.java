package com.ecommerece.commn.order;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ecommerece.commn.admin.entity.product;
import com.ecommerece.commn.customer.Customer_reg;

@Entity
public class order_detail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_id;
	@OneToOne(cascade=CascadeType.ALL)
	private Customer_reg customer;
	@OneToOne(cascade=CascadeType.ALL)
	private product product;
	@OneToOne(cascade=CascadeType.ALL)
	private discount discount;
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public Customer_reg getCustomer() {
		return customer;
	}
	public void setCustomer(Customer_reg customer) {
		this.customer = customer;
	}
	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
	}
	public discount getDiscount() {
		return discount;
	}
	public void setDiscount(discount discount) {
		this.discount = discount;
	}
	
	
	
	

}
