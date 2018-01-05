package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CustomerDao;
import com.project.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
		@Autowired
		private CustomerDao customerDao;
		public void saveCustomer(Customer customer) {
			// TODO Auto-generated method stub
			customerDao.saveCustomer(customer);
			
		}
		public List<Customer> getCustomers() {
			// TODO Auto-generated method stub
			return customerDao.getCustomers();
		}
}
