package com.stream;

import java.util.function.Supplier;

//it will produce or return the result without input ---t get()
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> randomNumbers = () -> Math.random();
		System.out.println("Random values are: "+randomNumbers);
		
		// TODO Auto-generated method stub

	}

}
