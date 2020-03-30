package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tire michelinWithSteelRim = new Tire(TiresBrand.MICHELIN, Rim.STEEL);
        Tire michelinWithAlloyRim = new Tire(TiresBrand.MICHELIN, Rim.ALLOY);

        Engine engine100Petrol = new Engine("1.0 T-GDI", Fuel.PETROL, 100, 998);
        Engine engine140Petrol = new Engine("1.4 T-GDI", Fuel.PETROL, 140, 1353);
        Engine engine116Diesel = new Engine("1.6 CRDi DCT7", Fuel.DIESEL, 116, 1598);
        Engine engine136Diesel = new Engine("1.6 CRDi MT6", Fuel.DIESEL, 136, 1598);

        Car kia = new Car("KIA", "Ceed Kombi", engine116Diesel, michelinWithSteelRim, Colour.WHITE,
                "KCK ", 10478, EquipmentPackage.SILVER,  50,
                true, "KIA Maier");

        ArrayList<Car> orderArrL = new ArrayList<>();
        orderArrL.add(kia);
        Scanner scanNum = new Scanner(System.in);

        System.out.println("\nSie interessieren sich für folgendes unserer Autos!\n\n" + kia);
        System.out.println("Mit ein paar Klicks können sie ihn bestellen!");

        int controlNumber = 1;
        while (controlNumber != 2) {
            boolean correctInput = false;
            int hasNavigationNumber = 0;
            while (!correctInput) {
                try {
                    while (hasNavigationNumber < 1 || hasNavigationNumber > 2) {
                        System.out.println("\nMöchten sie ein eingebautes Navigationsgerät!\n1. ... ja\n2. ... nein\n");
                        hasNavigationNumber = scanNum.nextInt();
                        correctInput = true;
                    }
                } catch (InputMismatchException ignored) {
                    System.out.println("Da ist ihnen eine falsche Eingabe passiert!");
                    scanNum = new Scanner(System.in);
                }
            }

            correctInput = false;
            int colourNumber = 0;
            while (!correctInput) {
                try {
                    while (colourNumber < 1 || colourNumber > 5) {
                        System.out.println("\nWelche Farbe sollte ihre Auto haben?");
                        System.out.println("1. ... weiss\n2. ... silber\n3. ... rot\n4. ... schwarz\n5. ... blau\n");
                        colourNumber = scanNum.nextInt();
                        correctInput = true;
                    }
                } catch (InputMismatchException ignored) {
                    System.out.println("Da ist ihnen eine falsche Eingabe passiert!");
                    scanNum = new Scanner(System.in);
                }
            }

            /*correctInput = false;
            int engineNumber = 0;
             while (!correctInput) {
                 try {
                     while (engineNumber < 1 || engineNumber > 4) {
                         System.out.println("\nFür welchen Antrieb entscheiden sie sich?\n1. ... " + engine100Petrol + "\n2. ... "
                                 + engine140Petrol + "\n3. ... " + engine116Diesel + "\n4. ... " + engine136Diesel + "\n");
                         engineNumber = scanNum.nextInt();
                         correctInput = true;
                     }
                 } catch (InputMismatchException ignored) {
                     System.out.println("Da ist ihnen eine falsche Eingabe passiert!");
                     scanNum = new Scanner(System.in);
                 }
             }


            correctInput = false;
            int tireNumber = 0;
            while (!correctInput) {
                try {
                    while (tireNumber < 1 || tireNumber > 2) {
                        System.out.println("Für welche Felge entscheiden sie sich?");
                        System.out.println("1. ... " + michelinWithAlloyRim + "\n2. ... " + michelinWithSteelRim + "\n");
                        tireNumber = scanNum.nextInt();
                        correctInput = true;
                    }
                } catch (InputMismatchException ignored) {
                    System.out.println("Da ist ihnen eine falsche Eingabe passiert!");
                    scanNum = new Scanner(System.in);
                }
            }*/

            correctInput = false;
            int equipmentNumber = 0;
            while (!correctInput) {
                try {
                    while (equipmentNumber < 1 || equipmentNumber > 4) {
                        System.out.println("Welche unserer Ausstattungsvarianten wählen sie?");
                        System.out.println("1. ... Titan\n2. ... Silber\n3. ... Gold\n4. ... Platin");
                        equipmentNumber = scanNum.nextInt();
                        correctInput = true;
                    }
                } catch (InputMismatchException ignored) {
                    System.out.println("Da ist ihnen eine falsche Eingabe passiert!");
                    scanNum = new Scanner(System.in);
                }
            }

            Scanner scanText = new Scanner(System.in);
            System.out.println("\nBitte geben sie ihren Namen ein!\n");
            String name = scanText.nextLine();

            try {
                Car myNewKia = kia.clone();
                if (hasNavigationNumber == 1) {
                    myNewKia.setHasNavigation(true);
                } else {
                    myNewKia.setHasNavigation(false);
                }

                if (colourNumber == 1) {
                    myNewKia.setColour(Colour.WHITE);
                } else if (colourNumber == 2) {
                    myNewKia.setColour(Colour.SILVER);
                } else if (colourNumber == 3) {
                    myNewKia.setColour(Colour.RED);
                } else if (colourNumber == 4) {
                    myNewKia.setColour(Colour.BLACK);
                } else {
                    myNewKia.setColour(Colour.BLUE);
                }

                //wenn diese Zeilen aktiviert werden, kann ich im Car die Zeilen 67 - 70 deaktivieren!?!
                /*if (tireNumber == 1) {
                    Tire myClonedTire = new Tire(TiresBrand.MICHELIN,Rim.ALLOY);
                    myNewKia.setTire(myClonedTire);
                } else {
                    Tire myClonedTire = new Tire(TiresBrand.MICHELIN,Rim.STEEL);
                    myNewKia.setTire(myClonedTire);
                }

                if (engineNumber == 1) {
                    Engine myClonedEngine = new Engine("1.0 T-GDI", Fuel.PETROL,100,998);
                    myNewKia.setEngine(myClonedEngine);
                } else if (engineNumber == 2) {
                    Engine myClonedEngine = new Engine("1.4 T-GDI", Fuel.PETROL,140,1353);
                    myNewKia.setEngine(myClonedEngine);
                } else if (engineNumber == 3) {
                    Engine myClonedEngine = new Engine("1.6 CRDi DCT7", Fuel.DIESEL,116,1598);
                    myNewKia.setEngine(myClonedEngine);
                } else {
                    Engine myClonedEngine = new Engine("1.6 CRDi MT6", Fuel.DIESEL,136,1598);
                    myNewKia.setEngine(myClonedEngine);
                }*/

                if (equipmentNumber == 1) {
                    myNewKia.setEquipmentPackage(EquipmentPackage.TITANIUM);
                } else if (equipmentNumber == 2) {
                    myNewKia.setEquipmentPackage(EquipmentPackage.SILVER);
                } else if (equipmentNumber == 3) {
                    myNewKia.setEquipmentPackage(EquipmentPackage.GOLD);
                } else {
                    myNewKia.setEquipmentPackage(EquipmentPackage.PLATINUM);
                }

                myNewKia.setOrderedFrom(name);
                orderArrL.add(myNewKia);
                System.out.println("\nWir gratulieren ihnen " + name.toUpperCase() + " zu ihrer Wahl!\n\n" + myNewKia);
            } catch (CloneNotSupportedException ex) {
                ex.getMessage();
            }
            correctInput = false;
            controlNumber = 0;
            while (!correctInput) {
                try {
                    while (controlNumber < 1 || controlNumber > 2) {
                        System.out.println("Möchten Sie ein weiteres Auto bestellen!\n1. ... ja\n2. ... nein\n");
                        controlNumber = scanNum.nextInt();
                        correctInput = true;
                    }
                } catch (InputMismatchException ignored) {
                    System.out.println("Da ist ihnen eine falsche Eingabe passiert!");
                    scanNum = new Scanner(System.in);
                }
            }
        }
        System.out.println();
    }
}
