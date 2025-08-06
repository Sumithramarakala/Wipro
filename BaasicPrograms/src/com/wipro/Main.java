package com.wipro;

import java.util.Scanner;

class Employ {
    private int id;
    private String name;
    private String position;
    private double salary;

    // Constructor, getters, and setters
    public Employ(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Main {
    private static Employ[] employees = new Employ[10];
    private static int count = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Update Employee by ID");
            System.out.println("5. Delete Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployeeByName();
                    break;
                case 4:
                    updateEmployeeById();
                    break;
                case 5:
                    deleteEmployeeById();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private static void addEmployee() {
    	if(count<employees.length) {
    		System.out.println("Enter the employee ID: ");
    		int id=scanner.nextInt();
    		System.out.println("enter employee name: ");
    		String name=scanner.nextLine().trim();
    		System.out.println("Enter the employee position: ");
    		String position=scanner.nextLine().trim();
    		System.out.println("Enter the employee salary: ");
    		double salary=scanner.nextInt();
    		employees[count]=new Employ(id,name,position,salary);
    		count++;
    		System.out.println("Added successfully");
    		
    	}else {
    		System.out.println("You cannot add the employee");
    	}
        
    }

    private static void viewEmployees() {
    	if(count==0) {
    		System.out.println("No employees to display");
    	}else {
    		System.out.println("employee list");
    		for(int i=0;i<count;i++) {
    			System.out.println(employees[i].toString());
    		}
    	}
       
    }

    private static void searchEmployeeByName() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine().toLowerCase();
        for (Employ employee : employees) {
            if (employee != null && employee.getName().toLowerCase().contains(name)) {
                System.out.println("Employee found: " + employee.getName());
            }
        }
    }

    private static void updateEmployeeById() {
    	System.out.println("Enter Id to update");
    	int id=scanner.nextInt();
        
    }

    private static void deleteEmployeeById() {
        
    }
}
