package com.example.jpa.dto;

import com.example.jpa.entity.Customer;
 

 
public class OrderRequest {

    private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + ", getCustomer()=" + getCustomer() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
}
