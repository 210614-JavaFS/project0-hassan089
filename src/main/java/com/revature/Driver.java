package com.revature;

import java.util.Scanner;

import com.revature.controllers.HomeController;

public class Driver {
	
	private static HomeController homeController = new HomeController();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the TriState Information API:");
		homeController.homeMenu();
		System.out.println("What would you like to do? \n"
				+ "1. See Customers. \n"
				+ "2. See Employees. \n"
				+ "3. Exit the application.");
//		response = scan.nextLine();

		String response = scan.nextLine();
		
		while (!response.equals("3")) {
			if(response.equals("1")) {
				//TODO
			}else if(response.equals("2")) {
				homeController.homeMenu();
				System.out.println("What would you like to do? \n"
						+ "1. See Customers. \n"
						+ "2. See Employees. \n"
						+ "3. Exit the application.");
				response = scan.nextLine();
			}else {
				System.err.println("That is not a valid input. Try again.");
				System.out.println("What would you like to do? \n"
						+ "1. See Customers. \n"
						+ "2. See Employees. \n"
						+ "3. Exit the application.");
				response = scan.nextLine();
				
			}
		}
		System.out.println("You have exited the application. \n");
	}

}
