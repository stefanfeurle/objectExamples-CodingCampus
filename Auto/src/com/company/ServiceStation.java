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

    public void serviceService(Car car) {
        double price = FuelClass.getMyServicPrice(car.fuel);
        if (car.owner.cash < price) {
            System.out.println("Sie haben zu wenig Geld für den Service!");
        }else {
            car.owner.cash -= price;
            this.cash += price;
            System.out.println("Der Service des " + car.brand + " hat gekostet " + String.format("%.2f",price) + " €!");

            car.serviceIntervalCounter = car.serviceInterval;
        }
    }

    public void serviceChangeTires(Car car, Tires tires) {
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

    public void serviceChangeTiresInkludedService(Car car, Tires tires){
        serviceService(car);
        serviceChangeTires(car,tires);
    }
}
