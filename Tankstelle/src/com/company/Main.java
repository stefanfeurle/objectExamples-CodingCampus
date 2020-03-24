package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OMV_Frastanz omvFrastanz = new OMV_Frastanz(6820, "Frastanz", "Feldkircherstraße", 47);
        omvFrastanz.addOfferedTypesOfFuel("Super95");
        omvFrastanz.addOfferedTypesOfFuel("Diesel");
        omvFrastanz.addOfferedTypesOfFuel("Erdgas");
        omvFrastanz.addOfferedTypesOfFuel("Elektro");
        omvFrastanz.addOfferedTypesOfFuel("MaxxMotion Super 100plus");
        omvFrastanz.addOfferedTypesOfFuel("MaxxMotion Diesel");

        OMV_Feldkirch omvFeldkirch = new OMV_Feldkirch(6804, "Feldkirch", "Königshofstraße", 61);
        omvFeldkirch.addOfferedTypesOfFuel("Super95");
        omvFeldkirch.addOfferedTypesOfFuel("Diesel");
        omvFeldkirch.addOfferedTypesOfFuel("MaxxMotion Super 100plus");
        omvFeldkirch.addOfferedTypesOfFuel("MaxxMotion Diesel");

        Diskont_Rankweil diskontRankweil = new Diskont_Rankweil(6830, "Rankweil", "St. Anna Weg", 23);
        diskontRankweil.addOfferedTypesOfFuel("Super95");
        diskontRankweil.addOfferedTypesOfFuel("Diesel");

        Eni_Rankweil eniRankweil = new Eni_Rankweil(6830,"Rankweil", "Langgasse", 119);
        eniRankweil.addOfferedTypesOfFuel("Super95");
        eniRankweil.addOfferedTypesOfFuel("Diesel");
        eniRankweil.addOfferedTypesOfFuel("Erdgas");

        VKW_Rankweil vkwRankweil = new VKW_Rankweil(6830,"Rankweil", "Ringstraße", 25);
        vkwRankweil.addOfferedTypesOfFuel("Elektro");

        VKW_Meiningen vkwMeiningen = new VKW_Meiningen(6812, "Meiningen", "Schweizerstraße", 58);
        vkwMeiningen.addOfferedTypesOfFuel("Elektro");

        I_FuelOption[] gasStationOptionArr = new I_FuelOption[20];
        gasStationOptionArr[0] = omvFrastanz;
        gasStationOptionArr[1] = omvFeldkirch;
        gasStationOptionArr[2] = diskontRankweil;
        gasStationOptionArr[3] = eniRankweil;
        gasStationOptionArr[4] = vkwRankweil;
        gasStationOptionArr[5] = vkwMeiningen;

        GasStationSearchEngine gasStationSearchEngine = new GasStationSearchEngine("Mein Tankstellenfinder");

        for (I_FuelOption gasStation:gasStationOptionArr) {
            gasStationSearchEngine.addGasStationOptionArr(gasStation);
        }

        Person louis = new Person("Louis", "Tries", "VW Golf", "Elektro");
        Person bernhard = new Person("Bernhard", "Kiechle", "Audi", "Super95");

        louis.gasStationSearchEngine = gasStationSearchEngine;
        bernhard.gasStationSearchEngine = gasStationSearchEngine;

        System.out.println("\n" + louis.getFirstName() + " sucht eine Tankstelle!\n");
        int gasStationNumber = louis.gasStationSearchEngine.searchGasStation(louis.getFuelOfCar());
        System.out.println(gasStationOptionArr[gasStationNumber]);
        gasStationOptionArr[gasStationNumber].refuelCar(louis.getFuelOfCar());

        System.out.println("\n" + bernhard.getFirstName() + " sucht eine Tankstelle!\n");
        gasStationNumber = bernhard.gasStationSearchEngine.searchGasStation(bernhard.getFuelOfCar());
        System.out.println(gasStationOptionArr[gasStationNumber]);
        gasStationOptionArr[gasStationNumber].refuelCar(bernhard.getFuelOfCar());

        System.out.println("\nDu hast Louis sein Auto ausgeliehen. Du solltest tanken.");
        System.out.println("Wo befindest du dich? Gib bitte eine Postleitzahl ein!");
        System.out.println("z.B.: 6830 Rankweil, 6804 Feldkirch, 6812 Meiningen, 6820 Frastanz\n");
        Scanner scanNum = new Scanner(System.in);
        int postcode = scanNum.nextInt();

        System.out.println();
        gasStationNumber = louis.gasStationSearchEngine.searchGasStation(louis.getFuelOfCar(),postcode);
        System.out.println(gasStationOptionArr[gasStationNumber]);
        gasStationOptionArr[gasStationNumber].refuelCar(louis.getFuelOfCar());
       }
}
