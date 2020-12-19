package com.mustafa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    private Long id;

    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String state;
    private String zipcode;

}
