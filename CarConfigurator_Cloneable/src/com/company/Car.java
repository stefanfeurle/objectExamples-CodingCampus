package com.company;

public class Car implements Cloneable {
    String brand;
    String model;
    Engine engine;
    Tire tire;
    Colour colour;
    String serialNumberABC;
    int serialNumberNumber;
    EquipmentPackage equipmentPackage;
    int tankSize;
    boolean hasNavigation;
    String orderedFrom;
    int counter;

    public Car(String brand, String model, Engine engine, Tire tire, Colour colour, String serialNumberABC, int serialNumberNumber,
               EquipmentPackage equipmentPackage, int tankSize, boolean hasNavigation, String orderedFrom) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.tire = tire;
        this.colour = colour;
        this.serialNumberABC = serialNumberABC;
        this.serialNumberNumber = serialNumberNumber;
        this.equipmentPackage = equipmentPackage;
        this.tankSize = tankSize;
        this.hasNavigation = hasNavigation;
        this.orderedFrom = orderedFrom;
    }

    public static String getMyColourName(Colour colour){
        switch (colour){
            case WHITE:
                return "weiss";
            case SILVER:
                return "silber";
            case RED:
                return "rot";
            case BLUE:
                return "blau";
            case BLACK:
                return "schwarz";
            default:
                return "";
        }
    }

    public static String getMyEquipmentPackageName(EquipmentPackage equipmentPackage) {
        switch(equipmentPackage){
            case SILVER:
                return "Silber";
            case GOLD:
                return "Gold";
            case PLATINUM:
                return "Platin";
            case TITANIUM:
                return  "Titan";
            default:
                return "";
        }
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car myClonedCar = (Car)super.clone();
        Tire myClonedTire = this.tire.clone();
        myClonedCar.setTire(myClonedTire);
        Engine myClonedEngine = this.engine.clone();
        myClonedCar.setEngine(myClonedEngine);
        counter++;
        myClonedCar.setSerialNumberNumber(serialNumberNumber + counter);
        return myClonedCar;
    }

    @Override
    public String toString() {
        String output;
        if (hasNavigation) {
            output = brand + ' ' + model + " (Seriennummer: " + serialNumberABC + serialNumberNumber + ")\n" +
                    engine.horsePower + " PS, " + Engine.getMyFuelName(engine.fuel) + " (" +tankSize +
                    " Liter Tankgröße), " + getMyColourName(colour) + "\nAusstattungspaket " +
                    getMyEquipmentPackageName(equipmentPackage) + " inklusive Navigationssystem\n" +
                    Tire.getMyTiresBrandName(tire.tiresBrand) + " Reifen auf " + Tire.getMyRimName(tire.rim) + "-Felgen\n";

        } else {
            output = brand + ' ' + model + " (Seriennummer: " + serialNumberABC + serialNumberNumber + ")\n" +
                    engine.horsePower + " PS, " + Engine.getMyFuelName(engine.fuel) + " (" +tankSize +
                    " Liter Tankgröße), " + getMyColourName(colour) + "\nAusstattungspaket " +
                    getMyEquipmentPackageName(equipmentPackage) + "\n" +
                    Tire.getMyTiresBrandName(tire.tiresBrand) + " Reifen auf " + Tire.getMyRimName(tire.rim) + "-Felgen\n";
        }
        return output;
    }

    public void setHasNavigation(boolean hasNavigation) {
        this.hasNavigation = hasNavigation;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setSerialNumberNumber(int serialNumberNumber) {
        this.serialNumberNumber = serialNumberNumber;
    }

    public void setOrderedFrom(String orderedFrom) {
        this.orderedFrom = orderedFrom;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setEquipmentPackage(EquipmentPackage equipmentPackage) {
        this.equipmentPackage = equipmentPackage;
    }
}
