package com.company;

public class Tires {

    int tiresLifespan;
    int tiresRestLifespan;
    TiresBrand tiresBrand;
    double price;

    public Tires(TiresBrand tiresBrand, int tiresLifespan, int tiresRestLifespan, double price) {
        this.tiresLifespan = tiresLifespan;
        this.tiresRestLifespan = tiresRestLifespan;
        this.tiresBrand = tiresBrand;
        this.price = price;
    }

    public static String getMyTiresBrandName(TiresBrand tiresBrand){
        switch (tiresBrand){
            case MICHELIN:
                return "Michelin";
            case CONTINENTAL:
                return "Continental";
            case KLEBER:
                return "Kleber";
            default:
                return "";
        }
    }
}
