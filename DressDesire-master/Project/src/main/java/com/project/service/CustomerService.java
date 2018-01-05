package com.project.service;

import java.util.List;

import com.project.model.Customer;

public interface CustomerService {

	void saveCustomer(Customer customer);
	List<Customer> getCustomers();
}
