package com.revature.controllers;

import java.util.List;
import java.util.Scanner;

import com.revature.models.Home;
import com.revature.services.HomeService;

public class HomeController {
	
	private static HomeService homeService = new HomeService();
	private static Scanner scan = new Scanner(System.in);
	
	
	public void homeMenu() {
		System.out.println("What would you like to do with your homes? \n"
				+ "1. See all homes. \n"
				+ "2. See one home. \n"
				+ "3. Add a new home. \n"
				+ "4. Return to the previous menu.");
		
		String response = scan.nextLine();
		
		switch(response) {
		case "1":
			showAllHomes();
			break;
		case "2":
			showOneHome();
			break;
		case "3":
			addHome();
			break;
		default:
			return;
		}
	}
	
	private void addHome() {
		System.out.println("What is the name of the home that you'd like to create?");
		String name = scan.nextLine();
		System.out.println("What is the street address of the home you would like to create?");
		String address = scan.nextLine();
		System.err.println("What is the city of the home you would like to create?");
		String city = scan.nextLine();
		System.err.println("What is the region of the home you would like to create?");
		String region = scan.nextLine();
		System.err.println("What is the zipcode of the home you would like to create?");
		String zip = scan.nextLine();
		
		Home home = new Home(name, address, city, region, zip);
		
		if(homeService.addHome(home)) {
			System.out.println("Your home was added.");
		}else {
			System.out.println("Something went wrong, you can try again.");
		}
	}

	private void showOneHome() {
		System.out.println("What is the name of the home that you would like to see?");
		String response = scan.nextLine();
		Home home = homeService.getHome(response);
		if(home!=null) {
			System.out.println(home);
		}else {
		System.out.println("That is not a valid home name, try again.");
		showOneHome();
		}
	}

	public void showAllHomes() {
		List<Home> homes = homeService.getAllHomes();
		
		for(Home h:homes) {
			System.out.println(h);
		}
	}


}
