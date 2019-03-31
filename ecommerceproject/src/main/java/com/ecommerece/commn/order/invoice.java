package com.ecommerece.commn.order;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class invoice {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int invoice_number;
	@OneToOne(cascade=CascadeType.ALL)
	private order_status_code orderstatuscode;
	private int date;
	public int getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}
	public order_status_code getOrderstatuscode() {
		return orderstatuscode;
	}
	public void setOrderstatuscode(order_status_code orderstatuscode) {
		this.orderstatuscode = orderstatuscode;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
}
