package com.oops;

class Cloth extends Product implements IDiscountable{

	

	public Cloth(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscount() {   //it is defined in the IDiscount interface
		// TODO Auto-generated method stub
		
		return price*0.18;
	}

	public void Show() {
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("DiscountPrice: "+getDiscount());
		
		// TODO Auto-generated method stub
		
	}
	
}

public class HybridInheritance {
	public static void main(String[] args) {
		Cloth c=new Cloth("Sumi",5000);
		c.Show();
		
	}

}
