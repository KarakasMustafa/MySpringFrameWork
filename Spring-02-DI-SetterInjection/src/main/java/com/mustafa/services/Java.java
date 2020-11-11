package com.mustafa.services;

import com.mustafa.interfaces.Course;
import com.mustafa.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private ExtraSessions extraSessions;


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20+ extraSessions.getHours()));
    }
}
