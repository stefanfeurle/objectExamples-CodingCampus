package com.company;

public class Pizzeria {
    String name;
    String street;
    String city;
    Person owner;
    Meal[] menuArr = new Meal[30];
    int mealCounter = 0;
    Meal[] orderedPizzaArr =new Meal[10];
    int orderedPizzaCounter = 0;
    Ingredient[] ingredientArr = new Ingredient[15];
    Ingredient [] withoutIngredientsArr = new Ingredient[50];
    int[] withoutIngredientsArrCounter = new int[11];
    int withoutIngredientsCounter = 0;
    Ingredient[] addIngredientsArr = new Ingredient[50];
    int [] addIngredientsArrCounter = new int[11];
    int addIngredientsCounter = 0;

    public Pizzeria(String name, String street, String city, Person owner) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.owner = owner;
    }

    public void addNewMeal(Meal meal) {
        this.menuArr[this.mealCounter] = meal;
        this.mealCounter++;
    }

    public void printMenue() {
        System.out.println("********* " + this.name + " *********");
        for (int i = 0; i < mealCounter; i++) {
            if (menuArr[i] != null) {
                if ((i + 1) < 10) {
                    System.out.print(" " + (i + 1) + ". Pizza ");
                }
                else {
                    System.out.print((i + 1) + ". Pizza ");
                }
                while (this.menuArr[i].name.length() < 16) {
                    this.menuArr[i].name += " ";
                }
                System.out.print(this.menuArr[i].name);
                if (this.menuArr[i].price < 10) {
                    System.out.println("\t\t " + String.format("%.2f", this.menuArr[i].price) + " €");
                }
                else {
                    System.out.println("\t\t" + String.format("%.2f", this.menuArr[i].price) + " €");
                }
            }
        }
        System.out.println("****************************************");
    }

    public void saveOrderedPizza(int menuenumber) {
        menuenumber--;
        this.orderedPizzaArr[orderedPizzaCounter] = this.menuArr[menuenumber];
        int helpCounter = 0;
        for (int i = orderedPizzaArr[orderedPizzaCounter].ingredientsMealCounter-1; i >= 0; i--){
            if (orderedPizzaArr[orderedPizzaCounter].ingredientsArrayMeal[i] != null) {
                ingredientArr[helpCounter] = orderedPizzaArr[orderedPizzaCounter].ingredientsArrayMeal[i];
                helpCounter++;
            }
        }
    }

    public void printIngredientOrderedMeal() {

        System.out.println("Zutaten:");
        for (int i = 0; i < ingredientArr.length; i++){
            if (this.ingredientArr[i] != null) {
                System.out.print((i+1) + ". " + this.ingredientArr[i].name + ", ");
            }
        }
        System.out.println("\b\b");
    }

    public boolean removeIngredient(int removeIngredientArrayNumber) {
        removeIngredientArrayNumber--;
        boolean isremoveIngredient = false;
        Ingredient[] ingredientsHelpArray = new Ingredient[15];
        int helpCounter = 0;
        if (removeIngredientArrayNumber >= 0) {
            this.withoutIngredientsArr[withoutIngredientsCounter] = ingredientArr[removeIngredientArrayNumber];
            withoutIngredientsCounter++;
            ingredientArr[removeIngredientArrayNumber] = null;
            for (int i = 0; i < ingredientArr.length; i++) {
                if (ingredientArr[i] != null) {
                    isremoveIngredient = true;
                    ingredientsHelpArray[helpCounter] = ingredientArr[i];
                    helpCounter++;
                }
            }
            ingredientArr = ingredientsHelpArray;
        }
        return isremoveIngredient;
    }

    public void addIngredient(int addIngredientArrayNumber) {
        addIngredientArrayNumber--;
        addIngredientsArr[addIngredientsCounter] = Ingredient.ingredientArray[addIngredientArrayNumber];
        addIngredientsCounter++;
    }

    public void finishOrder() {
        orderedPizzaCounter++;
        withoutIngredientsArrCounter[orderedPizzaCounter] = withoutIngredientsCounter;
        addIngredientsArrCounter[orderedPizzaCounter] = addIngredientsCounter;
    }

    public void printBill() {
        double sum = 0;
        System.out.println("********** " + this.name + " ***********\n");
        System.out.println("************ R E C H N U N G *************\n\n");
        for (int i = 0; i < orderedPizzaCounter; i++){
            System.out.print((i +1) + ". PIZZA " + orderedPizzaArr[i].name.toUpperCase() +"\t\t");
            System.out.print(orderedPizzaArr[i].price < 10 ? " " : "");
            System.out.println(String.format("%.2f",orderedPizzaArr[i].price) + " €");
            sum += orderedPizzaArr[i].price;
            if (withoutIngredientsArrCounter[i+1] > withoutIngredientsArrCounter[i]) {
                System.out.println("\tEntfernte Zutaten: ");
                for (int j = withoutIngredientsArrCounter[i]; j < withoutIngredientsArrCounter[i + 1]; j++ ) {
                    System.out.println("\t"+ withoutIngredientsArr[j].name);
                }
            }
            if(addIngredientsArrCounter[i+1] > addIngredientsArrCounter[i]) {
                System.out.println("\tHinzugefügte Zutaten: ");
                for (int j = addIngredientsArrCounter[i]; j < addIngredientsArrCounter[i + 1]; j++ ) {
                    while(addIngredientsArr[j].name.length() < 25) {
                        addIngredientsArr[j].name += " ";
                    }
                    System.out.print("\t"+ addIngredientsArr[j].name +"\t");
                    System.out.print(addIngredientsArr[j].price < 10 ? " " : "");
                    System.out.println(String.format("%.2f",addIngredientsArr[j].price) + " €");
                    sum += addIngredientsArr[j].price;
                }
            }
        }
        double priceDeliveryService = deliveryService.priceDelivery(sum);

        System.out.print("\nZustellung      \t\t\t\t");
        System.out.print(priceDeliveryService < 10 ? " " : "");
        System.out.println(String.format("%.2f",priceDeliveryService) + " €");
        sum += priceDeliveryService;
        System.out.println("\n\n-----------------------------------------");
        System.out.println("\nGESAMT\t \t \t \t \t \t \t" + String.format("%.2f", sum) + " €\n\n");
        System.out.println("Lieferadresse:\n" + deliveryService.getRoadInklHouseNumber());
        System.out.println(deliveryService.getPostcode() + "  " + deliveryService.getCity());
        System.out.println(deliveryService.getTelefonNumber());
        System.out.println("Ihr Zustellfahrer:\n" + deliveryService.getDriver().firstname +
                " " + deliveryService.getDriver().lastname);
    }

    DeliveryService deliveryService;
}
