package com.example.java8.streams;


import com.example.java8.streams.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));


		int sum = people.stream().mapToInt(p -> p.getAge()).sum();

		System.out.println("Total of ages:" + sum);

		OptionalDouble average = people.stream().mapToInt(
				person -> person.getAge()
		).average();

		if(average.isPresent()){
			System.out.println("Average: + " + average.getAsDouble());
		}else
		{
			System.out.println("Average is not found.");
		}






						
	}
	
}