package com.project.dao;

import java.util.List;

import com.project.model.Customer;

public interface CustomerDao {

	void saveCustomer(Customer customer);
	List<Customer> getCustomers();
}
