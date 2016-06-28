package com.example.java8.interfaces;

import com.example.java8.interfaces.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Oro on 6/26/2016.
 */
public class StaticMethodReference {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Collections.sort(people, Person :: compareAges);

        people.forEach(person -> System.out.println(person));

    }
}
