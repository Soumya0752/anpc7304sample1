package com.ems1;

import java.util.Scanner;

import com.ems1.entity.Employee;
import com.ems1.service.EmployeeService;
import com.ems1.serviceImpl.EmployeeServiceImpl;

public class AllOperations 
{
	static EmployeeService employeeService=new EmployeeServiceImpl();
	
	static Scanner sc=new Scanner(System.in);
	
	static Employee EmployeeUserInput()
	{
		sc.nextLine();
		System.out.println("Enter EmployeeID");
		String employeeId=sc.nextLine();
		
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter Email");
		String email=sc.nextLine();
		
		return new Employee(employeeId, firstName, lastName, gender, email);
	}
	
	public static void employeeOperations()
	{
		System.out.println("1.Insert Employee Details");
		System.out.println("2.Update EMployee Details");
		System.out.println("3.Delete Employee Details");
		System.out.println("4.Get all employee details");
		System.out.println("5.Get employee details based on id");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Employee employee=EmployeeUserInput();
			employeeService.createEmployee(employee);
			System.out.println("Employee details inserted successfully");
			break;
			
		}
	}
}
