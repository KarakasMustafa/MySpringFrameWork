package com.mustafa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "regions")
public class Region extends BaseEntity{

    private String region;
    private String country;


   // private Employee employee;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
