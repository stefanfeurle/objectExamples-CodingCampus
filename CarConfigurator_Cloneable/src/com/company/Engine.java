package com.company;

public class Engine implements Cloneable{
    String name;
    Fuel fuel;
    int horsePower;
    int displacement;

    public Engine(String name, Fuel fuel, int horsePower, int displacement) {
        this.name = name;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.displacement = displacement;
    }

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

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine)super.clone();
    }

    @Override
    public String toString() {
        return name + " (" + getMyFuelName(fuel) + "): " + horsePower + " PS, " + displacement + " cm³";
    }
}
