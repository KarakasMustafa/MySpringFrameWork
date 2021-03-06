package com.mustafa.services;

import com.mustafa.interfaces.Course;
import com.mustafa.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    private OfficeHours officeHours;
/*
    //Constructor Injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" + (30 + officeHours.getHours()));
    }
/*
    //Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */


}
