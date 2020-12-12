package com.mustafa.entity;


import javax.persistence.*;

@Entity // Entity adds Car table to DB, We will need to create an id
@Table(name = "Cars")  // this annotation lets us input a different name than class name(Which will be table name in DB)
public class Car {

    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private int id;

    private String make;
    private String model;

}
