package com.mustafa.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentsFirstName") // this changes the column name in database
    private String firstName;  // in DB column name will be first_name (camel case relation)
    @Column(name = "studentLastName")
    private String lastName;
    @Column(name = "studentEmailAddress")
    private String email;

    @Transient
    private String city;


    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;




}
