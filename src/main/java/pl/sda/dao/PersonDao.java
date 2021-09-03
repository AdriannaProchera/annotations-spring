package pl.sda.dao;

import pl.sda.model.Person;

public interface PersonDao {

    void add(Person person);

    Person getById(Integer id);

}
