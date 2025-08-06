package com.stream;

import java.util.function.Function;

//Here it takes one input(T) and return a result(R) 
public class FunctionalExample {
	public static void main(String[] args) {
		Function<String, Integer>toLength=s->s.length();
		System.out.println("Length of value is :"+toLength.apply("Sumithra"));
		
		
	}

}
