package com.example.java8.interfaces;

import com.example.java8.interfaces.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Oro on 6/26/2016.
 */
public class PredicateLambda {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Oro", 45));
        people.add(new Person("Mary", 10));
        people.add(new Person("Mark", 70));
        people.add(new Person("James", 20));

        Predicate<Person> predicate = (person) -> person.getAge() > 50;

        people.forEach(p -> {
            if(predicate.test(p)){
                System.out.println(p);

            }
        });


    }

}
