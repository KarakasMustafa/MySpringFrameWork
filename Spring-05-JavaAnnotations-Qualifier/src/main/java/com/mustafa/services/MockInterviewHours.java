package com.mustafa.services;

import com.mustafa.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 9;
    }
}
