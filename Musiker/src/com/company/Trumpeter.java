package com.company;

public class Trumpeter extends Musician {

    public Trumpeter(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String makeMusic() {
        return "some trumpet voices";
    }
}


