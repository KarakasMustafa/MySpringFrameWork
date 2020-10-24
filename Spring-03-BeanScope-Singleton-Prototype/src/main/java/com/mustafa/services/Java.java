package com.mustafa.services;

import com.mustafa.interfaces.Course;

public class Java implements Course {




    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+20);
    }
}
