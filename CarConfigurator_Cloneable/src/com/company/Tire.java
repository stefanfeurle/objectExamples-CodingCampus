package com.company;

public class Tire implements Cloneable {
    TiresBrand tiresBrand;
    Rim rim;

    public Tire(TiresBrand tiresBrand, Rim rim) {
        this.tiresBrand = tiresBrand;
        this.rim = rim;
    }

    public static String getMyTiresBrandName(TiresBrand tiresBrand) {
        return "Michelin";
    }

    public static String getMyRimName(Rim rim){
        switch(rim){
            case ALLOY:
                return "Leichtmetall";
            case STEEL:
                return "Stahl";
            default:
                return "";
        }
    }

    @Override
    protected Tire clone() throws CloneNotSupportedException {
        return (Tire)super.clone();
    }

    @Override
    public String toString() {
        return getMyTiresBrandName(tiresBrand) + " Reifen mit " + getMyRimName(rim) + "-Felgen";
    }
}
