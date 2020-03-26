package com.company;

public class FuelClass {
    public static String getMyFuelName(Fuel fuel){
        switch (fuel){
            case DIESEL:
                return "Diesel";
            case PETROL:
                return "Benzin";
            default:
                return "";
        }
    }

    public static double getMyFuelPrice(Fuel fuel){
        switch (fuel){
            case DIESEL:
                return 1.08;
            case PETROL:
                return 1.20;
            default:
                return 0;
        }
    }
}
