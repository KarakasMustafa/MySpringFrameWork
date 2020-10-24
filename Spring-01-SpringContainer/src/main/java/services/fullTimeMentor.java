package services;

import interfaces.Mentor;

public class fullTimeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor is created!");
    }
}
