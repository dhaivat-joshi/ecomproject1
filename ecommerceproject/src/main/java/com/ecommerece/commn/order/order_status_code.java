package com.ecommerece.commn.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class order_status_code {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_sid;
	private String order_string_discription;
	public int getO_sid() {
		return o_sid;
	}
	public void setO_sid(int o_sid) {
		this.o_sid = o_sid;
	}
	public String getOrder_string_discription() {
		return order_string_discription;
	}
	public void setOrder_string_discription(String order_string_discription) {
		this.order_string_discription = order_string_discription;
	}
	

}
