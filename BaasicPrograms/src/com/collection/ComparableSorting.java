package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
	String name;
	double price;
	double rating;
	public Product(String name, double price, double rating) {
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
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	
}

public class ComparableSorting {
	public static void main(String[] args) {
		List<Product> pr=new ArrayList<>();
		pr.add(new Product("Laptop",50000,5));
		pr.add(new Product("Phone",20000,5));
		pr.add(new Product("Mouse",1000,5));
		pr.add(new Product("Tablet",60000,8));
		Collections.sort(pr);  // it will call the compareTo method
		System.out.println("Sorting elements by their price:  " +pr);
		
		// For custom ordering you want to order by their name
		
		
		
	}

}
