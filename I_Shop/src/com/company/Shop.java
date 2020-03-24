package com.company;

import java.util.Random;

public class Shop {
    IPayementOption[] payementsOptionArr = new IPayementOption[4];
    int arrCounter = 0;

    public void addArray(IPayementOption iPayementOption){
        payementsOptionArr[arrCounter] = iPayementOption;
        arrCounter++;
    }
    public void printBill(int number){
        number--;
        String[] productArray = {"Shampoo\t", "Apfel\t", "Klopapier", "Brot\t", "Salami\t"};
        double[] priceArray = {4.50, 1.25, 3.50, 1.00, 2.75};
        Random rand = new Random();
        System.out.println("\n");
        double sum = 0.00;

        for (int i = 0; i < 5; i++) {
            int ammount = rand.nextInt(2) + 1;
            System.out.println("\t" + productArray[i] + "\t\t" + ammount + " x\t\t €  " + String.format("%.2f", (ammount * priceArray[i])));
            sum = sum + ammount * priceArray[i];
        }
        double sum1 = payementsOptionArr[number].payBill(sum);
        if(number == 0) {
            System.out.println("\n\t3 % Kreditkartenaufschlag € " + String.format("%.2f",sum1));
        }
        else if(number == 1) {
            System.out.println("\n\t1 % Skonto\t\t\t\t € " + String.format("%.2f",sum1));
        }
        sum = sum + sum1;

        System.out.println("\t________________________________\n\tGesamt\t\t\t\t\t € " + String.format("%.2f", sum));


         payementsOptionArr[number].payBill(sum);

    }
}
