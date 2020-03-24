package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person franz = new Person("Franz", "Welte", 35000);
        Person eugen = new Person("Eugen", "Netzer", 20000);
        Person bernd = new Person("Bernd", "Pühringer", 20000);
        Person iris = new Person("Iris", "Feurle", 1000);

        Pizzeria casa = new Pizzeria("Pizzeria CASA ANTIKA","Bahnhofstrasse 41", "Götzis", eugen);

        DeliveryService delivery = new DeliveryService("Dacia","Sandero", "Benzin", "FK 428 MF", franz);
        casa.deliveryService = delivery;

        Meal margherita = new Meal("Margherita", 7.50);
        casa.addNewMeal(margherita);

        Meal salami = new Meal("Salami", 8.90);
        casa.addNewMeal(salami);

        Meal dellaNonna = new Meal("Della Nonna", 8.70);
        casa.addNewMeal(dellaNonna);

        Meal diavolo = new Meal("Diavolo", 9.70);
        casa.addNewMeal(diavolo);

        Meal napoli = new Meal("Napoli", 7.90);
        casa.addNewMeal(napoli);

        Meal aglio = new Meal("Aglio",7.80);
        casa.addNewMeal(aglio);

        Meal capricciosa = new Meal("Capricciosa",10.60);
        casa.addNewMeal(capricciosa);

        Meal tonno = new Meal("Thunfisch", 9.90);
        casa.addNewMeal(tonno);

        Meal quattro = new Meal("Quattro Stagioni", 11.10);
        casa.addNewMeal(quattro);

        Meal casaAntica = new Meal("Casa Antica",13.70);
        casa.addNewMeal(casaAntica);

        Meal contadino = new Meal("Contadino", 9.90);
        casa.addNewMeal(contadino);

        Ingredient onion = new Ingredient("Zwiebel", 1);
        Ingredient garlic = new Ingredient("Knoblauch", 1);
        Ingredient mozzarella = new Ingredient("Mozzarella", 1);
        Ingredient paprika = new Ingredient("Paprika", 1);
        Ingredient tomato = new Ingredient("Tomaten", 1);
        Ingredient gorgonzola = new Ingredient("Gorgonzola", 1);
        Ingredient salamiI = new Ingredient("Salami", 1);
        Ingredient olive = new Ingredient("Olive", 1);
        Ingredient anchovy = new Ingredient("Sardellen", 1);
        Ingredient mushroom = new Ingredient("Champignions", 1);
        Ingredient pepperoni = new Ingredient("Pfefferoni",1);
        Ingredient ham = new Ingredient("Schinken", 1);
        Ingredient tonnoI = new Ingredient("Thunfisch", 1);
        Ingredient hijack = new Ingredient("Kapern", 1);
        Ingredient artichoke = new Ingredient("Artischocken", 1);
        Ingredient carpaccio = new Ingredient("Carpaccio", 2.50);
        Ingredient arugula = new Ingredient("Rucola", 1);
        Ingredient parmesan = new Ingredient("Parmesan", 1);
        Ingredient spinach = new Ingredient("Spinat", 1);
        Ingredient egg = new Ingredient("Ei", 1);
        Ingredient corn = new Ingredient("Mais", 1);
        Ingredient shell = new Ingredient("Muscheln", 2);
        Ingredient pineapple = new Ingredient("Ananas", 1);
        Ingredient bacon = new Ingredient("Speck", 1);
        Ingredient funghi = new Ingredient("Pilze", 1);



        margherita.addIngredientMeal(tomato);
        margherita.addIngredientMeal(mozzarella);

        salami.addIngredientMeal(salamiI);
        salami.addIngredientMeal(tomato);
        salami.addIngredientMeal(mozzarella);

        dellaNonna.addIngredientMeal(onion);
        dellaNonna.addIngredientMeal(garlic);
        dellaNonna.addIngredientMeal(mozzarella);
        dellaNonna.addIngredientMeal(paprika);

        diavolo.addIngredientMeal(salamiI);
        diavolo.addIngredientMeal(paprika);
        diavolo.addIngredientMeal(olive);
        diavolo.addIngredientMeal(mozzarella);

        napoli.addIngredientMeal(anchovy);
        napoli.addIngredientMeal(tomato);
        napoli.addIngredientMeal(mozzarella);

        aglio.addIngredientMeal(garlic);
        aglio.addIngredientMeal(tomato);
        aglio.addIngredientMeal(mozzarella);

        capricciosa.addIngredientMeal(pepperoni);
        capricciosa.addIngredientMeal(ham);
        capricciosa.addIngredientMeal(mushroom);
        capricciosa.addIngredientMeal(olive);

        tonno.addIngredientMeal(tonnoI);
        tonno.addIngredientMeal(onion);
        tonno.addIngredientMeal(mozzarella);

        quattro.addIngredientMeal(hijack);
        quattro.addIngredientMeal(artichoke);
        quattro.addIngredientMeal(ham);
        quattro.addIngredientMeal(olive);
        quattro.addIngredientMeal(mushroom);
        quattro.addIngredientMeal(anchovy);

        casaAntica.addIngredientMeal(carpaccio);
        casaAntica.addIngredientMeal(arugula);
        casaAntica.addIngredientMeal(parmesan);

        contadino.addIngredientMeal(egg);
        contadino.addIngredientMeal(spinach);
        contadino.addIngredientMeal(onion);
        contadino.addIngredientMeal(garlic);
        contadino.addIngredientMeal(mozzarella);

        Ingredient.addIngredientsArray(tomato);
        Ingredient.addIngredientsArray(gorgonzola);
        Ingredient.addIngredientsArray(onion);
        Ingredient.addIngredientsArray(salamiI);
        Ingredient.addIngredientsArray(garlic);
        Ingredient.addIngredientsArray(mozzarella);
        Ingredient.addIngredientsArray(paprika);
        Ingredient.addIngredientsArray(olive);
        Ingredient.addIngredientsArray(anchovy);
        Ingredient.addIngredientsArray(pepperoni);
        Ingredient.addIngredientsArray(ham);
        Ingredient.addIngredientsArray(mushroom);
        Ingredient.addIngredientsArray(tonnoI);
        Ingredient.addIngredientsArray(hijack);
        Ingredient.addIngredientsArray(artichoke);
        Ingredient.addIngredientsArray(arugula);
        Ingredient.addIngredientsArray(carpaccio);
        Ingredient.addIngredientsArray(parmesan);
        Ingredient.addIngredientsArray(egg);
        Ingredient.addIngredientsArray(spinach);
        Ingredient.addIngredientsArray(corn);
        Ingredient.addIngredientsArray(shell);
        Ingredient.addIngredientsArray(pineapple);
        Ingredient.addIngredientsArray(bacon);
        Ingredient.addIngredientsArray(funghi);

        Scanner scanNum = new Scanner(System.in);
        Scanner scanText = new Scanner(System.in);

        System.out.println("\n Hier können sie Köstlichkeiten der " + casa.name + " online bestellen!\n");
        int controllNumber = 1;

        while (controllNumber != 0) {
            int menuenumber = 0;

            while (menuenumber < 1 || menuenumber > casa.mealCounter) {
                casa.printMenue();
                System.out.println("\nBitte wählen sie ein Pizza anhand der Nummer aus!\n");
                menuenumber = scanNum.nextInt();
            }
            casa.saveOrderedPizza(menuenumber);
            casa.printIngredientOrderedMeal();

            System.out.println("\nMöchten sie eine der Zutaten entfernen?\nWenn ja, wählen sie eine Nummer aus!\n" +
                    "0 ... keine Zutat entfernen!\n");
            int removeIngredientArrayNumber = scanNum.nextInt();
            boolean isRemoveIngredient = casa.removeIngredient(removeIngredientArrayNumber);

            while (isRemoveIngredient) {
                casa.printIngredientOrderedMeal();
                System.out.println("\nMöchten sie eine weitere Zutat entfernen!\nWenn ja, wählen sie eine Nummer aus!\n" +
                        "0 ... keine Zutat entfernen!\n");
                removeIngredientArrayNumber = scanNum.nextInt();
                isRemoveIngredient = casa.removeIngredient(removeIngredientArrayNumber);
            }

            System.out.println("\nMöchten sie eine Zutat zu ihrer Pizza hinzufügen!\nWenn ja, wählen sie eine Nummer aus!\n 0 ... keine Zutat hinzufügen\n");
            int addIngredientArrayNumber = 1;

            while (addIngredientArrayNumber != 0) {
                Ingredient.printAddIngredientArray();
                System.out.println("\n");
                addIngredientArrayNumber = scanNum.nextInt();

                if(addIngredientArrayNumber > 0) {
                    casa.addIngredient(addIngredientArrayNumber);
                    System.out.println("\n\nMöchten sie  eine  weitere Zutat zu ihrer Pizza hinzufügen!\nWenn ja, wählen sie eine Nummer aus!\n 0 ... keine Zutat hinzufügen\n");
                }
                if (addIngredientArrayNumber == 0) {
                    casa.finishOrder();
                }
            }

            System.out.println("\n\nMöchten sie  eine  weitere Pizza bestellen!\n0 ... nein\n1 ... ja\n");
            controllNumber = scanNum.nextInt();
        }

        if (casa.orderedPizzaCounter > 0) {
            Random rand = new Random();
            int randomnumber = rand.nextInt(3) + 1;
            if (randomnumber == 1) {
                delivery.setDriver(franz);
            }
            else if (randomnumber == 2) {
                delivery.setDriver(iris);
            }
            else if (randomnumber == 3) {
                delivery.setDriver(bernd);
            }
            System.out.println("Danke für ihre Bestellung!\n\nBitte geben sie die Lieferadresse ein!\nBitte den Ort!\n");
            delivery.setCity(scanText.nextLine());
            System.out.println("Bitte die Postleitzahl!");
            delivery.setPostcode(scanNum.nextInt());
            System.out.println("Bitte die Straße und die Hausnummer!");
            delivery.setRoadInklHouseNumber(scanText.nextLine());
            System.out.println("Bitte eine Telefonnummer unter der wir sie jederzeit erreichen!");
            delivery.setTelefonNumber(scanText.nextLine());
            System.out.println("\n\n");
            casa.printBill();
        } else {
            System.out.println("Danke für den Besuch unserer Homepage");
        }
    }
}
