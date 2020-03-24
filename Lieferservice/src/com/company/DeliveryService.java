package com.company;

public class DeliveryService {
    private String car;
    private String brand;
    private String fuel;
    private String licensePlate;
    private Person driver;
    private int postcode;
    private String city;
    private String roadInklHouseNumber;
    private String telefonNumber;

    public DeliveryService(String car, String brand, String fuel, String licensePlate, Person driver) {
        this.car = car;
        this.brand = brand;
        this.fuel = fuel;
        this.licensePlate = licensePlate;
        this.driver = driver;
    }
    public double priceDelivery(double sum) {
        double price = 2;
        if(getPostcode() == 6840) {
            if (sum < 30) {
                price = 5;
            }
        }
        else if (getPostcode() == 6841 || getPostcode() == 6844 || getPostcode() == 6842 || getPostcode() == 6845) {
            if (sum < 40) {
                price = 8;
            }
        }
        else if (getPostcode() == 6850 || getPostcode() == 6890 || getPostcode() == 6832 || getPostcode() ==6836 ||
                getPostcode() ==6812 || getPostcode() == 6800 || getPostcode() == 6835 || getPostcode() == 6830 || getPostcode() == 6833) {
            if (sum < 60) {
                price = 12;
            }
        }
        else {
            if (sum < 60) {
                price = 28;
            } else {
                price = 10;
            }
        }
        return price;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRoadInklHouseNumber(String roadInklHouseNumber) {
        this.roadInklHouseNumber = roadInklHouseNumber;
    }

    public Person getDriver() {
        return driver;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getRoadInklHouseNumber() {
        return roadInklHouseNumber;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }
}
