package com.Function;

import java.util.ArrayList;
import java.util.List;

public class Source {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        
       
        people.add(new Person("Alex", "alex@example.com"));
        people.add(new Person("Ava", "ava@example.com"));
        people.add(new Person("stella", "stella@example.com"));
        
        people.forEach(System.out::println); 
    }
}