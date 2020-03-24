package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String car;
    private String fuelOfCar;
    GasStationSearchEngine gasStationSearchEngine;

    public Person(String firstName, String lastName, String car, String fuelOfCar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
        this.fuelOfCar = fuelOfCar;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFuelOfCar() {
        return fuelOfCar;
    }
}
