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

        people.add(new Person(++PEOPLE_COUNT, "Balin", 178, "balin@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Dwalin", 169, "dwalin@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Oin", 167, "oin@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Gloin", 158, "gloin@email.com"));
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

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person personUpdated) {
        Person personNotUpdated = show(id);
        personNotUpdated.setName(personUpdated.getName());
        personNotUpdated.setAge(personUpdated.getAge());
        personNotUpdated.setEmail(personUpdated.getEmail());
    }

    public void delete(int id) {
        people.remove(id - 1);
    }
}
