package com.example.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class CountItems {
	public static void main(String args[]){

		System.out.println("Creating list");
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			strings.add("Item " + i);
		}
		
		strings.stream()
				.parallel()
			.forEach(str -> System.out.println(str));

		long count = strings.stream().count();
		System.out.println("Count : " + count);
	
	}
	
}