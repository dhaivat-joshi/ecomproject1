package com.ecommerece.commn.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class invoice_status_code {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int invoice_code;
	private String status_description;
	public int getInvoice_code() {
		return invoice_code;
	}
	public void setInvoice_code(int invoice_code) {
		this.invoice_code = invoice_code;
	}
	public String getStatus_description() {
		return status_description;
	}
	public void setStatus_description(String status_description) {
		this.status_description = status_description;
	}
	

}
