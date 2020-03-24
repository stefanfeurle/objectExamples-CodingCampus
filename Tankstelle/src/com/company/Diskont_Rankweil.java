package com.company;

public class Diskont_Rankweil extends Gas_Station{
    public Diskont_Rankweil(int postcode, String city, String road, int houseNumber) {
        super(postcode, city, road, houseNumber);
    }

    @Override
    public String toString() {
        return "Diskont Rankweil\n" + getPostcode() + " " + getCity() + "\n" + getRoad() + " " + getHouseNumber()+ "\n";
    }

    @Override
    public int getGasStationNumber() {
        return 2;
    }
}
