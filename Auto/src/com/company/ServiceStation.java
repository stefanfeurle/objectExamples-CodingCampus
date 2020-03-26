package com.company;

public class ServiceStation {
    Person owner;
    String name;
    double cash;

    public ServiceStation(Person owner, String name, double cash) {
        this.owner = owner;
        this.name = name;

        this.cash = cash;
    }

    public void makeService(Car car) {
        double price = getMyServicPrice(car.fuel);
        if (car.owner.cash < price) {
            System.out.println("Sie haben zu wenig Geld für den Service!");
        }else {
            car.owner.cash -= price;
            this.cash += price;
            System.out.println("Der Service des " + car.brand + " hat gekostet " + String.format("%.2f",price) + " €!");

            car.serviceIntervalCounter = car.serviceInterval;
        }
    }

    public void changeTires(Car car, Tires tires) {
        if (car.owner.cash < tires.price) {
            System.out.println("Sie haben zu wenig Geld für die neuen Reifen!");
        }else {
            car.setTires(tires);
            car.owner.cash -= tires.price;
            this.cash += tires.price;
            System.out.println("Auf dem " + car.brand + " sind neue Reifen " + Tires.getMyTiresBrandName(tires.tiresBrand)
                    + "  für " + String.format("%.2f", tires.price) + " €!");
        }
    }

    public void changeTiresAndMakeService(Car car, Tires tires){
        makeService(car);
        changeTires(car,tires);
    }
    public static double getMyServicPrice(Fuel fuel) {
        switch (fuel){
            case DIESEL:
                return 590;
            case PETROL:
                return 490;
            default:
                return 0;
        }
    }
}
