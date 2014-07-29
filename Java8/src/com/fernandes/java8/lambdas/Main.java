package com.fernandes.java8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// some simple lambda examples
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("James" , 15));
        persons.add(new Person("Tim"   , 44));
        persons.add(new Person("Alison", 22));
        persons.add(new Person("Brian" , 22));
        persons.add(new Person("Scooby", 15));
        persons.add(new Person("Mathew", 56));
        persons.add(new Person("Julie" , 44));
        persons.add(new Person("Nancy" , 56));
        persons.add(new Person("Maria" , 22));

        Map<Integer, List<Person>> byAge =
                persons.stream().collect(Collectors.groupingBy(Person::getAge));

        byAge.forEach((age, personGroup) -> {
            System.out.println("Age Group: " + age);

            personGroup.forEach((person) -> System.out.println(person.getName()));
        });
    }
}
