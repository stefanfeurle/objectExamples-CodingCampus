package com.company;

public class Car {
    String brand;
    Person owner;
    Fuel fuel;
    int horsePower;
    int mileage;
    int tankSize;
    double fuelConsumption;
    double fuelLevel;
    int serviceInterval;
    int serviceIntervalCounter;

    public Car(String brand, Person owner, Fuel fuel, int horsePower, int mileage, int tankSize, double fuelConsumption,
               double fuelLevel, int serviceInterval, int serviceIntervalCounter) {
        this.brand = brand;
        this.owner = owner;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.tankSize = tankSize;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.serviceInterval = serviceInterval;
        this.serviceIntervalCounter = serviceIntervalCounter;
    }

    public void drive() {
        int kmCounter = 5;
        if (this.fuelLevel / this.fuelConsumption > kmCounter) {
            this.mileage += kmCounter;
            this.fuelLevel -= kmCounter * fuelConsumption;
            this.tires.tiresRestLifespan -= kmCounter;
            this.serviceIntervalCounter -= kmCounter;
        }
        else{
            System.out.println("Car stopped!");
            int kmCount = (int) (this.fuelLevel / this.fuelConsumption);
            this.mileage += kmCount;
            this.tires.tiresRestLifespan -= kmCount;
            this.fuelLevel = 0;
            this.serviceIntervalCounter -= kmCount;
        }
        if (this.fuelLevel/this.fuelConsumption < 90) {
            System.out.println("Bitte tanken! max. " +  String.format("%.1f", this.fuelLevel/this.fuelConsumption) + " Kilometer");
        }

        if (this.tires.tiresRestLifespan < 1000) {
            System.out.println("DRINGEND REIFENWECHSELN!!");
        }
        else if (this.tires.tiresRestLifespan < 5000) {
            System.out.println("Die Reifen sind bis an die Grenzen der gesetzlichen Vorschriften abgefahren.");
        }
        if (this.serviceIntervalCounter < 10) {
            System.out.println("Dringend eine Werkstatt zum Service besuchen!");
        }
        else if (this.serviceIntervalCounter < 2000) {
            System.out.println("Bitte eine Werkstatt zum Service besuchen!");
        }
    }

    /* FALSCHE RICHTUNG DES PROGRAMMIERENS
    public void goRefuelCar(GasStation gasStation, double liter) {
        gasStation.serviceRefuel(this, liter);
    }

    public void goService(ServiceStation serviceStation) {
        serviceStation.serviceService(this);
    }
    public void goChangeTires(ServiceStation serviceStation, Tires tires) {
        serviceStation.serviceChangeTires(this,tires);
    }
    public void goChangeTiresInkludedService(ServiceStation serviceStation, Tires tires) {
        serviceStation.serviceService(this);
        serviceStation.serviceChangeTires(this, tires);
    }
    */

    Tires tires;

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getFuelLevel() {
        String output = "Im Tank des " + this.brand + " befinden sich noch " + String.format("%.2f", this.fuelLevel) +
                " Liter " + FuelClass.getMyFuelName(this.fuel) +
                "! (ca. " + String.format("%.0f", this.fuelLevel/this.fuelConsumption) + " Kilometer)";
        return output;
    }

    public String getMileage() {
        String output = "Kilometerstand des " + this.brand + ": " + this.mileage + " Kilometer";
        return output;
    }

    public String getTiresRestLifespan() {
        String output = "Mit dem Reifen von " + this.tires.tiresBrand + " kannst du noch ca. " +
                this.tires.tiresRestLifespan + " Kilometer fahren!";
        return output;
    }
}
