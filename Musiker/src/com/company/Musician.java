package com.company;

public class Musician extends Artist{

    public Musician(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String makeMusic(){
        return "make some music";
    }
}
