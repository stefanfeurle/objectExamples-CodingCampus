package com.company;

public class Clarinetist extends Musician {
    public Clarinetist(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String makeMusic() {
        return "some clarinet voices";
    }
}
