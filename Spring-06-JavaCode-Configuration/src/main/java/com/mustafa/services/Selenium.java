package com.mustafa.services;

import com.mustafa.interfaces.Course;


public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours 22");
    }
}
