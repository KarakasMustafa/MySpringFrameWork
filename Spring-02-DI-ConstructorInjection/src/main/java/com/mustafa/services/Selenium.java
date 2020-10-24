package com.mustafa.services;

import com.mustafa.interfaces.Course;

public class Selenium implements Course {

    OfficeSessions officeHours;
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+(10 + officeHours.getHours()));
    }
}
