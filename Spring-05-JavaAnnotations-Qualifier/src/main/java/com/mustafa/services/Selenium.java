package com.mustafa.services;

import com.mustafa.interfaces.Course;
import com.mustafa.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSessions extraSessions;
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " +extraSessions.getHours());
    }
}
