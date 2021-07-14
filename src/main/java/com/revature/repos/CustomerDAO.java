package com.revature.repos;

import java.util.List;

import com.revature.models.Customer;

public interface CustomerDAO {
	
	public List<Customer> findAll();
	public Customer findByName(String name);
	public boolean updateCustomer(Customer customer);
	public boolean addCustomer(Customer customer);
	
	

}

