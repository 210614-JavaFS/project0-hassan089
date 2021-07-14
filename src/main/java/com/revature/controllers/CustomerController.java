package com.revature.controllers;

import java.util.List;
import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.services.CustomerService;

public class CustomerController {
	
	private static CustomerService customerService = new CustomerService();
	private static Scanner scan = new Scanner(System.in);
	
	
	public void customerMenu() {
		System.out.println("What would you like to do with your Customers? \n"
				+ "1. See all Customers. \n"
				+ "2. See one Customer. \n"
				+ "3. Add a new Customer. \n"
				+ "4. Return to the previous menu.");
		
		String response = scan.nextLine();
		
		switch(response) {
		case "1":
			showAllCustomers();
			break;
		case "2":
			showOneCustomer();
			break;
		case "3":
			addCustomer();
			break;
		default:
			return;
		}
	}
	
	private void addCustomer() {
		System.out.println("What is the name of the Customer that you'd like to create?");
		String knownas = scan.nextLine();
		System.out.println("What is the amount that the Customer would like to do their transaction with?");
		String transaction = scan.nextLine();
		System.out.println("What is the street address of the Customer you would like to create?");
		String first = scan.nextLine();
		System.err.println("What is the city of the Customer you would like to create?");
		String last = scan.nextLine();
		System.err.println("What is the region of the Customer you would like to create?");
		String tot_funds = scan.nextLine();
		System.err.println("What is the zipcode of the Customer you would like to create?");
		
		Customer customer = new Customer(knownas, transaction, first, last, tot_funds);
		
		if(customerService.addCustomer(customer)) {
			System.out.println("Your Customer was added.");
		}else {
			System.out.println("Something went wrong, you can try again.");
		}
	}

	private void showOneCustomer() {
		System.out.println("What is the name of the Customer that you would like to see?");
		String response = scan.nextLine();
		Customer customer = customerService.getCustomer(response);
		if(customer!=null) {
			System.out.println(customer);
		}else {
		System.out.println("That is not a valid Customer name, try again.");
		showOneCustomer();
		}
	}

	public void showAllCustomers() {
		List<Customer> Customers = customerService.getAllCustomers();
		
		for(Customer h:Customers) {
			System.out.println(h);
		}
	}


}
