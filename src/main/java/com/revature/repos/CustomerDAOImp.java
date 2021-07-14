package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Customer;
import com.revature.utils.ConnectionUtil;

public class CustomerDAOImp implements  CustomerDAO{

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customers";
			
			Statement statement = conn.createStatement();
			
			//What is my statement going to give me back when I run it?
			ResultSet result = statement.executeQuery(sql);
			
			
			//Convert this ResultSet into something useful
			List<Customer> list = new ArrayList();
			
			
			//ResultSets have a cursor similarly to Scanners or other other I/O classes.
			while(result.next()) {
				Customer customer = new Customer(); {
				customer.setKnownas(result.getString("known_as"));
				customer.setTransaction(result.getString("transaction"));	
				customer.setFirst(result.getString("first"));
				customer.setLast(result.getString("last"));
				customer.setTot_funds(result.getString("tot_funds"));
				list.add(customer);
				}
			}
			
			return list;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Customer findByName(String name) {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customers WHERE customer_name = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			//This is where SQL injection is checked for.
			statement.setString(1, name);
			
			//What is my statement going to give me back when I run it?
			ResultSet result = statement.executeQuery();
			
			Customer customer = new Customer(); 
			
			
			//ResultSets have a cursor similarly to Scanners or other other I/O classes.
			while(result.next()) {
				
				customer.setKnownas(result.getString("known_as"));
				customer.setTransaction(result.getString("transaction"));	
				customer.setFirst(result.getString("first"));
				customer.setLast(result.getString("last"));
				customer.setTot_funds(result.getString("tot_funds"));
				}
		
			return customer;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCustomer(Customer customer) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO customers (customer_name, customer_st_add, customer_city, customer_region, customer_zip)" + "VALUES (?,?,?,?,?);";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			int index = 0;
			statement.setString(++index, customer.getKnownas());
			statement.setString(++index, customer.getTransaction());
			statement.setString(++index, customer.getFirst());
			statement.setString(++index, customer.getLast());
			statement.setString(++index, customer.getTot_funds());
			
			statement.execute();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	
}
