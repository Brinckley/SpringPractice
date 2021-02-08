package com.brinkley.spring.dao;

import com.brinkley.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Balin"));
        people.add(new Person(++PEOPLE_COUNT, "Dwalin"));
        people.add(new Person(++PEOPLE_COUNT, "Oin"));
        people.add(new Person(++PEOPLE_COUNT, "Gloin"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        for (Person person : people) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }
}