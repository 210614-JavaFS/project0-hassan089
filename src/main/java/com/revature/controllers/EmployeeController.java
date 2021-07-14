//package com.revature.controllers;
//
//import java.util.List;
//import java.util.Scanner;
//
//import com.revature.models.Employee;
//import com.revature.services.EmployeeService;
//
//public class EmployeeController {
//	
//	private static EmployeesService employeesService = new EmployeesService();
//	private static Scanner scan = new Scanner(System.in);
//	
//	
//	public void employeesMenu() {
//		System.out.println("What would you like to do with your Employees? \n"
//				+ "1. See all Employees. \n"
//				+ "2. See one Employee. \n"
//				+ "3. Add a new Employee. \n"
//				+ "4. Return to the previous menu.");
//		
//		String response = scan.nextLine();
//		
//		switch(response) {
//		case "1":
//			showAllEmployees();
//			break;
//		case "2":
//			showOneEmployee();
//			break;
//		case "3":
//			addEmployee();
//			break;
//		default:
//			return;
//		}
//	}
//	
//	private void addEmployee() {
//		System.out.println("What is the home name of the Employee that you'd like to create?");
//		String homename = scan.nextLine();
//		System.out.println("What is the address of the Employee?");
//		String address = scan.nextLine();
//		System.out.println("What is the city the Employee lives in?");
//		String city = scan.nextLine();
//		System.err.println("What is the region of the Employee?");
//		String region = scan.nextLine();
//		System.err.println("What is the zip code of the Employee?");
//		String zip = scan.nextLine();
//		
//		
//		if(employeesService.addEmployees(employees)) {
//			System.out.println("Your Employee was added.");
//		}else {
//			System.out.println("Something went wrong, you can try again.");
//		}
//	}
//
//	private void showOneEmployee() {
//		System.out.println("What is the name of the Employee that you would like to see?");
//		String response = scan.nextLine();
//		Employees employees = EmployeeService.getEmployee(response);
//		if(employee!=null) {
//			System.out.println(employee);
//		}else {
//		System.out.println("That is not a valid Employee name, try again.");
//		showOneEmployee();
//		}
//	}
//
//	public void showAllEmployees() {
//		List<Employee> Employees = employeesService.getAllEmployees();
//		
//		for(Employee h:Employeess) {
//			System.out.println(h);
//		}
//	}
//
//
//}
//
