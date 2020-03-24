package com.company;

public class GasStationSearchEngine {
    String name;
    I_FuelOption[] gasStationOptionArr = new I_FuelOption[20];
    int arrCounter;
    Person person;

    public GasStationSearchEngine(String name) {
        this.name = name;
    }

    public void addGasStationOptionArr(I_FuelOption IFuelOption) {
        gasStationOptionArr[arrCounter] = IFuelOption;
        arrCounter++;
    }
    public int  searchGasStation(String fuelOfCar) {
        boolean isSameFuel = false;
        int number = -1;
        for (I_FuelOption gasStation:gasStationOptionArr) {
            if (gasStation != null) {
                isSameFuel = gasStation.checkOfferedFuel(fuelOfCar, isSameFuel);
                if (isSameFuel) {
                    number = gasStation.getGasStationNumber();
                    break;
                }
            }
        }
        return number;
    }
    public int  searchGasStation(String fuelOfCar, int postcode) {
        boolean isSameFuelAndPostcode = false;
        int number = -1;
        for (I_FuelOption gasStation:gasStationOptionArr) {
            if (gasStation != null) {
                isSameFuelAndPostcode = gasStation.checkOfferedFuelAndPostcode(fuelOfCar, postcode, isSameFuelAndPostcode);
                if (isSameFuelAndPostcode) {
                    number = gasStation.getGasStationNumber();
                    break;
                }
            }
        }
        if (!isSameFuelAndPostcode) {
            number = searchGasStation(fuelOfCar);
        }
        return number;
    }

}
