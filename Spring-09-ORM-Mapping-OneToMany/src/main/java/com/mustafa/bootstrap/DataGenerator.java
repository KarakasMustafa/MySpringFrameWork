package com.mustafa.bootstrap;

import com.mustafa.entity.Address;
import com.mustafa.entity.Person;
import com.mustafa.repository.AddressRepository;
import com.mustafa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Mustafa","Kas");
        Person p3 = new Person("Nezar","Quno");


        Address a1 = new Address("King St","12345");
        Address a2 = new Address("Elm St","25687");
        Address a3 = new Address("Task St","03256");

    //    p1.setAddresses(Arrays.asList(a1,a2));      case 1

        personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);

    }
}
