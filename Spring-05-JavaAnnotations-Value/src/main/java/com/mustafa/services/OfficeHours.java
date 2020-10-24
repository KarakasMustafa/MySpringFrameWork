package com.mustafa.services;

import com.mustafa.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions{

    public int getHours() {
        return 9;
    }
}
