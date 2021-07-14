package com.revature;

import java.util.Scanner;

import com.revature.controllers.CustomerController;



public class Driver {
	
	private static CustomerController customerController = new CustomerController();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the TriState Information API:");
		
		System.out.println("What would you like to do? \n"
				+ "1. See Customers. \n"
				+ "2. See Employees. \n"
				+ "3. See Admins. \n"
				+ "4. Exit the application.");
//		response = scan.nextLine();

		String response = scan.nextLine();
		
		while (!response.equals("4")) {
			if(response.equals("1")) {
				//TODO
				customerController.customerMenu();
					
			}else if(response.equals("2")) {
				
			}else if(response.equals("3")) {
				
			}else {
				System.err.println("That is not a valid input. Try again.");
				System.out.println("What would you like to do? \n"
						+ "1. See Customers. \n"
						+ "2. See Employees. \n"
						+ "3. See Admins. \n"
						+ "4. Exit the application.");
				response = scan.nextLine();
				
			}
		}
		System.out.println("You have exited the application. \n");
	}

}
