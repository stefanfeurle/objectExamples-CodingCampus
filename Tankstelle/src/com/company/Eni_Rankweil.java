package com.company;

public class Eni_Rankweil extends Gas_Station{
    public Eni_Rankweil(int postcode, String city, String road, int houseNumber) {
        super(postcode, city, road, houseNumber);
    }

    @Override
    public String toString() {
        return "Eni Rankweil\n" + getPostcode() + " " + getCity() + "\n" + getRoad() + " " + getHouseNumber()+ "\n";
    }

    @Override
    public int getGasStationNumber() {
        return 3;
    }
}
