package com.mustafa.services;

import com.mustafa.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("API is not set yet");
    }
}
