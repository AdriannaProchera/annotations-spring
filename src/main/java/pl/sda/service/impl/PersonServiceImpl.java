package pl.sda.service.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.validator.PersonValidator;

public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    private PersonValidator validator;

    //wstrzykiwanie przez konstruktor
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void add(Person person) {
        if (validator.isValid(person)) {
            personDao.add(person);
        }
    }

    @Override
    public Person getById(Integer id) {
        return personDao.getById(id);
    }

    public void setValidator(PersonValidator validator) {
        this.validator = validator;
    }
}
