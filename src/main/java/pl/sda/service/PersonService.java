package pl.sda.service;

import pl.sda.model.Person;

public interface PersonService {

    void add(Person person);

    Person getById(Integer id);

}
