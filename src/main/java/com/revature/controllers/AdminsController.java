//package com.revature.controllers;
//
//import java.util.List;
//import java.util.Scanner;
//
//import com.revature.models.Admins;
//import com.revature.services.AdminsService;
//
//public class AdminsController {
//	
//	private static AdminsService adminsService = new AdminsService();
//	private static Scanner scan = new Scanner(System.in);
//	
//	
//	public void adminsMenu() {
//		System.out.println("What would you like to do with your Admins? \n"
//				+ "1. See all Admins. \n"
//				+ "2. See one Admin. \n"
//				+ "3. Add a new Admin. \n"
//				+ "4. Return to the previous menu.");
//		
//		String response = scan.nextLine();
//		
//		switch(response) {
//		case "1":
//			showAllAdmins();
//			break;
//		case "2":
//			showOneAdmin();
//			break;
//		case "3":
//			addAdmin();
//			break;
//		default:
//			return;
//		}
//	}
//	
//	private void addAdmin() {
//		System.out.println("What is the name of the Admin that you'd like to create?");
//		String fullname = scan.nextLine();
//		System.out.println("What is the work title of the Admin that you'd like to create?");
//		String role = scan.nextLine();
//		System.out.println("What is the salary of the Admin you would like to create?");
//		String salary = scan.nextLine();
//		System.err.println("What is the transaction amount of the Admin you would like to create?");
//		String amount = scan.nextLine();
//		System.err.println("What is the total funds of the Admin you would like to create?");
//		String tot_funds = scan.nextLine();
//		
//		
//		if(adminsService.addAdmins(admins)) {
//			System.out.println("Your Admins was added.");
//		}else {
//			System.out.println("Something went wrong, you can try again.");
//		}
//	}
//
//	private void showOneAdmin() {
//		System.out.println("What is the name of the Admin that you would like to see?");
//		String response = scan.nextLine();
//		Admins admins = adminsService.getAdmins(response);
//		if(admins!=null) {
//			System.out.println(admins);
//		}else {
//		System.out.println("That is not a valid Admin name, try again.");
//		showOneAdmin();
//		}
//	}
//
//	public void showAllAdmins() {
//		List<Admins> Admins = AdminsService.getAllAdmins();
//		
//		for(Admins h:Admins) {
//			System.out.println(h);
//		}
//	}
//
//
//}
