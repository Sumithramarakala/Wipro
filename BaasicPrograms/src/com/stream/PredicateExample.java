package com.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//import java.awt.List;

public class PredicateExample {
	public static void main(String[] args) {
		List<String> words = List.of("Java","CSharp", "Python","C++");
		Predicate<String> isLong = s->s.length() > 2;
		List<String> longWords = words.stream().
				filter(isLong).
				collect(Collectors.toList());
		
		System.out.println("The longest words which are greater "
				+ "than 6 letters: "+longWords);

	}

}
