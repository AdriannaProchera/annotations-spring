package pl.sda.validator;

import pl.sda.model.Person;

public class PersonValidator {

    public boolean isValid(Person person) {

        if (person.getId() == null
                || person.getName() == null
                || person.getSurname() == null) {
            return false;
        }
        return true;
    }
}
