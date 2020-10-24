package com.mustafa.services;

import com.mustafa.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

public class MockInterviewHours implements ExtraSessions {

    public int getHours() {
        return 0;
    }
}
