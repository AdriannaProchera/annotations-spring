package pl.sda.dao.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoMemoryImpl implements PersonDao {

    private List<Person> personList = new ArrayList<>();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public Person getById(Integer id) {

        return personList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(); //NoSuchElementException jeśli nie ma obiektu w Optional
    }
}
