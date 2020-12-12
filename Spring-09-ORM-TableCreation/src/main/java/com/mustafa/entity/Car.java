package com.mustafa.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Entity adds Car table to DB, We will need to create an id
public class Car {

    @Id  // primary key
    private int id;

    private String make;
    private String model;

}
