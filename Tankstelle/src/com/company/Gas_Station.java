package com.company;

public abstract class Gas_Station implements I_FuelOption {
    private int postcode;
    private String city;
    private String road;
    private int houseNumber;
    String[] offeredTypesOfFuelArr = new String[10];
    int arrCounter;

    public Gas_Station(int postcode, String city, String road, int houseNumber) {
        this.postcode = postcode;
        this.city = city;
        this.road = road;
        this.houseNumber = houseNumber;
    }

    public void addOfferedTypesOfFuel(String fuel){
        offeredTypesOfFuelArr[arrCounter] = fuel;
        arrCounter++;
    }

    @Override
    public boolean checkOfferedFuel(String fuelOfCar, boolean isSameFuel) {
        for (String fuel : offeredTypesOfFuelArr) {
            if(fuel != null) {
                if (fuel.equalsIgnoreCase(fuelOfCar)){
                    isSameFuel = true;
                }
            }
        }
        return isSameFuel;
    }

    @Override
    public boolean checkOfferedFuelAndPostcode(String fuelOfCar, int postcodeCar, boolean isSameFuelAndPostcode) {
        for (String fuel : offeredTypesOfFuelArr) {
            if(fuel != null) {
                if (postcodeCar == postcode) {
                    if (fuel.equalsIgnoreCase(fuelOfCar)) {
                        isSameFuelAndPostcode = true;
                    }
                }
            }
        }
        return isSameFuelAndPostcode;
    }

    @Override
    public void refuelCar(String fuelOfCar) {
        for (String fuel : offeredTypesOfFuelArr) {
            if (fuel != null) {
                if (fuel.equalsIgnoreCase(fuelOfCar)) {
                    System.out.println("Voll getankt mit " + fuel + " Power!");
                }
            }
        }
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getRoad() {
        return road;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
