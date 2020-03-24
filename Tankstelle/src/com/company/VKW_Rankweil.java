package com.company;

public class VKW_Rankweil extends Gas_Station {
    public VKW_Rankweil(int postcode, String city, String road, int houseNumber) {
        super(postcode, city, road, houseNumber);
    }

    @Override
    public String toString() {
        return "VKW Rankweil\n" + getPostcode() + " " + getCity() + "\n" + getRoad() + " " + getHouseNumber()+ "\n";
    }

    @Override
    public int getGasStationNumber() {
        return 4;
    }
}
