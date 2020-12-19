package com.mustafa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    private Long id;

    private String name;
    private int price;

}
