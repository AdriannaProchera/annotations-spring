package pl.sda.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.configuration.PersonConfiguration;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;

public class AnnotationConfigurationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PersonConfiguration.class);

        PersonService ps = ac.getBean("personService", PersonServiceImpl.class);

        ps.add(new Person(1,"Jan", "Kowalski"));
        System.out.println(ps.getById(1));

    }
}
