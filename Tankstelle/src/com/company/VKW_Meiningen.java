package com.company;

public class VKW_Meiningen extends Gas_Station {
    public VKW_Meiningen(int postcode, String city, String road, int houseNumber) {
        super(postcode, city, road, houseNumber);
    }

    @Override
    public String toString() {
        return "VKW Meiningen\n" + getPostcode() + " " + getCity() + "\n" + getRoad() + " " + getHouseNumber()+ "\n";
    }

    @Override
    public int getGasStationNumber() {
        return 5;
    }
}
