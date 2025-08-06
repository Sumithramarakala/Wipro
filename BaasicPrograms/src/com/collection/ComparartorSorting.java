package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products implements Comparator<Product>{
	String name;
	double price;
	double rating;
	public Products(String name, double price, double rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public int compareTo(Product o) {
		return Double.compare(this.price,o.price); //base on the price it will compare
		// if i give rate it will compare based on the rate
		
	}
	

	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	
	public int compare(Products p1,Products p2) {
		return Double.compare(p2.rating, p1.rating);
	}

	//@Override
	/*public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	class NameComparator implements Comparator<Products>
	{


	@Override
	public int compare(Products p1, Products p2) {
		// TODO Auto-generated method stub
		return p1.name.compareTo(p2.name);
	}



	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}

public class ComparartorSorting {
	public static void main(String[] args) {
		List<Products> pr=new ArrayList<>();
		pr.add(new Products("Laptop",50000,5));
		pr.add(new Products("Phone",20000,5));
		pr.add(new Products("Mouse",1000,5));
		pr.add(new Products("Tablet",60000,8));
		  // it will call the compareTo method
		
		//Collections.sort(pr,new );
		//Collections.sort(pr, new Comparator());
		System.out.println("Sorting elements by their price:  " +pr);
		//Collections.sort(pr, new NameComparator());
		
		for(Products p : pr)
		
		{
			System.out.println(p);
		}
	
		
		// For custom ordering you want to order by their name
		
		
		
	}

}


