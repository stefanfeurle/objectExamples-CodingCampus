package com.company;

public class Main {

    public static void main(String[] args) {

        Tires m1 = new Tires(TiresBrand.MICHELLIN,30000, 10000,655);
        Tires c1 = new Tires(TiresBrand.CONTINENTAL,28000, 28000,550);
        Tires k1 = new Tires(TiresBrand.KLEBER, 25000, 22000,450);

        Person franz = new Person("Franz", "Welte", 10000);
        Person eugen = new Person("Eugen", "Netzer", 20000);
        Person bernd = new Person("Bernd", "Pühringer", 600);

        GasStation netzer = new GasStation(eugen, "NETZER", 200);

        ServiceStation mbp = new ServiceStation(bernd, "MBP", 200);

        Car bmw = new Car("BMW X5", franz,Fuel.DIESEL, 390, 0, 70, 0.08,
                15, 20000, 20000);
        bmw.setTires(m1);

        Car kia = new Car("KIA Ceed", bernd, Fuel.PETROL, 120, 50000, 50,
                0.06,25,30000, 10000);

        for (int i = 0; i < 40; i++) {
            bmw.drive();
            if(bmw.fuelLevel == 0){
                break;
            }
        }
        System.out.println();
        System.out.println(bmw.getMileage());
        System.out.println(bmw.getFuelLevel());
        System.out.println(bmw.getTiresRestLifespan());
        System.out.println();

        netzer.serviceRefuel(bmw, 150);
        netzer.serviceRefuel(bmw,20);

        System.out.println(bmw.getFuelLevel());
        System.out.println();

        mbp.serviceService(bmw);
        System.out.println();

        mbp.serviceChangeTires(bmw, c1);

        System.out.println();
        kia.setTires(m1);

        for (int i = 0; i < 40; i++) {
            kia.drive();
            if(bmw.fuelLevel == 0){
                break;
            }
        }
        mbp.serviceChangeTiresInkludedService(kia, k1);
        System.out.println();
        netzer.serviceRefuel(kia,50);
    }
}
