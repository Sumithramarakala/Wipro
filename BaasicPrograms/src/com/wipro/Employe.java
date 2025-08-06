package com.wipro;

/*import java.util.Scanner;


class Employe {
	public static void main(String[] args) {
    	
    	
    	Scanner scanner=new Scanner(System.in);
    	int batchSize = scanner.nextInt();
    	Employe[] emp=new Employe[batchSize];

    private int id;
    private String name;
    private String position;
    private double salary;

    // Constructor, getters, and setters
    public Employe(int id, String name, String position, double salary) {
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



            while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Update Employee by ID");
            System.out.println("5. Delete Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

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
    	int count=0;
    	
    	
        
    }

    private static void viewEmployees() {
       
    }

    private static void searchEmployeeByName() {
    	Scanner scanner=new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine().toLowerCase();
        for (Employee employe : employees) {
            if (employe != null && employe.getName().toLowerCase().contains(name)) {
                System.out.println("Employee found: " + employe.getName());
            }
        }
    }

    private static void updateEmployeeById() {
     
    }

    private static void deleteEmployeeById() {
        
    }
}*/

import java.util.Scanner;
import java.lang.String;

//Create an employee class (id,name ,position and salary) 
//then create an array of employee objects and then
//* create a menu driven program  to add , view, search by 
//name(where string contains , ignore case),
//* Update employee by ID , delete employee by ID and then exit
//* 
//* also use some of string operations like .equalsIngnoreCase , 
//.contains , .toLowerCase for search and .trim for input cleaning.

public class Employe 
{
	int id;
	String name;
	String position;
	long salary;
	
	static int companysize=1;
	static Employe[] emp= new Employe[companysize];
	static int count=0;
	
	//created constructor for Employee Class
	Employe(int id,String name,String position,long salary)
	{
		this.id=id;
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}


	//Function to display the Employee Details
	public static void Add()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your ID: ");
		int id=sc.nextInt();
		System.out.println("Enter your Name: ");
		String name=sc.next();
		System.out.println("Enter your Position: ");
		String position=sc.next();
		System.out.println("Enter your Salary: ");
		long salary=sc.nextInt();
		System.out.println("Details added");
		
		emp[count++] = new Employe(id,name,position,salary);
		//count++;
		
	}
	
	public static void Update()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID to update");
		int id=sc.nextInt();
		for(int i=0;i<companysize;i++)
		{
			if (emp[i].id==id)
			{
				System.out.println("Enter New Name: ");
				emp[i].name=sc.next();
				System.out.println("Enter your Position: ");
				emp[i].position=sc.next();
				System.out.println("Enter your Salary: ");
				emp[i].salary=sc.nextInt();
				System.out.println("Details Updated");
			}
		}
		
	}
	
	public static void View()
	{
		
		for(int i=0;i<companysize;i++)
		{
			System.out.println("ID : "+emp[i].id);
			System.out.println("Name : "+emp[i].name);
			System.out.println("Position : "+emp[i].position);
			System.out.println("Salary : "+emp[i].salary);
			
		}
	}
	public static void Search()
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name to search");
		String nameSearch=sc.next().toLowerCase();
		for(int i=0;i<companysize;i++)
		{
			if(emp[i].name.contains(nameSearch))
			{
				emp[i].View();
			}
		}
	}
	
	public static void Delete()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID to be deleted");
		int givenid=sc.nextInt();
		for(int i=0;i<companysize;i++)
		{
			if(emp[i].id==givenid)
			{
				emp[i]=null;
			}
			else {
				System.out.println("ID not found");
			}
		}
	}
	public static void Exit()
	{
		System.exit(0);
	}

}
