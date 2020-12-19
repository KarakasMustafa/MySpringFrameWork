package com.mustafa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cinema {

    @Id
    private Long id;

    private String name;
    private String sponsored_name;

}
