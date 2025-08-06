package com.collection;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
 
 private static List<Employe> list= new ArrayList<>();
 private static Scanner sc  = new Scanner(System.in);
 
 
 
 public static void main(String[] args) {
  while(true)
  {
   System.out.println("\n1.Add , 2.Delete , 3. Search , 4. View All,5.Adding position, 6.exit");
   int choice = sc.nextInt();
   switch(choice)
   {
   case 1  -> addEmployee();
   case 2 -> deleteEmployee();
   case 3 ->searchEmployee();
   case 4-> viewAll();
   case 5 ->addPosition();
   case 6 ->exit();
   
   }
  }
 }
 
 static void addEmployee() {
  
  System.out.println("Enter id  , Name , salary");
  int id=sc.nextInt();
  String name= sc.next();
  double salary = sc.nextDouble();
  list.add(new Employe(id,name,salary));
  
  
 }
 
 static void deleteEmployee() {
	 System.out.println("Enter ID to delete");
	 int id1=sc.nextInt();
	 boolean found = false;
	 
	 for(Employe e:list) {
	 if(id1 == e.getId()) {
		 list.remove(e);
		 System.out.println("Deleted Successfully");
		 found=true;
		 break;
	 }
	 
	 
	 }
	 if(!found) {
		 System.out.println("Employe id not found");
	 }
 }
 
 static void searchEmployee() {
	 int search=sc.nextInt();
	 boolean found=false;
	 for(Employe e:list) {
		 if(e.getId()==search) {
			 System.out.println("Id found");
			 found=true;
			 break;
		 }
	 }
	 if(!found) {
		 System.out.println("Employe found: "+search);
	 }
	 
 }
 static void viewAll() {
  System.out.println("Employee Data\n");
  for(Employe e: list) {
   System.out.println(e);
  }
 }
static void addPosition() {
	 
	 System.out.println("Enter the position where you want to add the employee:");
	 int position = sc.nextInt();
	 System.out.println("Enter id  , Name , salary");
	 int id=sc.nextInt();
	 String name= sc.next();
	 double salary = sc.nextDouble();
	 if(position>=0 && position<=list.size())
	 list.add(position , new Employe(id,name,salary));
	 else
		 System.out.println("Invalid Position");
	 
 }
static void exit() {
	System.exit(0);
}
 
 
 
 


}