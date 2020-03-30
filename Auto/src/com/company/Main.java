package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Tires michelin = new Tires(TiresBrand.MICHELIN,30000, 10000,655);
        Tires continental = new Tires(TiresBrand.CONTINENTAL,28000, 28000,550);
        Tires kleber = new Tires(TiresBrand.KLEBER, 25000, 22000,450);

        Person franz = new Person("Franz", "Welte", 10000);
        Person eugen = new Person("Eugen", "Netzer", 20000);
        Person bernd = new Person("Bernd", "Pühringer", 2000);

        GasStation netzer = new GasStation(eugen, "NETZER", 200);

        ServiceStation mbp = new ServiceStation(bernd, "MBP", 200);

        Car bmw = new Car("BMW X5", franz, michelin, Fuel.DIESEL, 390, 0, 70, 0.08,
                15, 20000, 20000);

        Car kia = new Car("KIA Ceed", bernd, kleber,  Fuel.PETROL, 120, 50000, 50,
                0.06,25,30000, 10000);

        File carFile = new File("C:\\Users\\DCV\\stefan\\IdeaProjects\\CodingCampus\\Objekte\\Auto.txt");
        try {
            FileWriter fileWriter = new FileWriter(carFile);
            fileWriter.write("Vorname;Zuname;Auto;Art von Kosten;Kosten");
            fileWriter.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }

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

        netzer.serviceRefuel(bmw, 150);
        netzer.serviceRefuel(bmw,20);

        System.out.println(bmw.getFuelLevel());

        mbp.makeService(bmw);

        mbp.changeTires(bmw, continental);

        kia.drive(400);

        mbp.changeTiresAndMakeService(kia, kleber);
        netzer.serviceRefuel(kia,50);
    }
}
