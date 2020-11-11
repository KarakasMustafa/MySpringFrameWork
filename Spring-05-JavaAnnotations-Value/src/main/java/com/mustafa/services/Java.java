package com.mustafa.services;


import com.mustafa.interfaces.Course;
import com.mustafa.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course{

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    // @Autowired
   // @Component
    private ExtraSessions extraSessions;

   // @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: ");
    }
}
