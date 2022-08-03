package com.journaldev.mvcpattern.service;

import com.journaldev.mvcpattern.model.Person;
import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    List<Person> getAllPersons();
}
