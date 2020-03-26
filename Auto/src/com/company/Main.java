package com.company;

public class Main {

    public static void main(String[] args) {

        Tires michelin1 = new Tires(TiresBrand.MICHELIN,30000, 10000,655);
        Tires continental1 = new Tires(TiresBrand.CONTINENTAL,28000, 28000,550);
        Tires kleber1 = new Tires(TiresBrand.KLEBER, 25000, 22000,450);

        Person franz = new Person("Franz", "Welte", 10000);
        Person eugen = new Person("Eugen", "Netzer", 20000);
        Person bernd = new Person("Bernd", "Pühringer", 2000);

        GasStation netzer = new GasStation(eugen, "NETZER", 200);

        ServiceStation mbp = new ServiceStation(bernd, "MBP", 200);

        Car bmw = new Car("BMW X5", franz, michelin1, Fuel.DIESEL, 390, 0, 70, 0.08,
                15, 20000, 20000);

        Car kia = new Car("KIA Ceed", bernd,michelin1,  Fuel.PETROL, 120, 50000, 50,
                0.06,25,30000, 10000);

        System.out.println("\nWieviele Kilometer möchten sie mit dem " + bmw + " fahren!");

        bmw.drive(1200);

        System.out.println();
        System.out.println(bmw.getFuelLevel());
        System.out.println(bmw.getMileage());
        System.out.println(bmw.getServiceIntervalCounter());
        System.out.println(bmw.getTiresRestLifespan());
        System.out.println();
        System.out.println(bmw.getFuelLevelText());
        System.out.println(bmw.getMileageText());
        System.out.println(bmw.getServiceIntervalCounterText());
        System.out.println(bmw.getTiresRestLifespanText());
        System.out.println();

        netzer.serviceRefuel(bmw, 150);
        netzer.serviceRefuel(bmw,20);

        System.out.println(bmw.getFuelLevel());
        System.out.println();

        mbp.makeService(bmw);
        System.out.println();

        mbp.changeTires(bmw, continental1);

        System.out.println();

        kia.drive(500);

        mbp.changeTiresAndMakeService(kia, kleber1);
        System.out.println();
        netzer.serviceRefuel(kia,50);
    }
}
