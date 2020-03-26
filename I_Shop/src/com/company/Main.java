package com.company;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        IPayementOption[] payementsOptionArr = new IPayementOption[4];
        CreditCard creditCard = new CreditCard();
        creditCard.shop = shop;
        Bar bar = new Bar();
        bar.shop =shop;
        OnBill onBill = new OnBill();
        onBill.shop = shop;
        ATMCard atmCard = new ATMCard();
        atmCard.shop = shop;
        Scanner scanNum = new Scanner(System.in);

        payementsOptionArr[0] = creditCard;
        payementsOptionArr[1] = bar;
        payementsOptionArr[2] = onBill;
        payementsOptionArr[3] = atmCard;

        System.out.println("\nDanke für ihren Einkauf! Wie möchten sie bezahlen?\n");

        for (int i = 0; i < payementsOptionArr.length; i++) {
            shop.addArray(payementsOptionArr[i]);
            System.out.println((i + 1) + ". " + payementsOptionArr[i]);
            payementsOptionArr[i].init(shop);
        }

        System.out.println();
        int controllNumber = 0;
        while (controllNumber < 1 || controllNumber > payementsOptionArr.length) {
            controllNumber = scanNum.nextInt();
        }
        shop.printBill(controllNumber);
        System.out.println();
        atmCard.shop = shop;

    }
            }
