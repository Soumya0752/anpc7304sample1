package com.ems1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void mainOperations()
	{
		System.out.println("1.Employee Details");
		System.out.println("2.Manager Details");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			AllOperations.employeeOperations();
			break;
			
		}
		
		
		
	}
    public static void main( String[] args )
    {
        mainOperations();
    }
}
