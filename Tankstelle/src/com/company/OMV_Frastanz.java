package com.company;

public class OMV_Frastanz extends Gas_Station {
    public OMV_Frastanz(int postcode, String city, String road, int houseNumber) {
        super(postcode, city, road, houseNumber);
    }

    @Override
    public String toString() {
        return "OMV Frastanz\n" + getPostcode() + " " + getCity() + "\n" + getRoad() + " " + getHouseNumber()+ "\n";
    }

    @Override
    public int getGasStationNumber() {
        return 0;
    }
}


