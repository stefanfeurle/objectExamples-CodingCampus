package com.company;

public class Car {
    String brand;
    Person owner;
    Tires tires;
    Fuel fuel;
    int horsePower;
    int mileage;
    int tankSize;
    double fuelConsumption;
    double fuelLevel;
    int serviceInterval;
    int serviceIntervalCounter;

    public Car(String brand, Person owner, Tires tires, Fuel fuel, int horsePower, int mileage, int tankSize, double fuelConsumption,
               double fuelLevel, int serviceInterval, int serviceIntervalCounter) {
        this.brand = brand;
        this.owner = owner;
        this.tires = tires;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.tankSize = tankSize;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.serviceInterval = serviceInterval;
        this.serviceIntervalCounter = serviceIntervalCounter;
    }

    public void drive(int kmToDrive) {
        int possibleKmToDrive = kmToDrive;
        if (this.fuelLevel / this.fuelConsumption < possibleKmToDrive) {
            possibleKmToDrive = (int) (this.fuelLevel / this.fuelConsumption);
        }

        // Kontrolllampenschleife, wenn es dir immer noch nicht gefällt, werf ich sie weg
        for (int i = 0; i < possibleKmToDrive; i++) {
            this.mileage++;
            this.tires.tiresRestLifespan--;
            this.fuelLevel -= fuelConsumption;
            this.serviceIntervalCounter--;

            if (i % 10 == 0) {
                if (this.fuelLevel / this.fuelConsumption < 90) {
                    System.out.println("Max. " + String.format("%.1f", this.fuelLevel / this.fuelConsumption) + " Kilometer Tankinhalt");
                }
                if (this.serviceIntervalCounter < 100) {
                    System.out.println("Dringend eine Werkstatt zum Service besuchen!");
                }
            }
            if (i % 100 == 0) {
                if (this.tires.tiresRestLifespan < 2000) {
                    System.out.println("DRINGEND REIFENWECHSELN!!");
                }
                if (this.serviceIntervalCounter < 2000) {
                    System.out.println("Bitte eine Werkstatt zum Service besuchen!");
                }
            }
        }
        if (possibleKmToDrive < kmToDrive) {
            System.out.println("Car stopped! Bitte tanken!");
            fuelLevel = 0;
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

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getFuelLevel() {
        return fuelLevel + " (--> " + String.format("%.0f", this.fuelLevel/this.fuelConsumption) + "km)";
    }

    public String getFuelLevelText() {
        String output = "Im Tank des " + this.brand + " befinden sich noch " + String.format("%.2f", this.fuelLevel) +
                " Liter " + FuelClass.getMyFuelName(this.fuel) +
                "! (ca. " + String.format("%.0f", this.fuelLevel/this.fuelConsumption) + " Kilometer)";
        return output;
    }

    public int getMileage() {
        return mileage;
    }

    public String getMileageText() {
        String output = "Kilometerstand des " + this.brand + ": " + this.mileage + " Kilometer";
        return output;
    }

    public int getTiresRestLifespan(){
        return tires.tiresRestLifespan;
    }

    public String getTiresRestLifespanText() {
        String output = "Mit dem Reifen von " + this.tires.tiresBrand + " kannst du noch ca. " +
                this.tires.tiresRestLifespan + " Kilometer fahren!";
        return output;
    }

    public int getServiceIntervalCounter() {
        return serviceIntervalCounter;
    }

    public String getServiceIntervalCounterText() {
        String output = "Der Service des " + this.brand + " ist in " + serviceIntervalCounter + " Kilometer fällig!";
        return output;
    }
}
