package com.mustafa.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    private String firstName;  // in DB column name will be first_name (camel case relation)
    private String lastName;
    private String email;

}
