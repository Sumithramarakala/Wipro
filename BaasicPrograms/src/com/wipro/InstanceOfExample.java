package com.wipro;

class Persons
{
}
 
class emp extends Persons
{
 
	void action()
	{
		System.out.println("Job");
	}
}
 
class stu extends Persons
{
 
	void action()
	{
		System.out.println("Study");
	}
}
 
// instanceof Keyword with Safe TypeCasting
public class InstanceOfExample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Persons p = new stu();
 
 
		if(p instanceof emp)
		{
			emp e = (emp)p; // safe downcast
			e.action();
		}
 
		else
		{
			//new Student();
 
			stu s = (stu)p;
			s.action();
 
		}
 
	}
 
}
