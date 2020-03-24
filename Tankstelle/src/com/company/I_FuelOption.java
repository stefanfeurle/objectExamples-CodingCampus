package com.company;

public interface I_FuelOption {
    int getGasStationNumber();
    boolean checkOfferedFuel(String fuelOfCar, boolean isSameFuel);
    boolean checkOfferedFuelAndPostcode(String fuelOfCar, int postcode, boolean isSameFuelAndPostcode);
    void refuelCar(String fuelOfCar);
    int getPostcode();
    String getCity();
    String getRoad();
    int getHouseNumber();
}
