package com.mustafa.services;

import com.mustafa.MyApp;
import com.mustafa.interfaces.Course;
import com.mustafa.interfaces.ExtraSessions;

public class Java implements Course {
    OfficeSessions officeHours;

    ExtraSessions extraSessions;

    public Java(OfficeSessions officeHours) {
        this.officeHours = officeHours;
    }




    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+(20 + officeHours.getHours()));
    }
}
