package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
            System.out.println("\nCar stopped! Bitte tanken!");
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
    public void goChangeTiresIncludedService(ServiceStation serviceStation, Tires tires) {
        serviceStation.serviceService(this);
        serviceStation.serviceChangeTires(this, tires);
    }
    */
    public void writeInFile(Car car, String kindOfCosts, double price) {
        BigDecimal bigDecimal = new BigDecimal(price);
        BigDecimal bdPrice = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        File carFile = new File("C:\\Users\\DCV\\stefan\\IdeaProjects\\CodingCampus\\Objekte\\Auto.txt");
        try {
            FileWriter fileWriter = new FileWriter(carFile, true);
            fileWriter.write("\n" + car.owner.firstName + ';' + car.owner.lastName + ';' + car + ';' + kindOfCosts + ';' + bdPrice);
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.brand;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getFuelLevel() {
        return fuelLevel + " (--> " + String.format("%.0f", this.fuelLevel/this.fuelConsumption) + "km)";
    }

    public String getFuelLevelText() {
        return "Im Tank des " + this.brand + " befinden sich noch " + String.format("%.2f", this.fuelLevel) +
                " Liter " + FuelClass.getMyFuelName(this.fuel) +
                "! (ca. " + String.format("%.0f", this.fuelLevel/ this.fuelConsumption) + " Kilometer)";
    }

    public int getMileage() {
        return mileage;
    }

    public String getMileageText() {
        return "Kilometerstand des " + this.brand + ": " + this.mileage + " Kilometer";
    }

    public int getTiresRestLifespan(){
        return tires.tiresRestLifespan;
    }

    public String getTiresRestLifespanText() {
        return "Mit dem Reifen von " + this.tires.tiresBrand + " kannst du noch ca. " +
                this.tires.tiresRestLifespan + " Kilometer fahren!";
    }

    public int getServiceIntervalCounter() {
        return serviceIntervalCounter;
    }

    public String getServiceIntervalCounterText() {
        return "Der Service des " + this.brand + " ist in " + serviceIntervalCounter + " Kilometer fällig!";
    }
}
