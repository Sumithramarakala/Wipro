package com.company.springcore.annotationbasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.company.springcore.annotationbeans.Customer;

import java.util.Scanner;

@Configuration 
@ComponentScan(basePackages = "com.company.springcore.xmlbasedconfig,com.company.springcore.annotationbeans")
public class AppConfig {
//	@Bean
//	public  Customer customer() {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Customer id is: ");
//		int id=sc.nextInt();
//		System.out.println("Customer name is: ");
//		String name=sc.next();
//		System.out.println("Customer salary is: ");
//		double salary=sc.nextDouble();
//		
//		return  new Customer(id,name,salary);
//		
//	}

}
