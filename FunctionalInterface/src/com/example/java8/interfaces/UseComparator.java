package com.example.java8.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Oro on 6/26/2016.
 */
public class UseComparator {

    public static void main(String args[]){

        List<String> strings = new ArrayList<String>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        //Simple case-sensitive sort operation
        Collections.sort(strings);
        System.out.println("Simple sort");
        for(String str: strings){
            System.out.println(str);
        }

        Comparator<String> comparator = (s1, s2) -> {
            return s1.compareToIgnoreCase(s2);
        };

        Collections.sort(strings, comparator);



//        //Case-insensitive sort with an anonymous class
//        Collections.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String str1, String str2) {
//                return str1.compareToIgnoreCase(str2);
//            }
//        });
        System.out.println("Sort with comparator");
        for(String str: strings){
            System.out.println(str);
        }

    }

}
