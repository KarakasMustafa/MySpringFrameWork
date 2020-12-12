package com.mustafa.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity // Entity adds Car table to DB, We will need to create an id
@Table(name = "Cars")  // this annotation lets us input a different name than class name(Which will be table name in DB)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {

    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    private String make;
    private String model;

    public Car(String make, String model) {  // created this for not passing an id manually using AllArgsConstructor
        this.make = make;
        this.model = model;
    }
}
