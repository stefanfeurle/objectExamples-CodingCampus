package com.company;

public class GasStation {
    Person owner;
    String name;
    double cash;

    public GasStation(Person owner, String name, double cash) {
        this.owner = owner;
        this.name = name;
        this.cash = cash;
    }

    public void serviceRefuel(Car car, double liter) {
        double price = FuelClass.getMyFuelPrice(car.fuel);;
        String myFuelName = FuelClass.getMyFuelName(car.fuel);

        if (liter <= 0) {
            liter = 0;
        }
        else if ((car.fuelLevel + liter) > car.tankSize) {
            liter = car.tankSize - car.fuelLevel;
            if (liter == 0) {
                System.out.println("Der Tank des " + car.brand + " ist schon voll!");
            }
        }
        if (price * liter > car.owner.cash) {
            liter = car.owner.cash / price;
            if (liter == 0) {
                System.out.println("Sie haben kein Geld um Treibstoff zu kaufen!");
            }
            else if (liter > 0) {
                System.out.println("Sie können nicht so viel tanken, weil sie nicht so viel Geld dabei haben!");
            }
        }
        if (liter > 0) {
            car.fuelLevel += liter;
            car.owner.cash -= (liter * price);
            this.cash += liter * price;
            System.out.println("Die Tankstelle " + this.name + " hat für " + String.format("%.2f", liter) + " Liter " + myFuelName + " " +
                    String.format("%.2f", liter * price) + " € von " + car.owner.firstname + " " + car.owner.lastname + " verlangt!");
        }
    }
}
