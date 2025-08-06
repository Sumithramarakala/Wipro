package com.wipro;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) 
	{
		//Creating array for Employee
		
		Scanner sc= new Scanner(System.in);

		
		while(true)
		{
			
			
			System.out.println(" 1: add");
			System.out.println("Enter 2: view");
			System.out.println("Enter 3: update");
			System.out.println("Enter 4: search");
			System.out.println("Enter 5: delete");
			System.out.println("Enter 6: exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					Employe.Add();
					break;
				case 2:
					Employe.View();
					break;
				case 3:
					Employe.Update();
					break;
				case 4:
					Employe.Search();
					break;
				case 5:
					Employe.Delete();
					break;
				case 6:
					Employe.Exit();
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}
	}

}
