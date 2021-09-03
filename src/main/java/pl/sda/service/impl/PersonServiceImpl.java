package pl.sda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.sda.dao.PersonDao;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.validator.PersonValidator;

public class PersonServiceImpl implements PersonService {
    @Qualifier("personDaoMemory")
    @Autowired
    private PersonDao personDao;
    @Autowired
    private PersonValidator validator;

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
