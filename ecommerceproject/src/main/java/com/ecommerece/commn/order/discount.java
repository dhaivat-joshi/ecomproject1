package com.ecommerece.commn.order;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ecommerece.commn.admin.entity.product;

@Entity
public class discount {
	@Id
	private int d_id;
	@OneToOne(cascade=CascadeType.ALL)
	private product product;
	private int per;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
	

}
