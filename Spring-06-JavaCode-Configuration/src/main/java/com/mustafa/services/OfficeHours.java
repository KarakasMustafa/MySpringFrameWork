package com.mustafa.services;

import com.mustafa.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 7;
    }
}
