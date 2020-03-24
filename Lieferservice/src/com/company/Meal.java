package com.company;

public class Meal {
    String name;
    double price;
    Ingredient [] ingredientsArrayMeal = new Ingredient[15];
    int ingredientsMealCounter;

    public Meal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addIngredientMeal(Ingredient ingredient) {
        this.ingredientsArrayMeal[this.ingredientsMealCounter] = ingredient;
        this.ingredientsMealCounter++;
    }
}
