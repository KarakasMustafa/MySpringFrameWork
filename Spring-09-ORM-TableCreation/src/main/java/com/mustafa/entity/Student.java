package com.mustafa.entity;


import com.mustafa.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

    @Column(columnDefinition = "DATE")
    private LocalDate localDate;
    @Column(columnDefinition = "TIME")
    private LocalTime localTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;


    @Enumerated(EnumType.STRING) // if we dont put this annotation, it takes gender as integer
    private Gender gender;

    public Student(String firstName, String lastName, String email, String city, Date birthDate,
                   Date birthTime, Date birthDateTime, LocalDate localDate, LocalTime localTime,
                   LocalDateTime localDateTime, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.birthDate = birthDate;
        this.birthTime = birthTime;
        this.birthDateTime = birthDateTime;
        this.localDate = localDate;
        this.localTime = localTime;
        this.localDateTime = localDateTime;
        this.gender = gender;
    }
}
