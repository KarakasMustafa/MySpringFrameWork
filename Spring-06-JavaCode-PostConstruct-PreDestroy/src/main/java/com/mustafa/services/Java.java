package com.mustafa.services;

import com.mustafa.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours : 30");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }
}
