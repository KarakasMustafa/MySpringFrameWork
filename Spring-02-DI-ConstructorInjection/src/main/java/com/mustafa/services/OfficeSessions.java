package com.mustafa.services;

import com.mustafa.interfaces.ExtraSessions;

public class OfficeSessions implements ExtraSessions {


    @Override
    public int getHours() {
        return 5;
    }
}
