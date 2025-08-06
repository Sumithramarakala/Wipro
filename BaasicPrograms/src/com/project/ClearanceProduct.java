package com.project;

public class ClearanceProduct implements Discountable{
	
	private ClearanceProductData data = new ClearanceProductData();

	public ClearanceProduct(String name, double price) {
		super();
		this.data.name = name;
		this.data.price = price;
	}
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return data.price*0.50;
	}
	
	public void show()
	{
		
		System.out.printf("Clearance : %s | Price: Rs. %.2f | Discount: Rs. %.2f%n" ,data.name,data.price,calculateDiscount());  
	}
	
	
}
