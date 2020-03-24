package com.company;

public class Bassist extends Musician {
    public Bassist(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String makeMusic() {
        return "some bass voices";
    }
}
