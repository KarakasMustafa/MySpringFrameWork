package com.mustafa.bootstrap;

import com.mustafa.entity.Address;
import com.mustafa.entity.Person;
import com.mustafa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Mustafa","Kas");
        Person p3 = new Person("Nezar","Quno");


        Address a1 = new Address("King St","12345");
        Address a2 = new Address("Elm St","25687");
        Address a3 = new Address("Task St","03256");


    }
}
