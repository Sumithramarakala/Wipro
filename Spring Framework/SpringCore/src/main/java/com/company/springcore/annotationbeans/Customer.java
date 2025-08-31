package com.company.springcore.annotationbeans;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class Customer {
	Scanner sc=new Scanner(System.in);
	private int id;
	private String name;
	private double salary;
	
	
	
//	public Customer(int id, String name, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
	
       


	public void welcomeCustomer()
	{
		
		System.out.println("Annotation Based Config File");
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
		System.out.println("Salary is:"+salary);
		
	}
	public Customer() {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Customer id is: ");
		this.id=sc.nextInt();
		System.out.println("Customer name is: ");
	this.name=sc.next();
		System.out.println("Customer salary is: ");
		this.salary=sc.nextDouble();

	}

}
