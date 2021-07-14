package com.revature.services;

import java.util.List;

import com.revature.models.Customer;
import com.revature.repos.CustomerDAO;
import com.revature.repos.CustomerDAOImp;

public class CustomerService {
	
	private static CustomerDAO CustomerDao = new CustomerDAOImp();

	
	public List<Customer> getAllCustomers() {
		return CustomerDao.findAll();
}
	
	public Customer getCustomer(String name) {
		return CustomerDao.findByName(name);
	}
	
	public boolean addCustomer(Customer customer) {
		return CustomerDao.addCustomer(customer);
	}
}
