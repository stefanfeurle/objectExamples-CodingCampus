package com.company;

public class Band {
    private String name;
    private Musician[] joinedMusicansArr = new Musician[50];
    private int musicansJoinedCounter = 0;

    public Band(String name) {
        this.name = name;
    }

    public void joinMusican(Musician musician) {
        joinedMusicansArr[musicansJoinedCounter] = musician;
        musicansJoinedCounter++;
    }

    public Musician[] getJoinedMusicansArr() {
        return joinedMusicansArr;
    }


    @Override
    public String toString() {
        return  name;
    }
}
