package com.stream;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> greeting =name->System.out.println("Hello" +name);
		greeting.accept("Sumi");

	}

}
