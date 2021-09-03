package pl.sda.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.dao.PersonDao;
import pl.sda.dao.impl.PersonDaoMemoryImpl;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;
import pl.sda.validator.PersonValidator;

@Configuration
public class PersonConfiguration {

    //nazwa metody - nazwa beana
    @Bean
    public PersonDao personDaoMemory(){
        return new PersonDaoMemoryImpl();
    }
    @Bean
    public PersonValidator personValidator(){
        return new PersonValidator();
    }
    @Bean
    public PersonService personService(){
        PersonServiceImpl personService = new PersonServiceImpl(personDaoMemory());
        personService.setValidator(personValidator());
        return personService;
    }
}
