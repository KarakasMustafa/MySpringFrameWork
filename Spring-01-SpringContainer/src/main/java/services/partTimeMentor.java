package services;

import interfaces.Mentor;

public class partTimeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor account is created!");
    }
}
