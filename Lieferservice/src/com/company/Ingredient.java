package com.company;

public class Ingredient {
    String name;
    double price;
    static Ingredient [] ingredientArray = new Ingredient[50];
    static int ingredientCounter;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void addIngredientsArray (Ingredient ingredient){
        ingredientArray[ingredientCounter] = ingredient;
        ingredientCounter++;
    }

    public static void printAddIngredientArray() {
        for (int i = 0; i < ingredientCounter; i++){
            String name = ingredientArray[i].name;
            while (name.length() < 16) {
                name += " ";
            }
            if ((i+1) < 10){
                System.out.print(" ");
            }
            System.out.print((i+1) + ". " + name + "\t" + String.format("%.2f",ingredientArray[i].price) + " €\t");
            if((i + 1) % 3 == 0){
                System.out.println();
            }
        }
    }
}
