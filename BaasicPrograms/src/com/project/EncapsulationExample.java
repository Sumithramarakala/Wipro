package com.project;

/*
class Employe{
	private int id;
	private String name;
	private double salary;
public Employe(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
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
		this.name = name.trim();
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>5000) {
			System.out.println("Salary should be 5000");
		}else {
			this.salary=salary;
			System.out.println("");
		}
		//this.salary = salary;
	}
	

void display() {
	System.out.println("Id: "+id);
	System.out.println("Name: "+name);
	System.out.println("Salary: "+salary);
	
	
}
}
public class EncapsulationExample {
	public static void main(String[] args) {
		Employe emp=new Employe(2,"sumi",4567);
		Employe emp1=new Employe(2,"sumi",67899);
		
		emp.display();
		emp1.display();
		
		
	}

}
*/



 class Employee {

	private int id;
	private String name;
	private double salary;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name.trim();
	}
	
	public void setSalary(double salary) {
		if(salary > 50000) {
			System.out.println("Salary should be less than 50000");
			System.exit(0);
			
		}
		else {
			this.salary = salary;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}}
	class EncapsulationExample{
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Sofiya");
		employee.setSalary(60000);
		System.out.println("employee Id :" + employee.getId() + "Employee NAme : "+ employee.getName() +" Employee salary : "+ employee.getSalary());
		
		
		
	}
	
	
	
	
}

