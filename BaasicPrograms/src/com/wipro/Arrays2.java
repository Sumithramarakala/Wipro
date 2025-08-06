package com.wipro;
/*import java.util.Scanner;

public class Arrays2 {
	
	
	int id ;
	String name;
	int[] marks;
	
	
		public Arrays2() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructor
	public Arrays2(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void displayInfo()
	{
		System.out.println("Student Id :" + id);
		System.out.println("Student Name :" + name);
		System.out.println("Student Marks :" );
		for(int mark : marks)
		{
			System.out.print(mark + " ");
		}
		System.out.println("\n..");
		
		
	}

	//public class ArraysExample{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students you want to add in a Batch");
		int batchSize = sc.nextInt();
		Student[] students = new Student[batchSize];
		
		for(int i= 0 ; i<students.length ; i++)
		{
			System.out.println("Enter student Id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter student name: ");
			String name = sc.next();
			
			System.out.println("Enter no of subjects :");
			int n = sc.nextInt();
			int[] marks = new int[n];
			
			System.out.println("Enter marks for " + n + "subjects");
			for(int j=0;j<marks.length;j++)
			{
				System.out.println("Subject " + (j+1) + " : ");
				marks[j] = sc.nextInt();
			}
			
			students[i] = new Student(id,name,marks);
		}
		
		System.out.println("Students details are given below : " );
		for(Student s : students)
		{
			s.displayInfo();
		}
		sc.close();
	}

}*/


import java.util.Scanner;

public class Arrays2 {
    int id;
    String name;
    int[][] marks;

    public Arrays2(int id, String name, int[][] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students you want to add in a Batch");
        int batchSize = sc.nextInt();

        Arrays2[] students = new Arrays2[batchSize];

        for (int i = 0; i < batchSize; i++) {
            System.out.println("Enter student Id: ");
            int id = sc.nextInt();
            System.out.println("Enter student name: ");
            String name = sc.next();
            System.out.println("Enter no of subjects: ");
            int n = sc.nextInt();
            int[][] marks = new int[n][1];
            System.out.println("Enter marks for " + n + " subjects");
            for (int j = 0; j < n; j++) {
                System.out.println("Subject " + (j + 1) + " : ");
                marks[j][0] = sc.nextInt();
            }
            students[i] = new Arrays2(id, name, marks);
        }

        System.out.println("Students details are given below: ");
        for (Arrays2 student : students) {
            student.displayInfo();
        }

        sc.close();
    }
}






