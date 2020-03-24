package com.company;

public class OMV_Feldkirch extends Gas_Station {
    public OMV_Feldkirch(int postcode, String city, String road, int houseNumber) {
        super(postcode, city, road, houseNumber);
    }

    @Override
    public String toString() {
        return "OMV_Feldkirch\n" + getPostcode() + " " + getCity() + "\n" + getRoad() + " " + getHouseNumber()+ "\n";
    }

    @Override
    public int getGasStationNumber() {
        return 1;
    }
}
