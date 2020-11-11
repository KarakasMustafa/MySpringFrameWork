package com.mustafa.services;


import com.mustafa.interfaces.Course;
import com.mustafa.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
   // @Autowired
   // @Component
    private ExtraSessions extraSessions;

   // @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20+extraSessions.getHours()));
    }
}
